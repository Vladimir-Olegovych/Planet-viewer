package com.gigcreator.planetviewer.presentation.functions

import android.content.Context
import android.widget.Toast

internal fun toast(str: String, context: Context){
    Toast.makeText(context, str, Toast.LENGTH_SHORT).show()
}