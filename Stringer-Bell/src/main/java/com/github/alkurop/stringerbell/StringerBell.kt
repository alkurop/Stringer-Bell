package com.github.alkurop.stringerbell

import android.content.Context
import androidx.annotation.StringRes

sealed class Stringer {
    abstract fun bell(context: Context): String

    class OfString(private val string: String) : Stringer() {
        override fun bell(context: Context): String {
            return string
        }
    }

    class OfRes(
        @StringRes private val res: Int,
        private vararg val params: Any
    ) : Stringer() {
        override fun bell(context: Context): String {
            return context.getString(res, *params)
        }
    }
}

