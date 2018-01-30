package app.ijoic.savestate

import android.os.Bundle
import com.ijoic.save_state.bindStateString
import com.ijoic.save_state.content.v4.BaseActivity

class MainActivity : BaseActivity() {

  private val username by bindStateString("username")

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }
}
