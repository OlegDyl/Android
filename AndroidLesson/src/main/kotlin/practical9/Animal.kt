package practical9

/*
open class Animal(var energy: Int, var weight: Int, var age: Int , val maxAge: Int = 15, var name: String) :
    MutableList<Animal> {  // Энергия, вес, максимальный возраст и имя должны инициализироваться через конструктор.


    open fun iterations () {
        repeat(10){
        var random = (1..4).random()

        fun pult (random: Int) {
            when ((1..4).random()) {
                1 -> sleep()
                2 -> nutrition()
                3 -> go()
                4 -> birth()
                else -> println("Ошибка")
            }
        }}
    }
*/
/*    fun main() {
        repeat(3) {
            println("Привет")
        }
    }*//*


    fun pult (functions: Int) {
        when ((1..4).random()) {
            1 -> sleep()
            2 -> nutrition()
            3 -> go()
            4 -> birth()
            else -> println("Ошибка")
        }
    }

    */
/*3.  Добавьте вычисляемое свойство isTooOld — Boolean. Оно должно сравнивать текущий возраст
    с максимальным и возвращать true, если текущий возраст равен или больше максимального.*//*






    open fun sleep() {

        energy = energy + 5
        age = age + 1
     //   println("${name} спит")

        */
/*Во время сна:
        Энергия животного увеличивается на 5, а возраст — на 1.
        В консоль выводится сообщение: «${имя животного} спит».*//*

    }

    open fun nutrition() {

        energy = energy + 3
        weight = weight + 1
        age = age + 1
        //println("${name} ест")

        */
/*Во время питания:
        Энергия животного увеличивается на 3, а вес — на 1.
        Возраст животного может увеличиться на 1.
        В консоль выводится сообщение: «${имя животного} ест».*//*

    }

    open fun go () {
        energy = energy - 5
        weight = weight - 1
        age = age + 1
        //println("${name} передвигается")

       */
/* Во время передвижения:
        Энергия животного уменьшается на 5, а вес — на 1.
        Возраст животного может увеличиться на 1.
        В консоль выводится сообщение: «${имя животного} передвигается».*//*

    }

    open fun birth() { // Функция рождения. Имя и максимальный возраст как у родителя. Энергия случайно от 1-10. Вес случайно от 1-5.
        val child = Animal(
        energy = (1..10).random(),
        weight = (1..5).random(),
        maxAge = maxAge,
        name = this.name,
        age = 0)

        println("Родился $name у которого $energy энергии и вес $weight")
        // return child
    }

    companion object

}

*/
