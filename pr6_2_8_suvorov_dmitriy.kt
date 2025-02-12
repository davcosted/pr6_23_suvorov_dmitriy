fun main(){
    try {
        println("Введите трёхзначное число:")
        var num = readLine()!!.toInt()
        println("Введите число А:")
        var a = readLine()!!.toInt()
        var num1: Int
        var num2: Int
        var num3: Int
        var rez: Int
        var rez1: Int
        num1 = num / 100
        num2 = num / 10 % 10
        num3 = num % 10
        rez = num1 * num2 * num3
        when {
            num <=0 -> println("<0 Введите другое число")
            num < 100 && num < 999 -> println("Неверное число")
            rez % num == 0 -> println("Произведение его цифр кратно числу А")
            else -> println("Произведение его цифр некратно числу А")
        }
    }catch(e:Exception) {
            println("Неверный формат данных")
    }
}