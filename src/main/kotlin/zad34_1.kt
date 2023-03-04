import kotlin.math.pow
fun main() {
    cubenumbers()
}
fun cubenumbers() {
    val a = readLine().toString().toInt()
    val b = readLine().toString().toInt()
    var cube = a.toDouble()
    while (cube<=b) {
        println(cube.pow(3))
        cube++
    }
}