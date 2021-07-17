package com.gralliams.notekeeper

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class CourseRecyclerAdapter(private val context: Context, private val courses: List<CourseInfo>) :
    RecyclerView.Adapter<CourseRecyclerAdapter.ViewHolder>() {

    private val layoutInflater = LayoutInflater.from(context)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.courselist_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val course = courses[position]
        holder.textCourse?.text = course.title
//        holder.textTitle?.text = note.title

        //Make coursePosition in ViewHolder class = course current position
        holder.coursePosition = position

    }

    override fun getItemCount() = courses.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var textCourse = itemView.findViewById<TextView?>(R.id.textCourse)

        var coursePosition = 0
        var courseTitle = null

        init {
            itemView.setOnClickListener {
                Snackbar.make(it, courses[coursePosition].title, Snackbar.LENGTH_LONG).show()
            }
         }




    }
}