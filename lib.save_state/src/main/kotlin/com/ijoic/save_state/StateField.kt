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

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Lifecycle state field.
 *
 * <p>Used to work with SaveState.</p>
 *
 * @author xiao.yl on 2018/1/29.
 * @version 1.0
 *
 * @see SaveState
 */
internal class StateField<in R, T> internal constructor(private val defaultValue: T): ReadWriteProperty<R, T> {

  private var filedValue: T = defaultValue
  private var savedFieldValue: T = defaultValue

  private var fieldInit = false
  private var restoreInit = false

  /**
   * This method will return restore value if field value is not manual set, default value if restore
   * value is not automatically set.
   */
  override fun getValue(thisRef: R, property: KProperty<*>): T {
    if (fieldInit) {
      return filedValue
    }
    if (restoreInit) {
      return savedFieldValue
    }
    return defaultValue
  }

  override fun setValue(thisRef: R, property: KProperty<*>, value: T) {
    fieldInit = true
    this.filedValue = value
  }

  /**
   * Measure saved value.
   */
  internal fun measureSavedValue(): T {
    val value = filedValue
    savedFieldValue = value
    return value
  }

  /**
   * Restore saved value.
   *
   * @param containsKey is field key contains in saved data.
   * @param value value.
   */
  internal fun restoreSavedValue(containsKey: Boolean, value: T) {
    restoreInit = containsKey
    savedFieldValue = value
  }

}