package com.japptech.learningapplication

import android.os.Handler
import android.os.Looper
import android.os.Message


fun main() {

    println("Printing first statement")

//    Handler().postDelayed({
//             println("Printing this line after the delay of 3 sec")
//    }, 3000)

    val handler = Handler(Looper.getMainLooper())

// Posting a message to the main thread
    handler.post {
        // Code to be executed on the main thread
    }
}

class LooperThread : Thread() {
    var mHandler: Handler? = null
    override fun run() {
        Looper.prepare()

        mHandler = object : Handler() {
            override fun toString(): String {
                println("From to string")
                return super.toString()
            }

            override fun dispatchMessage(msg: Message) {
                println("From dispatch message")
                super.dispatchMessage(msg)
            }

            override fun getMessageName(message: Message): String {
                println("From get message name")
                return super.getMessageName(message)
            }

            override fun sendMessageAtTime(msg: Message, uptimeMillis: Long): Boolean {
                println("From send message at $uptimeMillis")
                return super.sendMessageAtTime(msg, uptimeMillis)
            }
        }

        Looper.loop()
    }
}