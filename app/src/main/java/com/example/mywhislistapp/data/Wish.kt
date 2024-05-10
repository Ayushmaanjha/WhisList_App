package com.example.mywhislistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0L,

    @ColumnInfo(name = "wish-title")
    val title : String = "",
    @ColumnInfo("wish-description")
    val description : String =""
)

object DummyWish{
    val wishlist = listOf(
        Wish(title = "GT650 Bike", description = "Dream Bike of Royal enfield"),
        Wish(title = "Iphone Pro MAX", description = "IOS Phone"),
        Wish(title = "House", description = "Dream House with balcony"),
        Wish(title = "Trip To manali", description = "Fav Place to visit")
    )
}
