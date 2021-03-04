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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Stringer

        if (res != other.res) return false
        if (!params.contentEquals(other.params)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = res
        result = 31 * result + params.contentHashCode()
        return result
    }

    companion object {
        fun ofString(string: String) = Stringer(R.string.sb_placeholder, string)
    }
}
