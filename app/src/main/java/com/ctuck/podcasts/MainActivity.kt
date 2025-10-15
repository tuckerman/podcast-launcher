package com.ctuck.podcasts
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val uri = Uri.parse("https://music.youtube.com/library/podcasts")
    startActivity(Intent(Intent.ACTION_VIEW, uri))
    finish()
  }
}
