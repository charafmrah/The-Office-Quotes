package com.example.theofficequotes.data

import com.example.theofficequotes.R
import com.example.theofficequotes.model.Quote

class Datasource {
    fun loadQuote(): List<Quote> {
        return listOf<Quote>(
            Quote(R.string.quote1),
            Quote(R.string.quote2),
            Quote(R.string.quote3),
            Quote(R.string.quote4),
            Quote(R.string.quote5),
            Quote(R.string.quote6),
            Quote(R.string.quote7),
            Quote(R.string.quote8),
            Quote(R.string.quote9),
            Quote(R.string.quote10),
            Quote(R.string.quote11),
            Quote(R.string.quote12),
            Quote(R.string.quote13),
            Quote(R.string.quote14),
            Quote(R.string.quote15)
        )
    }
}