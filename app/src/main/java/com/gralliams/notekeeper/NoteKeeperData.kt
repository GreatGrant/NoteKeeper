package com.gralliams.notekeeper

class NoteInfo(val courseId: String, val title: String)
class CourseInfo(var course: CourseInfo, var title: String, var text: String)