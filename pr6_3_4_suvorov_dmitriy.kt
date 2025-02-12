fun main(){
    println("Введите стороны A B ")
    try {
        var a = readLine()!!.toInt()
        var b = readLine()!!.toInt()
        println("Введите стороны C D")
        var c = readLine()!!.toInt()
        var d = readLine()!!.toInt()
        when {
            a <= c && b <= d -> println("Первый конверт войдет во второй")
            a >= c && b >= d -> println("Второй конверт войдет в первый")
            else -> println("Конверт не войдет в другой")
        }
    }catch(e:Exception)
    {
        println("Неверный формат данных")
    }
}