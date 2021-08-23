package com.example.theofficequotes.data

import com.example.theofficequotes.R
import com.example.theofficequotes.model.Quote

class Datasource {
    fun loadQuote(): List<Quote> {
        return listOf<Quote>(
            Quote(R.string.quote1, R.drawable.theoffice1),
            Quote(R.string.quote2, R.drawable.theoffice2),
            Quote(R.string.quote3, R.drawable.theoffice3),
            Quote(R.string.quote4, R.drawable.theoffice4),
            Quote(R.string.quote5, R.drawable.theoffice5),
            Quote(R.string.quote6, R.drawable.theoffice6),
            Quote(R.string.quote7, R.drawable.theoffice7),
            Quote(R.string.quote8, R.drawable.theoffice8),
            Quote(R.string.quote9, R.drawable.theoffice9),
            Quote(R.string.quote10, R.drawable.theoffice10),
            Quote(R.string.quote11, R.drawable.theoffice11),
            Quote(R.string.quote12, R.drawable.theoffice12),
            Quote(R.string.quote13, R.drawable.theoffice13),
            Quote(R.string.quote14, R.drawable.theoffice14),
            Quote(R.string.quote15, R.drawable.theoffice15)
        )
    }
}