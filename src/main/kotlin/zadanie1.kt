fun main(args: Array<String>) {
    print("Enter a two-digit number: ")
    val a = readLine().toString().toInt()
    val b = a.mod(10)
    val c = a.div(10)

        if (b==7||c==7) {
            println("yep")
        } else {
            println("nope")
        }
}