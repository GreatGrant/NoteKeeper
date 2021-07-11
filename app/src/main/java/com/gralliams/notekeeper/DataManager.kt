package com.gralliams.notekeeper

object DataManager {
     lateinit var course: CourseInfo
     lateinit var  note: NoteInfo

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

        course = CourseInfo("ME", "Engineering mechanics")
        courses[course.courseId] = course

        course = CourseInfo("CHE", "Chemical engineering")
        courses[course.courseId] = course

    }

    private fun initializeNotes() {

//        note = NoteInfo(course, "Circuit analysis", "Into to electric circuits")
//        notes.add(note)

          var note = arrayOf(NoteInfo(courses["EEE"], "Circuit analysis", "Into to electric circuits"),
                    NoteInfo(courses["GNS"], "Verb, subject, predicate", "English foundations"),
                    NoteInfo(courses["CE"], "Shear forces", "Types of forces"),
                    NoteInfo(courses["CCE"], "Computer networking", "Into to networking"),
                    NoteInfo(courses["ME"], "Introduction to mechanics", "Types of mechanics"),
                    NoteInfo(courses["CHE"], "Chemical engineering foundations", "Branches of chemical engineering"))


            for (note in note){
                notes.add(note)
            }





    }

}