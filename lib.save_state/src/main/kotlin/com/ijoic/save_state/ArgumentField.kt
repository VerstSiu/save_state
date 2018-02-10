package com.ijoic.save_state

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Fragment argument field.
 *
 * <p>Used to work with SaveState.</p>
 *
 * @author xiao.yl on 2018/1/29.
 * @version 1.0
 *
 * @see SaveState
 */
internal class ArgumentField<T> internal constructor(
    private val bindKey: String,
    private val defaultValue: T,
    private val saveField: (Bundle, T) -> Unit,
    private val restoreField: (Bundle) -> T): ReadWriteProperty<ArgumentSource, T> {

  private var filedValue: T = defaultValue

  private var fieldInit = false

  /**
   * This method will return restore value if field value is not manual set, else default value
   */
  override fun getValue(thisRef: ArgumentSource, property: KProperty<*>): T {
    if (fieldInit) {
      return filedValue
    }
    val args = thisRef.getArguments()

    if (args == null || !args.containsKey(bindKey)) {
      return defaultValue
    }
    return restoreField(args)
  }

  override fun setValue(thisRef: ArgumentSource, property: KProperty<*>, value: T) {
    fieldInit = true
    this.filedValue = value

    var args = thisRef.getArguments()

    if (args == null) {
      args = Bundle()

      try {
        thisRef.setArguments(args)
      } catch (e: Exception) {
        e.printStackTrace()
      }
    }
    saveField(args, value)
  }

}