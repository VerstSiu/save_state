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
 * Bind boolean field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun ArgumentSource.bindArgsBoolean(bindKey: String, defaultValue: Boolean = false) = injectField<Boolean>(
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
fun ArgumentSource.bindArgsBooleanArray(bindKey: String, defaultValue: BooleanArray? = null) = injectField<BooleanArray?>(
    bindKey,
    defaultValue,
    { it, value -> it.putBooleanArray(bindKey, value) },
    { it.getBooleanArray(bindKey) ?: defaultValue }
)

/**
 * Bind double field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun ArgumentSource.bindArgsDouble(bindKey: String, defaultValue: Double = 0.0) = injectField<Double>(
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
fun ArgumentSource.bindArgsDoubleArray(bindKey: String, defaultValue: DoubleArray? = null) = injectField<DoubleArray?>(
    bindKey,
    defaultValue,
    { it, value -> it.putDoubleArray(bindKey, value) },
    { it.getDoubleArray(bindKey) ?: defaultValue }
)

/**
 * Bind int field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun ArgumentSource.bindArgsInt(bindKey: String, defaultValue: Int = 0) = injectField<Int>(
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
fun ArgumentSource.bindArgsIntArray(bindKey: String, defaultValue: IntArray? = null) = injectField<IntArray?>(
    bindKey,
    defaultValue,
    { it, value -> it.putIntArray(bindKey, value) },
    { it.getIntArray(bindKey) ?: defaultValue }
)

/**
 * Bind long field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun ArgumentSource.bindArgsLong(bindKey: String, defaultValue: Long = 0) = injectField<Long>(
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
fun ArgumentSource.bindArgsLongArray(bindKey: String, defaultValue: LongArray? = null) = injectField<LongArray?>(
    bindKey,
    defaultValue,
    { it, value -> it.putLongArray(bindKey, value) },
    { it.getLongArray(bindKey) ?: defaultValue }
)

/**
 * Bind string field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun ArgumentSource.bindArgsString(bindKey: String, defaultValue: String? = null) = injectField<String?>(
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
fun ArgumentSource.bindArgsStringArray(bindKey: String, defaultValue: Array<String>? = null) = injectField<Array<String>?>(
    bindKey,
    defaultValue,
    { it, value -> it.putStringArray(bindKey, value) },
    { it.getStringArray(bindKey) ?: defaultValue }
)

/**
 * Bind bundle field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun ArgumentSource.bindArgsBundle(bindKey: String, defaultValue: Bundle? = null) = injectField<Bundle?>(
    bindKey,
    defaultValue,
    { it, value -> it.putBundle(bindKey, value) },
    { it.getBundle(bindKey) ?: defaultValue }
)

/**
 * Bind byte field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun ArgumentSource.bindArgsByte(bindKey: String, defaultValue: Byte = 0) = injectField<Byte>(
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
fun ArgumentSource.bindArgsByteArray(bindKey: String, defaultValue: ByteArray? = null) = injectField<ByteArray?>(
    bindKey,
    defaultValue,
    { it, value -> it.putByteArray(bindKey, value) },
    { it.getByteArray(bindKey) ?: defaultValue }
)

/**
 * Bind char field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun ArgumentSource.bindArgsChar(bindKey: String, defaultValue: Char = 0.toChar()) = injectField<Char>(
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
fun ArgumentSource.bindArgsCharArray(bindKey: String, defaultValue: CharArray? = null) = injectField<CharArray?>(
    bindKey,
    defaultValue,
    { it, value -> it.putCharArray(bindKey, value) },
    { it.getCharArray(bindKey) ?: defaultValue }
)

/**
 * Bind char sequence field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun ArgumentSource.bindArgsCharSequence(bindKey: String, defaultValue: CharSequence? = null) = injectField<CharSequence?>(
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
fun ArgumentSource.bindArgsCharSequenceArray(bindKey: String, defaultValue: Array<CharSequence>? = null) = injectField<Array<CharSequence>?>(
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
fun ArgumentSource.bindArgsCharSequenceArrayList(bindKey: String, defaultValue: ArrayList<CharSequence>? = null) = injectField(
    bindKey,
    defaultValue,
    { it, value -> it.putCharSequenceArrayList(bindKey, value) },
    { it.getCharSequenceArrayList(bindKey) ?: defaultValue }
)

/**
 * Bind float field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun ArgumentSource.bindArgsFloat(bindKey: String, defaultValue: Float = 0F) = injectField<Float>(
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
fun ArgumentSource.bindArgsFloatArray(bindKey: String, defaultValue: FloatArray? = null) = injectField<FloatArray?>(
    bindKey,
    defaultValue,
    { it, value -> it.putFloatArray(bindKey, value) },
    { it.getFloatArray(bindKey) ?: defaultValue }
)

/**
 * Bind integer array list field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun ArgumentSource.bindArgsIntegerArrayList(bindKey: String, defaultValue: ArrayList<Int>? = null) = injectField(
    bindKey,
    defaultValue,
    { it, value -> it.putIntegerArrayList(bindKey, value) },
    { it.getIntegerArrayList(bindKey) ?: defaultValue }
)

/**
 * Bind parcelable field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun<T: Parcelable> ArgumentSource.bindArgsParcelable(bindKey: String, defaultValue: T? = null) = injectField<T?>(
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
fun ArgumentSource.bindArgsParcelableArray(bindKey: String, defaultValue: Array<Parcelable>? = null) = injectField<Array<Parcelable>?>(
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
fun<T: Parcelable> ArgumentSource.bindArgsParcelableArrayList(bindKey: String, defaultValue: ArrayList<T>? = null) = injectField(
    bindKey,
    defaultValue,
    { it, value -> it.putParcelableArrayList(bindKey, value) },
    { it.getParcelableArrayList(bindKey) ?: defaultValue }
)

/**
 * Bind short field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun ArgumentSource.bindArgsShort(bindKey: String, defaultValue: Short = 0) = injectField<Short>(
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
fun ArgumentSource.bindArgsShortArray(bindKey: String, defaultValue: ShortArray? = null) = injectField<ShortArray?>(
    bindKey,
    defaultValue,
    { it, value -> it.putShortArray(bindKey, value) },
    { it.getShortArray(bindKey) ?: defaultValue }
)

/**
 * Bind string array list field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun<T: Parcelable> ArgumentSource.bindArgsSparseParcelableArray(bindKey: String, defaultValue: SparseArray<T>? = null) = injectField<SparseArray<T>?>(
    bindKey,
    defaultValue,
    { it, value -> it.putSparseParcelableArray(bindKey, value) },
    { it.getSparseParcelableArray(bindKey) ?: defaultValue }
)

/**
 * Bind string array list field.
 *
 * @param bindKey bind key.
 * @param defaultValue default value.
 */
fun ArgumentSource.bindArgsStringArrayList(bindKey: String, defaultValue: ArrayList<String>? = null) = injectField(
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
private fun<T> ArgumentSource.injectField(
    bindKey: String,
    defaultValue: T,
    saveField: (Bundle, T) -> Unit,
    restoreField: (Bundle) -> T): ReadWriteProperty<ArgumentSource, T> = ArgumentField<T>(bindKey, defaultValue, saveField, restoreField)