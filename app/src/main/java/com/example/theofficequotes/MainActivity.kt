package com.example.theofficequotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.theofficequotes.adapter.ItemAdapter
import com.example.theofficequotes.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadQuote()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.adapter = ItemAdapter(this, myDataset)

        /*
        Since the layout size of RecyclerView is fixed in the activity layout,
        we can set the setHasFixedSize parameter of the RecyclerView to true.
        This setting is only needed to improve performance. Use this setting if you know
        that changes in content do not change the layout size of the RecyclerView.
        */
        recyclerView.setHasFixedSize(true)
    }
}