package edu.quinnipiac.ser210.catchat

/*
  * samantha woodburn
  * 2/14/24
  * HFAD chapter 8 demo
  * navigation: top navigation, bottom, and drawer
  * help fragment
 */

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class HelpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_help, container, false)
    }

}