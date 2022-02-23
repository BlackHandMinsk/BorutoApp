package com.example.borutoapp.domain.model

import androidx.annotation.DrawableRes
import com.example.borutoapp.R

sealed class OnBoardingPage(
    @DrawableRes
    val image:Int,
    val tittle:String,
    val description:String
){
    object First:OnBoardingPage(
        image = R.drawable.greetings,
        tittle = "Greetings",
        description = "Are you Boruto fan? Because if you are when we have a great news for you"
    )
    object Second:OnBoardingPage(
        image = R.drawable.explore,
        tittle = "Explore",
        description = "Find you favorite heroes and learn some of the things that didn`t know about"
    )
    object Third:OnBoardingPage(
        image = R.drawable.power,
        tittle = "Power",
        description = "Check out your hero`s power and see how much are they strong comparing to others"
    )
}
