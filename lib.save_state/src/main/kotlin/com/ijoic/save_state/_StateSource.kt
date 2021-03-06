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
import android.os.Parcelable
import android.util.SparseArray
import kotlin.properties.ReadWriteProperty
/**
 * State source extension.
 *
 * @author xiao.yl on 2018/1/29.
 * @version 1.0
 */

/* BaseBundle(min as API 15) */

/* Boolean */

/**
 * Bind boolean field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateBoolean(bindKey: String, defaultValue: Boolean = false) = injectField<Boolean>(
    bindKey,
    defaultValue,
    { it, value -> it.putBoolean(bindKey, value) },
    { it.getBoolean(bindKey, defaultValue) }
)

/**
 * Bind boolean array field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateBooleanArray(bindKey: String, defaultValue: BooleanArray? = null) = injectField<BooleanArray?>(
    bindKey,
    defaultValue,
    { it, value -> it.putBooleanArray(bindKey, value) },
    { it.getBooleanArray(bindKey) ?: defaultValue }
)

/* Double */

/**
 * Bind double field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateDouble(bindKey: String, defaultValue: Double = 0.0) = injectField<Double>(
    bindKey,
    defaultValue,
    { it, value -> it.putDouble(bindKey, value) },
    { it.getDouble(bindKey, defaultValue) }
)

/**
 * Bind double array field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateDoubleArray(bindKey: String, defaultValue: DoubleArray? = null) = injectField<DoubleArray?>(
    bindKey,
    defaultValue,
    { it, value -> it.putDoubleArray(bindKey, value) },
    { it.getDoubleArray(bindKey) ?: defaultValue }
)

/* Int */

/**
 * Bind int field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateInt(bindKey: String, defaultValue: Int = 0) = injectField<Int>(
    bindKey,
    defaultValue,
    { it, value -> it.putInt(bindKey, value) },
    { it.getInt(bindKey, defaultValue) }
)

/**
 * Bind int array field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateIntArray(bindKey: String, defaultValue: IntArray? = null) = injectField<IntArray?>(
    bindKey,
    defaultValue,
    { it, value -> it.putIntArray(bindKey, value) },
    { it.getIntArray(bindKey) ?: defaultValue }
)

/* Long */

/**
 * Bind long field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateLong(bindKey: String, defaultValue: Long = 0) = injectField<Long>(
    bindKey,
    defaultValue,
    { it, value -> it.putLong(bindKey, value) },
    { it.getLong(bindKey, defaultValue) }
)

/**
 * Bind long array field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateLongArray(bindKey: String, defaultValue: LongArray? = null) = injectField<LongArray?>(
    bindKey,
    defaultValue,
    { it, value -> it.putLongArray(bindKey, value) },
    { it.getLongArray(bindKey) ?: defaultValue }
)

/* String */

/**
 * Bind string field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateString(bindKey: String, defaultValue: String? = null) = injectField<String?>(
    bindKey,
    defaultValue,
    { it, value -> it.putString(bindKey, value) },
    { it.getString(bindKey, defaultValue) }
)

/**
 * Bind string array field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateStringArray(bindKey: String, defaultValue: Array<String>? = null) = injectField<Array<String>?>(
    bindKey,
    defaultValue,
    { it, value -> it.putStringArray(bindKey, value) },
    { it.getStringArray(bindKey) ?: defaultValue }
)

/* Bundle(min as API 15) */

/* Bundle */

/**
 * Bind bundle field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateBundle(bindKey: String, defaultValue: Bundle? = null) = injectField<Bundle?>(
    bindKey,
    defaultValue,
    { it, value -> it.putBundle(bindKey, value) },
    { it.getBundle(bindKey) ?: defaultValue }
)

/* Byte */

/**
 * Bind byte field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateByte(bindKey: String, defaultValue: Byte = 0) = injectField<Byte>(
    bindKey,
    defaultValue,
    { it, value -> it.putByte(bindKey, value) },
    { it.getByte(bindKey, defaultValue) }
)

/**
 * Bind byte array field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateByteArray(bindKey: String, defaultValue: ByteArray? = null) = injectField<ByteArray?>(
    bindKey,
    defaultValue,
    { it, value -> it.putByteArray(bindKey, value) },
    { it.getByteArray(bindKey) ?: defaultValue }
)

/* Char */

/**
 * Bind char field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateChar(bindKey: String, defaultValue: Char = 0.toChar()) = injectField<Char>(
    bindKey,
    defaultValue,
    { it, value -> it.putChar(bindKey, value) },
    { it.getChar(bindKey, defaultValue) }
)

/**
 * Bind char array field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateCharArray(bindKey: String, defaultValue: CharArray? = null) = injectField<CharArray?>(
    bindKey,
    defaultValue,
    { it, value -> it.putCharArray(bindKey, value) },
    { it.getCharArray(bindKey) ?: defaultValue }
)

/* Char Sequence */

/**
 * Bind char sequence field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateCharSequence(bindKey: String, defaultValue: CharSequence? = null) = injectField<CharSequence?>(
    bindKey,
    defaultValue,
    { it, value -> it.putCharSequence(bindKey, value) },
    { it.getCharSequence(bindKey, defaultValue) }
)

/**
 * Bind char sequence array field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateCharSequenceArray(bindKey: String, defaultValue: Array<CharSequence>? = null) = injectField<Array<CharSequence>?>(
    bindKey,
    defaultValue,
    { it, value -> it.putCharSequenceArray(bindKey, value) },
    { it.getCharSequenceArray(bindKey) ?: defaultValue }
)

/**
 * Bind char sequence array list field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateCharSequenceArrayList(bindKey: String, defaultValue: ArrayList<CharSequence>? = null) = injectField(
    bindKey,
    defaultValue,
    { it, value -> it.putCharSequenceArrayList(bindKey, value) },
    { it.getCharSequenceArrayList(bindKey) ?: defaultValue }
)

/* Float */

/**
 * Bind float field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateFloat(bindKey: String, defaultValue: Float = 0F) = injectField<Float>(
    bindKey,
    defaultValue,
    { it, value -> it.putFloat(bindKey, value) },
    { it.getFloat(bindKey, defaultValue) }
)

/**
 * Bind float array field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateFloatArray(bindKey: String, defaultValue: FloatArray? = null) = injectField<FloatArray?>(
    bindKey,
    defaultValue,
    { it, value -> it.putFloatArray(bindKey, value) },
    { it.getFloatArray(bindKey) ?: defaultValue }
)

/* Int */

/**
 * Bind integer array list field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateIntegerArrayList(bindKey: String, defaultValue: ArrayList<Int>? = null) = injectField(
    bindKey,
    defaultValue,
    { it, value -> it.putIntegerArrayList(bindKey, value) },
    { it.getIntegerArrayList(bindKey) ?: defaultValue }
)

/* Parcelable */

/**
 * Bind parcelable field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun<T: Parcelable> StateSource.bindStateParcelable(bindKey: String, defaultValue: T? = null) = injectField<T?>(
    bindKey,
    defaultValue,
    { it, value -> it.putParcelable(bindKey, value) },
    { it.getParcelable(bindKey) ?: defaultValue }
)

/**
 * Bind parcelable array field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateParcelableArray(bindKey: String, defaultValue: Array<Parcelable>? = null) = injectField<Array<Parcelable>?>(
    bindKey,
    defaultValue,
    { it, value -> it.putParcelableArray(bindKey, value) },
    { it.getParcelableArray(bindKey) ?: defaultValue }
)

/**
 * Bind parcelable array list field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun<T: Parcelable> StateSource.bindStateParcelableArrayList(bindKey: String, defaultValue: ArrayList<T>? = null) = injectField(
    bindKey,
    defaultValue,
    { it, value -> it.putParcelableArrayList(bindKey, value) },
    { it.getParcelableArrayList(bindKey) ?: defaultValue }
)

/* Short */

/**
 * Bind short field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateShort(bindKey: String, defaultValue: Short = 0) = injectField<Short>(
    bindKey,
    defaultValue,
    { it, value -> it.putShort(bindKey, value) },
    { it.getShort(bindKey, defaultValue) }
)

/**
 * Bind short array field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateShortArray(bindKey: String, defaultValue: ShortArray? = null) = injectField<ShortArray?>(
    bindKey,
    defaultValue,
    { it, value -> it.putShortArray(bindKey, value) },
    { it.getShortArray(bindKey) ?: defaultValue }
)

/* SparseParcelableArray */

/**
 * Bind string array list field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun<T: Parcelable> StateSource.bindStateSparseParcelableArray(bindKey: String, defaultValue: SparseArray<T>? = null) = injectField<SparseArray<T>?>(
    bindKey,
    defaultValue,
    { it, value -> it.putSparseParcelableArray(bindKey, value) },
    { it.getSparseParcelableArray(bindKey) ?: defaultValue }
)

/* String */

/**
 * Bind string array list field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun StateSource.bindStateStringArrayList(bindKey: String, defaultValue: ArrayList<String>? = null) = injectField(
    bindKey,
    defaultValue,
    { it, value -> it.putStringArrayList(bindKey, value) },
    { it.getStringArrayList(bindKey) ?: defaultValue }
)

/**
 * Inject field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 * @param saveField saved field: fun(outState: Bundle, value: T).
 * @param restoreField restore field: fun(outState: Bundle): T.
 */
private fun<T> StateSource.injectField(
    bindKey: String,
    defaultValue: T,
    saveField: (Bundle, T) -> Unit,
    restoreField: (Bundle) -> T): ReadWriteProperty<StateSource, T> {

  val field = StateField<StateSource, T>(defaultValue)
  val item = FunFieldSaveItem<StateSource, T>(field, bindKey, saveField, restoreField)

  getSaveState().addSaveItem(item)
  return field
}