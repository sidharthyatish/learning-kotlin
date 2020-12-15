package basics

//val -> Constant
//var -> Variable
fun main() {
    val name = "Rick"
    var age = 70

    age+=1
    println("Name : $name Age : $age")

    //We can assign if and when statements to a variable/value
    var person = if(name=="Rick"){
        "Cool"
    }
    else{
        "Not cool"
    }

    // var test: String = null This is not possible
    var test: String? = null //This is possible
    //But if there is a potential null pointer exception then it will throw error during compilation
    //println(test.length) <- This will lead to compile error
    //We have to make sure it is not null
    if(test !=null){
        println(test.length)
    }
}

