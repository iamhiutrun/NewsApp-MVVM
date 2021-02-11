package hiutrun.example.newsapp.api

import androidx.room.TypeConverter
import hiutrun.example.newsapp.models.Source

class Converters {
    @TypeConverter
    fun fromSource(source: Source):String{
        return source.name
    }

    @TypeConverter
    fun toSource(name:String): Source {
        return Source(name,name)
    }
}