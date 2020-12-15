package basics

fun main() {
    //Lambda = function as an input or output

    //Lambda return type (Int)->Int
    val twoTimes = {x: Int -> x*2}

    //Lambda return type (Int,Int)->Int
    val add = {x: Int,y: Int -> x+y}

    val list = (1..20).toList()

    // note: since the lambda is only param, we can ignore the () for filter
    // list.filter({x -> x%2==0}) we can ignore ()
    println(list.filter { x -> x%2==0 }) //filter is taking input as a lambda

    //If the lambda is having only one parameter (like above filter) we can use special 'it' variable

    println(list.filter { it % 2 ==0 })

    //Using extension function to get the same result

    println(list.filter { it.even() })

    //Using a normal function to get same result
    println(list.filter(::isEven))
}

//extension function
fun Int.even() = this % 2 ==0

//normal function
fun isEven(i : Int) = i%2==0