package com.duckgo.medtools.mine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.duckgo.medtools.R
import com.duckgo.medtools.databinding.FragmentMinePageBinding
import com.duckgo.medtools.util.addHideFragment

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
            // 修复：使用工具类 addHideFragment 替代 replace
            // 这样进入“软件使用”时，MinePage 只是被隐藏，不会销毁 View，
            // 从而避免从其他 Tab 切换回来时因 View 丢失导致的空白问题。
            parentFragmentManager.addHideFragment(SoftwareUsageFragment())
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
