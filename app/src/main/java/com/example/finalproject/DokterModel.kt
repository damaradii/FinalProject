package com.example.finalproject

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class DokterModel (var image:Int, var nama:String, var spesialis: String, var kerja: String, var like: String, var harga: String) : Parcelable {

}