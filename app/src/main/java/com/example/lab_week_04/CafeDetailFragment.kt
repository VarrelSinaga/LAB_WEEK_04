package com.example.lab_week_04

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val TAB_CONTENT = "TAB_CONTENT"

/**
 * A simple [Fragment] subclass.
 * Use the [CafeDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CafeDetailFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var content: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            content = it.getString(TAB_CONTENT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cafe_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.content_description)
            ?.text = content
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment CafeDetailFragment.
         */
        // TODO: Rename and change types and number of parameters

        fun newInstance(content: String) =
            CafeDetailFragment().apply {
                arguments = Bundle().apply {
                    putString(TAB_CONTENT, content)
                }
            }
    }
}