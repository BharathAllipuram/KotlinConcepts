Kotlin basics 
 
# What is Kotlin? 
	Kotlin is a programming language that makes coding concise, cross-platform. It is widely used for various types of applications, including server-side development, Android app development, web development, and more. It is Google's official language for Android app development. Kotlin has gained significant popularity among developers due to its modern features, improved productivity, and seamless integration with existing Java codebases. 

1.code consise 

2.null safety 

3.extension functions 

4.coroutines - java(async) 

 
=> Data Types 
	Int, String, Boolean, Float, Double ... etc 
 
=> val , var and difference between them 
	var and val are both used to declare variables in Kotlin language. However, there are some key differences between them: 

VAR(Variable) 

It is a general variable. The value of a variable that is declared using var can be changed anytime throughout the run time. var is also called mutable and non-final variable, as there value can be changed anytime. 
 
VAL(Value) 

The object stored using val cannot be changed, it cannot be reassigned, it is just like the final keyword in java. val is immutable. Once assigned, val becomes read-only, however, the properties of a val object could be changed, but the object itself is read-only and cannot initiate multiple times 

CONST – It is used to declare the variable when the value remains same throughout application runtime. It cannot reinitialize again. It is a read-only property. 

 
	Use val for a variable whose value never changes. You can't reassign a value to a variable that was declared using val . Use var for a variable whose value can change 

 
 
=> when, if-else conditions 
	
=> Using takeIf and takeunless conditions 

- TakeIf condition goes inside lambda function if the condition satisfies and returns lamda. 
	- TakeUnLess condition goes inside lambda function if the condition does not satisfy. 
 
=> null safety 
	#Refer to NullSafety.kt file in code. 
 

=> Types of Functions  
	1) lambda, 2) scope, 3) inline, 4) Higher Order Function (HOF) 5) reified 
 
1) Lambda : 
 
	Lambda is a function without any name. 
	It is executed in two flower brackets { }. 
	  e.g. :  
		{ s: Int -> println(s)} // Here is ‘s’ is the parameter being passed to the function and after  arrow(->) is the body of the function that need to be executed. 
  
2) Scope:  
	Scope functions are functions that allow you to execute a block of code within a specific context, such as an object, and provide additional functionality and readability. The scope functions include let, apply, run, with, and also. 

Scope functions are used to make code more readable, clear and concise. 

Object reference – ‘this’ / ‘it’. 

Return value – context object / lambda result. 
 

let: working with nullable objects to avoid NullPointerException. 
 
The context object is available as an argument (it). 
The return value is the lambda result. 
 
 Refer -> https://kotlinlang.org/docs/scope-functions.html#let 
 

apply: changing object configuration. 
 
The context object is available as a receiver (this). 
The return value is the object itself. 
 
Refer -> https://kotlinlang.org/docs/scope-functions.html#apply 
 
 

run: operate on nullable object, executing lambda expressions. 
 
The context object is available as a receiver (this). 
The return value is the lambda result. 

 
 

Also: adding additional operations. 
 
The context object is available as an argument (it). 
The return value is the object itself. 
 
 

With: operating on non-null objects. 
 
The context object is available as a receiver (this). 
The return value is the lambda result. 
 
 

3) Inline:  
 
	An Inline function is a kind of function that is declared with the keyword "inline" just before the function declaration. Once a function is declared inline, the compiler does not allocate any memory for this function, instead the compiler copies the piece of code virtually at the calling place at runtime. 
 
Here's an example: 

inline fun calculateResult(a: Int, b: Int): Int { 
		return a + b 
	} 

In the example above, the calculateResult function is declared as an inline function. When the function is called, the compiler substitutes the function call with the actual body of the function, resulting in more efficient code execution. 

You should opt for an inline function in Kotlin in the following situations − 

When you need to access higher-order functions. 

When you need to allocate memory more efficiently. 

You should not turn a huge function "inline" because it will downgrade the performance of the application. 

Inline functions are useful when a function accepts another function or lambda as a parameter. 

You can use an inline function when you need to prevent "object creation" and have better control flow. 

 
4) HOF:  
	A higher-order function is a function that takes functions as parameters or returns a function. 
 
Refer -> https://amitshekhar.me/blog/higher-order-functions-and-lambdas-in-kotlin 
 
5) Reified:  
	Reified key word is used for determining the data type or class name in case of using a generic function.  
	Refied key word helps us in obtaining different return type for both functions with same name and same arguments. 
	Refied key word is used only along with the inline functions. 
 
example :  
 
inline fun<reified T> showMessage(marks: Int): T {  
	return when (T::class) {  
		Int::class -> marks as T  
		String::class -> "Congratulations! you scored more than 90%" as T  
		else -> "Please enter valid type" as T  
	}  
} 
 
 
fun main () {  
	val intMarks: Int = showMessage(70) // returning integer value  
	val stringMessage: String = showMessage(95) // returning string value  
	println("Your marks: $intMarks \nMessage: $stringMessage")  
} 
 
=> infix functions 
 
Functions marked with the infix keyword can also be called using the infix notation (omitting the dot and the parentheses for the call). Infix functions must meet the following requirements: 

They must be member functions or extension functions. 

They must have a single parameter. 

The parameter must not accept variable number of arguments and must have no default value. 
 
Example :  
 
class MyStringCollection {  
	infix fun add(s: String) { /*...*/ }  
 
	fun build() {  
		this add "abc" // Correct  
		add("abc") // Correct / 
		/add "abc" // Incorrect: the receiver must be specified  
	}  
} 

=> open class, data class and diff btw data and open class 

Kotlin Data Class: 

One of the many handy features that the Kotlin language offers is the data keyword. When we declare a class with the data keyword the compiler implements the equals(Object o), hashCode(), and toString() methods, thus saving us from the trouble to do it manually. 

Kotlin Open Class: 

In Kotlin, all the classes are final by default i.e. they can’t be inherited by default. In Java, you have to make your class final explicitly. So, to make a class inheritable to the other classes, you must mark it with the open keyword otherwise you will get an error saying “type is final so can’t be inherited”. 

In summary, data classes are best used for classes whose main purpose is to hold data, while open classes are used when you need to allow the class to be extended by other classes. 
 

=> difference between while and for loops 

- The 'for' loop is more appropriate for use in case the number of iterations is known in advance. The 'while' loop is preferably used in case the number of iterations is not specified beforehand. 
 
	For Loops allow you to run through the loop when you know how many times you’d like it to run through the problem such as for (var i; i < 10; i++); this will continually increase i untill that condition returns false, any number can replace the 10 even a variable. but it will quit once the condition is no longer being met. This is best used again for loops that you know how when they should stop. 

While Loops allow you a little more flexability in what you put in it, and when it will stop such as while ( i < 10) you can also substitue in a boolean(true/false) for 10 as well as many other types of varibles. 

The key difference between the two is organization between them, if you were going to increase to 10 it’d be a lot cleaner and more readable to use a for statement, but on the other hand if you were to use an existing variable in your program in your loop parameters it’d be cleaner to just wright a while loop. In the For loop you MUST create a new variable, thats not true for the While loop. 
 

=> Companion objects 
	-Syntax for the Companion object 
 
	class ClassName {  
		companion object {  
			const val propertyName: String 	= "Something..."  
			fun funName() { //... }  
		}  
	} 
 
	-Properties and functions defined within the companion object body are accessible by referring to the class name: 
 
	val property = ClassName.propertyName  
	ClassName.funName() 
 
	- it’s possible to use them inside the class without the class name 
 
=> Enum class 
 
	Enum classes are a convenient way to represent a concrete set of possible values. Each value has the properties name and ordinal (position). We can get an array of all values using the values companion object function or the enumValues top-level function. 
 
 =>Sealed class 
	 
	 Inheritor of sealed class or interface declared in package 		com.japptech.learningapplication.qwerty but it must be in package com.japptech.learningapplication where base class is declared 
 

=> Singleton classes 
 
	Singleton Class in Kotlin is also called as the Singleton Object in Kotlin. Singleton class is a class that is defined in such a way that only one instance of the class can be created and used everywhere. Many times, we create two different objects of the same class, but we must remember that creating two different objects also requires the allocation of two different memories for the objects. So, it is better to make a single object and use it again and again. 
 

=> Exception Handling 

An exception is an unwanted or unexpected event, which occurs during the execution of a program, i.e. at run time, that disrupts the normal flow of the program’s instructions. Exception handling is a technique, using which we can handle errors and prevent run time crashes that can stop our program. 

There are two types of Exceptions – 

Checked Exception – Exceptions that are typically set on methods and checked at the compile time, for example IOException, FileNotFoundException etc 

Unchecked Exception – Exceptions that are generally due to logical errors and checked at the run time, for example NullPointerException, ArrayIndexOutOfBoundException etc 
 

 

=> lateint , lazy 

=> how to check lateInit is initailized or not 
 
	if (this::name.isInitialized) { // name is declared as a lateinit variable 
		//initialised 
	}else{ 
		//Not initialised 

} 

=> difference btw lazy and lateInit 

=> when to use lateint, lazy  
 
	lateinit in Kotlin is useful in a scenario when we do not want to initialize a variable at the time of the declaration and want to initialize it at some later point in time, but we make sure that we initialize it before use. 

lazy in Kotlin is useful in a scenario when we want to create an object inside a class, but that object creation is expensive(Which consumes more amount of memory) and that might lead to a delay in the creation of the object that is dependent on that large object. When we use lazy keyword , the expensive object creation takes time only for the first time and then the large object is fetched from cache memory. If lazy is not used then every time the expensive object gets initialized and takes time whenever we call the inside object. 
 
=> Generics 
 
Functions can have generic parameters, which are specified using angle brackets before the function name: 
 
	/////// 
	fun <T> genericsExample(value: T) {  
		println(value)  
	}  
 
	fun main () {  
		genericsExample<String> ("Learning Generics!")  
		genericsExample<Int> (100)  
	} 
 
	Response :  
		Learning Generics!  
		100 
 
 

 

=> handlers and runnable, Loopers 
 
	=> A Handler is a class in Android that allows you to schedule and execute code on a specific thread. It acts as a message queue for threads, allowing them to communicate with each other. A Handler is associated with a particular thread and can be used to post Runnable objects or Message objects to be processed by that thread. 

Here's an example of creating a Handler and posting a Runnable to be executed: 
	val handler = Handler() 

handler.post(Runnable { 

    		// Code to be executed on the associated thread 

}) 

 

=> A Runnable is an interface in Kotlin that represents a unit of work to be executed. It encapsulates a block of code that can be run independently. In the context of Android, a Runnable can be used to define a task that needs to be executed on a specific thread. 

Here's an example of creating a Runnable and running it on a background thread: 

val myRunnable = Runnable { 

   		 // Code to be executed on a background thread 

} 

Thread(myRunnable).start() 

=> A Looper is an Android class that provides a message loop for a thread. It enables the thread to process messages and execute tasks sequentially. Each thread that needs to process messages must have a Looper associated with it. The main thread in Android (also known as the UI thread) has a Looper by default. 

To create a Looper for a background thread, you can use the Looper.prepare() and Looper.loop() methods: 
 
	fun backgroundThread() { 

    		Looper.prepare() // Create a new Looper for the thread 

    		// Perform background tasks here 

    		Looper.loop() // Start the message loop 

} 

  

// Start the background thread 

Thread { backgroundThread() }.start() 


=> Threads 
 
	A thread represents an individual sequence of execution within a program. It is a lightweight unit of execution that can run concurrently with other threads, allowing for concurrent and parallel programming. Threads enable you to perform multiple tasks simultaneously or handle long-running operations without blocking the main execution flow. 
 
 

-> mutli threading,  
 
--=> Refer ThreadAndMultiThreadExample.kt in code 

 

 

 
