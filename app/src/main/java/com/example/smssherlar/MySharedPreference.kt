package com.example.smssherlar

import android.content.Context
import android.content.SharedPreferences
import com.example.smssherlar.models.Data1
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object MySharedPreference {
    private const val NAME = "catch_file_name"
    private const val MODE = Context.MODE_PRIVATE

    private lateinit var preferences: SharedPreferences

    fun init(context: Context){
        preferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation:(SharedPreferences.Editor) -> Unit){
        val editor = edit()
        operation(editor)
        editor.apply()
    }

    var yangilarList: ArrayList<Data1>
        get() = gsonStringToList(preferences.getString("yangilarList", "[]")!!)
        set(value) = preferences.edit {
            it.putString("yangilarList", listToGsonString(value))
        }
    var saqlanganlarList: ArrayList<Data1>
        get() = gsonStringToList(preferences.getString("saqlanganlarList", "[]")!!)
        set(value) = preferences.edit {
            it.putString("saqlanganlarList", listToGsonString(value))
        }
    var sevgiList: ArrayList<Data1>
        get() = gsonStringToList(preferences.getString("sevgiList", "[]")!!)
        set(value) = preferences.edit {
            it.putString("sevgiList", listToGsonString(value))
        }
    var soginchList: ArrayList<Data1>
        get() = gsonStringToList(preferences.getString("soginchList", "[]")!!)
        set(value) = preferences.edit {
            it.putString("soginchList", listToGsonString(value))
        }
    var tabrikList: ArrayList<Data1>
        get() = gsonStringToList(preferences.getString("tabrikList", "[]")!!)
        set(value) = preferences.edit {
            it.putString("tabrikList", listToGsonString(value))
        }
    var otaOnaList: ArrayList<Data1>
        get() = gsonStringToList(preferences.getString("otaOnaList", "[]")!!)
        set(value) = preferences.edit {
            it.putString("otaOnaList", listToGsonString(value))
        }
    var dostlikList: ArrayList<Data1>
        get() = gsonStringToList(preferences.getString("dostlikList", "[]")!!)
        set(value) = preferences.edit {
            it.putString("dostlikList", listToGsonString(value))
        }
    var hazilList: ArrayList<Data1>
        get() = gsonStringToList(preferences.getString("hazilList", "[]")!!)
        set(value) = preferences.edit {
            it.putString("hazilList", listToGsonString(value))
        }

    private fun gsonStringToList(gsonString: String): ArrayList<Data1>{
        val list = ArrayList<Data1>()
        val type = object : TypeToken<ArrayList<Data1>>() {}.type
        list.addAll(Gson().fromJson(gsonString, type))
        return list
    }

    private fun listToGsonString(list:ArrayList<Data1>): String{
        return Gson().toJson(list)
    }
}