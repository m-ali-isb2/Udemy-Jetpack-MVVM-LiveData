package com.muhammadali.udemy.jetpack.mvvmLiveData.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.muhammadali.udemy.jetpack.mvvmLiveData.R
import kotlinx.android.synthetic.main.fragment_list.*


/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonDetails.setOnClickListener {
            val action: ListFragmentDirections.ActionListFragmentToDetailFragment =
                ListFragmentDirections.actionListFragmentToDetailFragment()
            //Passing Argument
            action.dogUuid = 5
            Navigation.findNavController(it).navigate(action)

        }
    }

}