package com.gralliams.notekeeper

class DataManager {
    //Holds reference to courses in a HashMap using Id of type String
    var courses = HashMap<String, CourseInfo>()
    //holds reference to notes in An arrayList
    var notes = ArrayList<NoteInfo>()


    private fun initializeCourses(){
        //Initialize CourseInfo object
        //Add course to course HashMap with key and value
        var course = CourseInfo("EEE", "Fundamentals Of Electrical Engineering I")
        courses.set(course.courseId, course)

        course = CourseInfo("GNS", "Use Of English")
        courses.set(course.courseId, course)

        course = CourseInfo("CE", "Strength of materials")
        courses.set(course.courseId, course )

        course = CourseInfo("CCE", "Computer and communication engineering")
        courses.set(course.courseId, course)
    }
}