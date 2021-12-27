package org.auspiciousrhino.imagepreview

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.annotation.DrawableRes
import org.auspiciousrhino.imagepreview.databinding.ActivityImagepreviewBinding

class ImagePreviewActivity : ComponentActivity() {

  private lateinit var binding: ActivityImagepreviewBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityImagepreviewBinding.inflate(layoutInflater)
    setContentView(binding.root)
    binding.imagePreview.setImageResource(intent.getIntExtra(IMAGE_RES_KEY, 0))
    binding.imagePreview.post {
      binding.imagePreview.setRotationBy(90f)
    }
  }

  companion object {

    fun intent(context: Context, @DrawableRes imageRes: Int) =
      Intent(context, ImagePreviewActivity::class.java).putExtra(IMAGE_RES_KEY, imageRes)
  }
}

private const val IMAGE_RES_KEY = "IMAGE_RES_KEY"
