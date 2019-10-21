package com.uty.listviewpresidentindonesia.model

import com.uty.listviewpresidentindonesia.R

object PresidentData {
    private val presidentName = arrayOf(
        "Soekarno",
        "Soeharto",
        "BJ Habibie",
        "Abdurrahman Wahid",
        "Megawati Soekarnoputri",
        "Susilo Bambang Yudhoyono",
        "Joko Widodo"
    )

    private val detail = arrayOf(
        "Presiden pertama Indonesia adalah Ir. Soekarno. Ia lahir di Surabaya, 6 Juni 1901 dengan nama asli Koesno Sosrodihardjo. Soekarno kemudian meninggal di Jakarta, 21 Juni 1970 di usia yang ke-69 tahun.",
        "Presiden kedua Indonesia adalah Soeharto. Ia lahir di Bantul, Yogyakarta pada 8 Juni 1921. Soeharto kemudian meninggal di Jakarta, 27 Januari 2008 di usia yang ke-86 tahun.",
        "Presiden ketiga Indonesia adalah BJ Habibie. Ia lahir di Parepare, 25 Juni 1936 dengan nama Bacharuddin Jusuf Habibie. Sebelumnya ia menjadi wakil presiden dari Soeharto.",
        "Presiden keempat Indonesia adalah Gus Dur. Ia lahir di Jombang, 7 September 1940 dengan nama asli Abdurrahman Wahid, namun kemudian lebih akrab dipanggil Gus Dur. Gus Dur kemudian meninggal di Jakarta, 30 Desember 2009 di usia yang ke-69 tahun.",
        "Presiden kelima Indonesia adalah Megawati Soekarnoputri. Ia lahir di Yogyakarta, 23 Januari 1947 dengan nama lengkap Dyah Pertama Megawati Setyawati Soekarnoputri. Ia merupakan anak dari Soekarno yang merupakan presiden pertama Indonesia.",
        "Presiden keenam Indonesia adalah Susilo Bambang Yudhoyono. Ia lahir di Pacitan, 9 September 1949. Ia lebih dikenal dengan nama inisialnya, yaitu SBY.",
        "Presiden ketujuh Indonesia adalah Joko Widodo. Ia lahir di Surakarta, 21 Juni 1961. Ia lebih akrab dipanggil dengan nama Jokowi."
    )

    private val presidentPoster = intArrayOf(
        R.drawable.president1,
        R.drawable.president2,
        R.drawable.president3,
        R.drawable.president4,
        R.drawable.president5,
        R.drawable.president6,
        R.drawable.president7

    )

    val listPresident: ArrayList<President>
        get() {
            val list = arrayListOf<President>()
            for (position in presidentName.indices) {
                val president = President()
                president.name = presidentName[position]
                president.detail = detail[position]
                president.poster = presidentPoster[position]
                list.add(president)
            }
            return list
        }
}