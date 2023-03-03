fun main(args: Array<String>) {
    print("Enter a  number: ")
    val c = readLine().toString().toInt()
    print("Enter first interval number: ")
    val a = readLine().toString().toInt()
    print("Enter second interval number: ")
    val b = readLine().toString().toInt()

    if (c in a..b) {
        println("yes, the number $c enters the interval between $a and $b")
    } else {
        println("no, the number $c doesn't enters the interval between $a and $b")
    }
}