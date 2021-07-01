package com.gralliams.notekeeper

object DataManager {
     lateinit var course: CourseInfo

    //Holds reference to courses in a HashMap using Id of type String
    var courses = HashMap<String, CourseInfo>()
    //holds reference to notes in An arrayList
    var notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }


    private fun initializeCourses(){
        //Initialize CourseInfo object
        //Add course to course HashMap with key and value
        course = CourseInfo("EEE", "Fundamentals Of Electrical Engineering I")
        courses[course.courseId] = course

        course = CourseInfo("GNS", "Use Of English")
        courses[course.courseId] = course

        course = CourseInfo("CE", "Strength of materials")
        courses[course.courseId] = course

        course = CourseInfo("CCE", "Computer and communication engineering")
        courses[course.courseId] = course
    }

    private fun initializeNotes() {

            var note = arrayOf(NoteInfo(course, "Circuit analysis", "Into to electric circuits"),
                    NoteInfo(course, "Verb, subject, predicate", "English foundations"),
                    NoteInfo(course, "Shear forces", "Types of forces"),
                    NoteInfo(course, "Computer networking", "Into to networking"))

            for (item in note){
                notes.add(item)
            }


    }

}