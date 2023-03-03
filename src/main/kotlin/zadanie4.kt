fun main(args: Array<String>) {
    print("Enter the order price: ")
    val c = readLine().toString().toInt()
    val a = c.mod(10)

    if (a==1) {
        println("Сумма заказа: $c рубль")
        } else if (a in 2..4) {
            println("Сумма заказа: $c рубля")
            } else {
                println("Сумма заказа: $c рублей")
    }
}