package com.kishan.roommigrationdemo1

import androidx.room.*

@Dao
interface StudentDAO {

    @Insert
    suspend fun insertStudent(student: Student)

}