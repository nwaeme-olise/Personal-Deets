package com.example.personaldeets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.personaldeets.databinding.FragmentGitHubWebBinding


class GitHubWebFragment : Fragment() {
    private var _binding: FragmentGitHubWebBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGitHubWebBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.gitHubWebView.apply{
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            settings.setSupportZoom(false)
            loadUrl("https://github.com/nwaeme-olise")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}