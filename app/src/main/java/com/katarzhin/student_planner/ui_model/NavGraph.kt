package com.katarzhin.student_planner.ui_model

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.katarzhin.student_planner.navigation.Screen
import com.katarzhin.student_planner.ui_model.*
import com.katarzhin.student_planner.data.sampleSchedule
import com.katarzhin.student_planner.ui_model.ScheduleScreen
import com.katarzhin.student_planner.ui_model.ScheduleDetailsScreen

@Composable
fun StudentPlannerNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen(
                onSubjectClick = {subjectId ->
                    navController.navigate(Screen.Details.createRoute(subjectId))
                },
                onProfileClick = {
                    navController.navigate(Screen.Profile.route)
                },
                onSettingsClick = {
                    navController.navigate(Screen.Setting.route)
                },
                onScheduleClick = {
                    navController.navigate(Screen.Schedule.route)
                }
            )
        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(
                navArgument("subjectId") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->
            val subjectId = backStackEntry.arguments?.getString("subjectId") ?: ""
            DetailsScreen(
                subjectId = subjectId,
                onNavigateBack = {
                    navController.popBackStack()
                }
            )
        }
        composable(route = Screen.Profile.route) {
            ProfileScreen(
                onNavigateBack = {
                    navController.popBackStack()
                }
            )
        }
        composable(route = Screen.Setting.route) {
            SettingsScreen(
                onNavigateBack = {
                    navController.popBackStack()
                }
            )
        }
        composable(route = Screen.Schedule.route) {
            ScheduleScreen(
                onNavigateBack = { navController.popBackStack() },
                onLessonClick = { lessonId ->
                    navController.navigate(Screen.ScheduleDetails.createRoute(lessonId))
                }
            )
        }
        composable(
            route = Screen.ScheduleDetails.route,
            arguments = listOf(
                navArgument("lessonId") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val lessonId = backStackEntry.arguments?.getString("lessonId") ?: ""
            ScheduleDetailsScreen(
                lessonId = lessonId,
                onNavigateBack = { navController.popBackStack() }
            )
        }
    }
}
