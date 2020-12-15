package basics

fun main() {
    //Map -> applies a function to all the elements in a collection
    val list = (1..10).toList()
    val doubles = list.map { it * 2 }

    println(list)
    println(doubles)

    //flatmap
    //flatmap = map().flatten

    val nestedList = listOf(
        (1..10).toList(),
        (11..20).toList(),
        (21..30).toList()
    )

    val unFlattened = nestedList.map { it.sortedDescending() }
    val flattened = nestedList.flatMap { it.sortedDescending() }
    print("SIZE: "+ unFlattened.size + " ")
    println(unFlattened) // Gives list of lists

    print("SIZE: "+ flattened.size + " ")
    println(flattened) //Gives list

}