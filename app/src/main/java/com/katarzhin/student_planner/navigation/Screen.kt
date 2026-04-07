package com.katarzhin.student_planner.navigation

sealed class Screen(val route: String) {
    object Home: Screen("home")
    object Details : Screen("details/{subjectId}") {
        fun createRoute(subjectId: String) = "details/$subjectId"
    }
    object Profile : Screen("profile")
    object Setting : Screen("settings")

    object Schedule : Screen("schedule")
    object ScheduleDetails : Screen("schedule_details/{lessonId}") {
        fun createRoute(lessonId: String) = "schedule_details/$lessonId"
    }
}