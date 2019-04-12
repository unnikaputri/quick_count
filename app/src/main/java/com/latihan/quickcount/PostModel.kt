package com.latihan.quickcount

data class PostModel(val id:Int,
                     val gambar_bukti:String,
                     val caleg:String,
                     val partai:String,
                     var tps:String,
                     val jumlah_suara:Int)