package com.gralliams.notekeeper

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class NoteListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
        setSupportActionBar(findViewById(R.id.toolbar))

        var listNotes = findViewById<ListView>(R.id.listNotes)
        listNotes.adapter = ArrayAdapter<NoteInfo>(this,
            android.R.layout.simple_list_item_1,
            DataManager.notes)


        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
        var activityIntent = Intent(this, MainActivity::class.java)
            startActivity(activityIntent)



        }
    }
}