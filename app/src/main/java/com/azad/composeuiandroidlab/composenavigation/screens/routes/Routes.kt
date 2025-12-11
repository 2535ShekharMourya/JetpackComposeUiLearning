package com.azad.composeuiandroidlab.composenavigation.screens.routes


object Screen1Route {
    const val route = "screen1"
}

object ScreenARoute {
    const val route = "screenA"
}
object ScreenBRoute {
    const val route = "screenB/{userName}" // "screenB/{userid}","screenB/{userAge}/{isPremium} ","screenB/{isPremium}", "screenB/{isPremium}/{age}/{isPremium}/{userId}"
    fun passUserName(name: String) = "screenB/$name"
    fun passUserAge(age: Int) = "screenB/$age"
    fun passIsPremium(isPremium: Boolean) = "screenB/$isPremium"
    fun passUserNameAndAge(name: String, age: Int) = "screenB/$name/$age"
    fun passUserNameAndAgeAndPremium(name: String, age: Int, isPremium: Boolean) = "screenB/$name/$age/$isPremium"
    fun passUserNameAndAgeAndPremiumAndUserId(name: String, age: Int, isPremium: Boolean, userId: Long) = "screenB/$name/$age/$isPremium/$userId"
}

object PassStringRoute {
    const val route = "screen2/{userName}"
    fun passUserName(name: String) = "screen2/$name"
}

object UserScreenRoute {
    const val route = "UserScreen"
}

object UserDetailsRoute {
    const val route =
        "screenB/{userName}/{age}/{isPremium}/{userId}"
    fun passArgs(
        userName: String,
        age: Int,
        isPremium: Boolean,
        userId: Long
    ): String {
        return "screenB/$userName/$age/$isPremium/$userId"
    }
}