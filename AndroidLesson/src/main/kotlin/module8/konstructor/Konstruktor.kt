package module8.konstructor

fun main() {
   /*                                 Конструкторы

    - что такое конструктор класса и какие они бывают
    - как работать с конструкторами класса

    Экземпляры являются разными объектами, но сейчас будут обладать одинаковыми свойсвами. Пример как на сборочной линии
    завода - создается определенная модель автомобиля и в результате на складах завода будет стоять множество автомобилей
    одной и той же марки, модели и цвета. Или представим автовоз который доставляет модели к диллеру - он везет шесть
    одинаковых машин, а мы можем сказать что он везет шесть экземпляров нашего класса Car/


    Конструкторы
    Конструктор - специальная функция, которая вызывается для создания экземпляра класса
    Конструктор позволяет:
    - передать аргумент для инициализации полей класса
    - полноценно создать поле класса
    */

    val vw = Car(brand = "VW", model = "Beetle", color = "Green")
    val lada = Car(brand = "Lada", model = "Vesta", color = "Yellow")
    val bmw = Car(brand = "BMW", model = "X6")  // мы объявили три экземпляра класса car с разними параметрами

   // ниже объявим функцию для вывода печати fun printInfo

    printInfo(vw)
    printInfo(lada)
    printInfo(bmw)

    /*У класса может быть несколько конструкторов. Основной конструктор называется первичным

    Первичный конструктор
    - указывается при объявлении класса
    - может принимать аргументы
    - может описывать поля
    - не может содержать исполняемый код. Исполняемый код должен быть размещен в специальных блоках init

     Дополнительный конструктор описывается с помощью ключевого слова constructor

     Вторичный конструктор
     - указывается в теле с помощью ключевого слова constructor
     - может принимать аргументы
     - не может описывать поля
     - может содержать исполняемый код. Исполняемый код размещен в теле конструктора

     дополнительный конструктор обязательно должен вызывать первичный, если у класса первичный конструктор явно указан,
     делается это с помощью специального ключевого слова - this.
     Создадим дополнительный который будет создавать экземпляр автомобиля используя другие параметры(см. класс Car)

    */

    val renault = Car(descriptor = "Renault" to "Logan", color = "Brown")
    printInfo(renault)

}

fun printInfo(car: Car) {
    println("Brand - ${car.brand}, model - ${car.model}, color - ${car.color}")

}