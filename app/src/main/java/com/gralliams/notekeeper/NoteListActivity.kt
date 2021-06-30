package com.gralliams.notekeeper

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_note_list.*
import kotlinx.android.synthetic.main.content_note_list.*
class NoteListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
        setSupportActionBar(findViewById(R.id.toolbar))



        fab.setOnClickListener {
            val activityIntent = Intent(this, MainActivity::class.java)
            startActivity(activityIntent)
        }

            listNotes.adapter = ArrayAdapter(this,
                    android.R.layout.simple_list_item_1,
                    DataManager.notes)


            listNotes.setOnItemClickListener { parent, view, position, id ->
             val activityIntent = Intent(this, MainActivity::class.java)
             activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
                 startActivity(activityIntent)


        }
    }

}

