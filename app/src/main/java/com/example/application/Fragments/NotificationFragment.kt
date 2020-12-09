package com.example.application.Fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.application.R

class NotificationFragment: Fragment(R.layout.fragment_notification) {

    private lateinit var textView: TextView

    private lateinit var amount: String

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById(R.id.textView2)

        textView.text = NotificationFragmentArgs.fromBundle(requireArguments()).amount.toString()

        amount = textView.text.toString()

        if (amount == "-1") {

            textView.text = amount

        }
    }

}