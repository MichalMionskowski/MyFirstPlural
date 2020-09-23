package com.example.myapplication

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init{
        initializeCourses()
        initalizeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseID, course)

        course = CourseInfo(courseID = "android_async", title = "Android Async Programming and Services")
        courses.set(course.courseID,course)

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseID = "java_lang")
        courses.set(course.courseID,course)

        course = CourseInfo("java_core",  "Java Fundamentals: The Core Platform")
        courses.set(course.courseID,course)
    }

    private fun initalizeNotes(){
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        var note = NoteInfo(course,"android_intents", "Android Programming with Intents")
        notes.add(note)

        course = CourseInfo(courseID = "android_async", title = "Android Async Programming and Services")
        note = NoteInfo(course = course, text = "android_async", title = "Android Async Programming and Services")
        notes.add(note)

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseID = "java_lang")
        note = NoteInfo(course,"Java Fundamentals: The Java Language",  "java_lang")
        notes.add(note)

        course = CourseInfo("java_core",  "Java Fundamentals: The Core Platform")
        note = NoteInfo(course,"java_core",  "Java Fundamentals: The Core Platform")
        notes.add(note)
    }
}