package com.easv.oe.friends.GUI

import android.app.ListActivity

import android.os.Bundle
import android.view.View
import android.widget.*
import com.easv.oe.friends.Model.BEFriend
import com.easv.oe.friends.Model.Friends
import com.easv.oe.friends.R

class MainActivity2 : ListActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // NO setContent because it is only a Listview

        listAdapter = createAdapter()
    }

    private fun asListMap(src: Array<BEFriend>): List<Map<String, String?>>? {
        /*val res: MutableList<Map<String, String?>> = ArrayList()
        for (s in src) {
            res.add( hashMapOf("name" to s.name, "phone" to s.phone) )
        }
        return res */
        return src.map{ person -> hashMapOf("name" to person.name, "phone" to person.phone) }
    }

    protected fun createAdapter(): SimpleAdapter? {
        return SimpleAdapter(
                this,
                asListMap(Friends().getAll()),
                R.layout.cell, arrayOf("name", "phone"), intArrayOf(R.id.name, R.id.phone)
        )
    }

    override fun onListItemClick(
            parent: ListView?,
            v: View?, position: Int, id: Long
    ) {
        // position is in the list!
        // first get the name of the person clicked
        val name = Friends().getAll()[position].name
        // and a greeting
        Toast.makeText(
                this,
                "Hi $name! Have you done your homework?",
                Toast.LENGTH_LONG
        ).show()
    }

}