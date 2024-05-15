package com.example.paper4good.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.paper4good.Add
import com.example.paper4good.Charities
import com.example.paper4good.Create
import com.example.paper4good.Log
import com.example.paper4good.Paper4Good

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = LOGIN_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            Log(navController = navController)
        }
        composable(SIGNUP_URL){
            Create(navController = navController)
        }
        composable(HOME_URL){
            Paper4Good(navController = navController)
        }
        composable(ADD_CHARITIES_URL){
            Add(navController = navController)
        }
        composable(VIEW_CHARITIES_URL){
            Charities(navController = navController)
        }
    }
}