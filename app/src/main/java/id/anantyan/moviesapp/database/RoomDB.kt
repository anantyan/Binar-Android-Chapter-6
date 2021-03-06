package id.anantyan.moviesapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import id.anantyan.moviesapp.data.local.UsersDao
import id.anantyan.moviesapp.model.Users

@Database(entities = [
    Users::class
], version = 2, exportSchema = false)
abstract class RoomDB : RoomDatabase() {

    companion object {
        @Volatile
        private var INSTANCE: RoomDB? = null

        fun database(context: Context): RoomDB {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val db = Room.databaseBuilder(
                    context.applicationContext,
                    RoomDB::class.java,
                    "db_moviesapp"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = db
                return db
            }
        }
    }

    abstract fun usersDao(): UsersDao
}