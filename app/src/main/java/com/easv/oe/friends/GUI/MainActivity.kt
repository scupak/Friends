package com.easv.oe.friends.GUI

import android.app.ListActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import com.easv.oe.friends.Model.Friends
import com.easv.oe.friends.R


class MainActivity : ListActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val f = Friends().getAllNames()
        val adapter: ListAdapter = ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, f)

        listAdapter = adapter
    }
}