package com.example.mywhislistapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
abstract class WishDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend fun addAWish(wishEntity: Wish)

    // suspend keyword is not being used with @Query because they are using Flow which comes under coroutines
    @Query("Select * From `wish-table`")
    abstract fun getAllWishes() : Flow<List<Wish>>

    @Update
    abstract suspend fun updateAWish(wishEntity: Wish)

    @Delete
    abstract suspend fun deleteAWish(wishEntity: Wish)

    @Query("Select * From `wish-table` where id=:id")
    abstract fun getAWishByID(id:Long) : Flow<Wish>
}