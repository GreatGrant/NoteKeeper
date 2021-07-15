package com.gralliams.notekeeper

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.ui.AppBarConfiguration
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_note_item.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.content_note_list.*

class NoteItemActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


  private val noteLayoutManager by lazy { LinearLayoutManager(this) }

    private val noteRecyclerAdapter by lazy { NoteRecyclerAdapter(this, DataManager.notes) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_item)
        setSupportActionBar(toolbar)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener {
            startActivity(Intent(this, NoteActivity::class.java))
        }

        recyclerViewItems.layoutManager = noteLayoutManager
        recyclerViewItems.adapter = noteRecyclerAdapter


        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.drawer_open,
                R.string.drawer_close)

        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.note_item, menu)
        return true
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_notes -> handleSelection("You clicked home")
            R.id.nav_courses -> handleSelection("Gallery clicked")
                R.id.nav_share -> handleSelection("Slide clicked")
        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun handleSelection(text: String) {
        Snackbar.make(recyclerViewItems, text, Snackbar.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()

        //Get reference to adapter
        recyclerViewItems.adapter?.notifyDataSetChanged()
    }

    override fun onBackPressed() {

        if (drawer_layout.isDrawerOpen(GravityCompat.START))
        drawer_layout.closeDrawer(GravityCompat.START)
        else
            super.onBackPressed()
    }
}