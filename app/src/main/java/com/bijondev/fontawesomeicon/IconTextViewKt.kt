package com.bijondev.fontawesomeicon

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.Gravity
import android.widget.TextView

class IconTextViewKt : TextView {
    private var context: Context

    constructor(context: Context) : super(context) {
        this.context = context
        createView()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        this.context = context
        createView()
    }

    private fun createView() {
        gravity = Gravity.CENTER
        val fontPath = "webfonts/fa-regular-400.ttf"
        val tf = Typeface.createFromAsset(context.assets, fontPath)
        typeface = tf
    }
}