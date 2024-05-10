package com.example.mywhislistapp

import android.content.Context
import androidx.room.Room
import com.example.mywhislistapp.data.WishDB
import com.example.mywhislistapp.data.WishRepository

object Graph {

    lateinit var database : WishDB

    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }

    fun provide(context: Context){
        database = Room.databaseBuilder(context,WishDB::class.java,"wishlist.db").build()
    }
}