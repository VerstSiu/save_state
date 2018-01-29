
# Save State

Restore and save instance state helper for `Activity` and `Fragment`. Use `kotin` to bind saved state field easily.

Only support for `Bundle` related `put` and `set` methods at `API 15`.

`Serializable` is not supported as default. Change your entity class to implementation of `Parcelable` if your need.

## Usage

1. Make your activity/fragment extends `BaseActivity`, `BaseFragment`, or write basic codes by your own:

    ```kotlin
    open class BaseFragment: Fragment(), StateSource {

      private val saveState = SaveState()

      override fun getSaveState() = saveState

      override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        saveState.save(outState)
      }

      override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        saveState.restore(savedInstanceState)
      }
    }
    ```

2. Use `bindXXField` at sub activity/fragment class:

    ```kotlin
    class MyFragment: BaseFragment() {

      /**
       * Username.
       */
      val username by bindStringField("user_name")

      /**
       * Age.
       */
      val age by bindIntField("age", 11)

      fun testField() {
        // Just use it like a simple field
        // And not need to care about data state
        val name = username.getValue()
        username.setValue("Tony")

        val age = age.getValue()
        age.setValue(12)
      }
    }
    ```

## Support Field Types

* Byte
* ByteArray
* Short
* ShortArray
* Char
* CharArray
* Int
* IntArray
* ArrayList&lt;Int&gt;
* Long
* LongArray
* Float
* FloatArray
* Double
* DoubleArray
* Boolean
* BooleanArray
* String
* StringArray
* ArrayList&lt;String&gt;
* Bundle
* CharSequence
* Array&lt;CharSequence&gt;
* ArrayList&lt;CharSequence&gt;
* T: Parcelable
* Array&lt;Parcelable&gt;
* ArrayList&lt;T: Parcelable&gt;
* SparseArray&lt;T: Parcelable&gt;

## License

```

   Copyright(c) 2017 VerstSiu

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

```