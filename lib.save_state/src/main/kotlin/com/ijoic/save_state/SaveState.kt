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
package com.ijoic.save_state

import android.os.Bundle

/**
 * Lifecycle save state.
 *
 * <p>Used to manage Activity/Fragment's onSaveInstanceState, onRestoreInstanceState data.</p>
 *
 * @author xiao.yl on 2018/1/29.
 * @version 1.0
 *
 * @see android.app.Activity.onSaveInstanceState
 * @see android.app.Activity.onRestoreInstanceState
 * @see android.app.Fragment.onSaveInstanceState
 * @see android.app.Fragment.onViewStateRestored
 */
class SaveState {

  private val items = ArrayList<SaveItem>()

  /**
   * Add save item.
   *
   * @param saveItem save item.
   */
  internal fun addSaveItem(saveItem: SaveItem) {
    items.add(saveItem)
  }

  /**
   * Save instance state.
   *
   * @param outState out state.
   */
  fun save(outState: Bundle?) {
    if (outState == null) {
      return
    }
    items.toMutableList().forEach {
      it.save(outState)
    }
  }

  /**
   * Restore instance state.
   *
   * @param outState out state.
   */
  fun restore(outState: Bundle?) {
    if (outState == null) {
      return
    }
    items.toMutableList().forEach {
      it.restore(outState)
    }
  }

}