/*
 *
 *  Copyright(c) 2018 VerstSiu
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package com.ijoic.save_state.content.v4

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import com.ijoic.save_state.SaveState
import com.ijoic.save_state.StateSource

/**
 * Base activity that support state field binding.
 *
 * @author xiao.yl on 2018/1/30.
 * @version 1.0
 */
open class BaseActivity : FragmentActivity(), StateSource {

  private val saveState = SaveState()

  override fun getSaveState() = saveState

  override fun onSaveInstanceState(outState: Bundle?) {
    super.onSaveInstanceState(outState)
    saveState.save(outState)
  }

  override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
    super.onRestoreInstanceState(savedInstanceState)
    saveState.restore(savedInstanceState)
  }

}