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
 * Functional field save item.
 *
 * @author xiao.yl on 2018/1/29.
 * @version 1.0
 */
internal class FunFieldSaveItem<R, T>(
    private val field: StateField<R, T>,
    private val fieldKey: String,
    private val saveField: (Bundle, T) -> Unit,
    private val restoreField: (Bundle) -> T): SaveItem {

  override fun save(outState: Bundle) {
    saveField(outState, field.measureSavedValue())
  }

  override fun restore(outState: Bundle) {
    field.restoreSavedValue(outState.containsKey(fieldKey), restoreField(outState))
  }
}