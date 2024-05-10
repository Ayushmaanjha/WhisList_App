package com.example.mywhislistapp


// sealed class is created so no inheritance can be done from here.etc..
sealed class Screen(val route:String) {
    object HomeScreen:Screen("home_screen")
    object AddScreen:Screen("add_screen")
}