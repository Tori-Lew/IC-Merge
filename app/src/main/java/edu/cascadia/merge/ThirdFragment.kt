package edu.cascadia.merge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import edu.cascadia.merge.databinding.FragmentSecondBinding
import edu.cascadia.merge.databinding.FragmentThirdBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
private lateinit var binding: FragmentThirdBinding

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonPrev.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_SecondFragment)
        }
        binding.buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_FirstFragment)
        }
    }
}