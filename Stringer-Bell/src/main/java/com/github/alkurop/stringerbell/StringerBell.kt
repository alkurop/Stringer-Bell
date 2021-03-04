package com.github.alkurop.stringerbell

import android.content.Context
import androidx.annotation.StringRes

class Stringer(
    @StringRes private val res: Int,
    private vararg val params: Any
) {
    fun bell(context: Context): String {
        return context.getString(res, *params)
    }
}
