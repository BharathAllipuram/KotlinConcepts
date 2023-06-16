package com.japptech.learningapplication

import kotlin.concurrent.thread

fun main() {
    val thread1 = thread {
        // Code to be executed in thread 1
        for (i in 1..5) {
            println("Thread 1: $i")
            Thread.sleep(500)
        }
    }

    val thread2 = thread {
        // Code to be executed in thread 2
        for (i in 1..5) {
            println("Thread 2: $i")
            Thread.sleep(500)
        }
    }

    // Wait for both threads to finish
    thread1.join()
    thread2.join()

    println("Main thread exiting")
}
