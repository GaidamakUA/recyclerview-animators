package jp.wasabeef.example.recyclerview

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat

/**
 * Created by Wasabeef on 2015/03/08.
 */
class MainActivity : AppCompatActivity(R.layout.activity_main) {

  companion object {
    const val KEY_GRID = "GRID"
  }

  private var enabledGrid = false

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    findViewById<View>(R.id.btn_animator_sample).setOnClickListener {
      startActivity(Intent(this, AnimatorSampleActivity::class.java).apply {
        putExtra(KEY_GRID, enabledGrid)
      })
    }

    findViewById<View>(R.id.btn_adapter_sample).setOnClickListener {
      startActivity(Intent(this, AdapterSampleActivity::class.java).apply {
        putExtra(KEY_GRID, enabledGrid)
      })
    }

    findViewById<SwitchCompat>(R.id.grid).setOnCheckedChangeListener { _, isChecked -> enabledGrid = isChecked }
  }
}
