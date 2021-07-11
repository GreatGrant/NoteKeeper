package com.gralliams.notekeeper

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_note_list.*
import kotlinx.android.synthetic.main.content_note_list.*
class NoteListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
        setSupportActionBar(findViewById(R.id.toolbar))



        fab.setOnClickListener {
            val activityIntent = Intent(this, NoteActivity::class.java)
            startActivity(activityIntent)
        }

        fab.setOnClickListener { startActivity(Intent(this, NoteActivity::class.java)) }
            recyclerViewItems.layoutManager = LinearLayoutManager(this)
        recyclerViewItems.adapter = NoteRecyclerAdapter(this, DataManager.notes)


        }

    override fun onResume() {
        super.onResume()

        //Get reference to adapter
        recyclerViewItems.adapter?.notifyDataSetChanged()
    }
    }


