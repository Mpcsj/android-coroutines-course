package br.mpcsj.common.utils

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

class ViewUtils {
    companion object{
        val TAG = ViewUtils::class.java.canonicalName
        fun hideKeyboardFromActivity(activity:Activity){
            val imm:InputMethodManager = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
            var view =activity.currentFocus
            if(view == null){
                view = View(activity)
            }
            imm.hideSoftInputFromWindow(view.windowToken,0)
        }
        fun hideKeyboardFromContext(context:Context,view:View){
            println("$TAG::hideKeyboardFromContext")
            val imm:InputMethodManager = context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken,0)
        }
    }
}