package org.auspiciousrhino.quicksetup.hostscreen

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.Insets
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import org.auspiciousrhino.quicksetup.hostscreen.databinding.ActivityHostBinding

class HostActivity : FragmentActivity() {

  private lateinit var binding: ActivityHostBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    WindowCompat.enableEdgeToEdge(window)
    binding = ActivityHostBinding.inflate(layoutInflater)
    setContentView(binding.root)
    val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentHost) as NavHostFragment
    binding.bottomNavigation.setupWithNavController(navHostFragment.navController)
    setContentViewEdgeToEdge(binding.root)
  }

  private fun setContentViewEdgeToEdge(activityView: ViewGroup) {
    setContentView(activityView)
    WindowCompat.getInsetsController(window, window.decorView).apply {
      isAppearanceLightStatusBars = true
      isAppearanceLightNavigationBars = true
    }
    val initialPaddingTop = activityView.paddingTop
    val initialPaddingBottom = activityView.paddingBottom
    val initialPaddingLeft = activityView.paddingLeft
    val initialPaddingRight = activityView.paddingRight
    ViewCompat.setOnApplyWindowInsetsListener(activityView) { _: View, windowInsets: WindowInsetsCompat ->
      val insets: Insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.ime())
      activityView.setPadding(initialPaddingLeft + insets.left, initialPaddingTop + insets.top, initialPaddingRight + insets.right, initialPaddingBottom + insets.bottom)
      WindowInsetsCompat.CONSUMED
    }
  }
}

