package com.essamhshmey.question.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "person_table")
data class Person(
  // @PrimaryKey val uid: Int,
   @ColumnInfo(name = "person_name")
   val name:String?,
   @ColumnInfo(name = "person_age")
   val age:Int?
)
