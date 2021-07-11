package com.gralliams.notekeeper

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
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
            list_item.layoutManager = LinearLayoutManager(this)
        list_item.adapter = NoteRecyclerAdapter(this, DataManager.notes)
//            listNotes.adapter = ArrayAdapter(this,
//                    android.R.layout.simple_list_item_1,
//                    DataManager.notes)
//
//
//            listNotes.setOnItemClickListener { parent, view, position, id ->
//             val activityIntent = Intent(this, NoteActivity::class.java)
//             activityIntent.putExtra(NOTE_POSITION, position)
//                 startActivity(activityIntent)


        }
    }


