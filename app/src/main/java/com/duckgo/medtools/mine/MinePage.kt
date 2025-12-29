package com.duckgo.medtools.mine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.duckgo.medtools.R
import com.duckgo.medtools.databinding.FragmentMinePageBinding

class MinePage : Fragment() {
    private var _binding: FragmentMinePageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMinePageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        setupListeners()
    }

    private fun setupListeners() {
        binding.btnCourses.setOnClickListener {
            Toast.makeText(context, "跳转到课程", Toast.LENGTH_SHORT).show()
        }
        binding.btnFavorites.setOnClickListener {
            Toast.makeText(context, "跳转到收藏", Toast.LENGTH_SHORT).show()
        }
        binding.btnMine.setOnClickListener {
            Toast.makeText(context, "跳转到我的", Toast.LENGTH_SHORT).show()
        }
        binding.btnSoftwareUsage.setOnClickListener {
            parentFragmentManager.commit {
                replace(R.id.fragment_, SoftwareUsageFragment())
                addToBackStack(null)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
