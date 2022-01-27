package org.auspiciousrhino.hostscreen

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import org.auspiciousrhino.hostscreen.databinding.ActivityHostBinding
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController


class HostActivity : FragmentActivity() {

  private lateinit var binding: ActivityHostBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityHostBinding.inflate(layoutInflater)
    setContentView(binding.root)
    val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentHost) as NavHostFragment
    binding.bottomNavigation.setupWithNavController(navHostFragment.navController)
  }
}
