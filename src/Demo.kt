//In Kotlin, type aliases are a way to create a new name for an existing type. They are useful for making code more readable, and for abstracting away the details of a complex type.

//In this example, a new type alias called UserName is defined, which is simply an alias for the String type. Now, anywhere in the code where the String type is used, the UserName alias can be used instead, like this:

////This function takes a UserName parameter instead of a String, but they are both the same underlying type, so they can be used interchangeably.
typealias UserName = String

fun printUserName(name: UserName) {
    println("The user's name is $name")
}

fun main(args: Array<String>) {
	printUserName("Vaibhav Mojidra")
}


// EXAMPLE : typealias Operation = (Int, Int) -> Int
//In this example, a new type alias called Operation is defined, which represents a function that takes two Int parameters and returns an Int result. This can make the code more readable and easier to understand when working with functions that have complex types.

