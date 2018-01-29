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
class StateField<T> internal constructor(private val defaultValue: T) {

  private var filedValue: T = defaultValue
  private var savedFieldValue: T = defaultValue

  private var fieldInit = false
  private var restoreInit = false


  /**
   * Set field value.
   */
  fun setValue(value: T) {
    fieldInit = true
    this.filedValue = value
  }

  /**
   * Returns field value.
   *
   * <p>This method will return saved field value, if field is not manual initialized.</p>
   */
  fun getValue(): T {
    if (fieldInit) {
      return filedValue
    }
    if (restoreInit) {
      return savedFieldValue
    }
    return defaultValue
  }

  /**
   * Measure saved value.
   */
  internal fun measureSavedValue(): T {
    val value = filedValue
    savedFieldValue = value
    fieldInit = false
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