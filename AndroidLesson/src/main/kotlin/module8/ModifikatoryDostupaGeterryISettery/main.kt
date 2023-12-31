package module8.ModifikatoryDostupaGeterryISettery
fun main() {


                                 /*Модификаторы доступа. Геттеры и Сеттеры

    Цели:
    - что такое модификаторы доступа и для чего они нужны
    - как модификаторы доступа влияют на работу с экземпляром класса
    - что такое геттеры/сеттеры и для чего они могут применяться
    */

    val renault = Car(descriptor = "Renault" to "Logan", color = "Brown")
    println("Current speed - ${renault.currentSpeed}")
   // println("Current fuel - ${renault.fuelCount}")

    renault.accelerate(100.0)
    println("Current speed - ${renault.currentSpeed}")
    //  println("Current fuel - ${renault.fuelCount}")

    renault.accelerate(50.0)
    println("Current speed - ${renault.currentSpeed}")
    // println("Current fuel - ${renault.fuelCount}")

    // Посмотрим к каким полям и методам может обращаться экземпляр класса Car

    renault.currentSpeed = 1000.0 // Изменяемое свойство, поэтому можем ему напрямую присвоить значение,
    // при этом топливо на ускорение не потратиться. Или же мы можем вручную присвоить значение текущей скорости
    // отрицательное значение
    renault.currentSpeed = - 1000.0

   // renault.useFuel(100.0) // Добавляем количество топлива. В итоге топливо потратится на что-то, но при
   // этом ускорения у машины не будет. Такого быть не должно!!!!! Только автомобиль может взаимодействовать со своей
   // топливной системой и тратить топливо. Чтобы избегать подобных ситуаций предусмотрены специальные модификаторы доступа.
   // Для этого функции useFuel поставим модификатор private и переменным currentSpeed и fuelCount из класса Car


  /*                                            Модификаторы доступа

    Модификатор доступа - ключевые слова, которые определяют область видимости для компонентов программы и ограничивают
    доступ к ним. Они могут применяться к полям, методам, конструкторам, самим классам и другим компонентам. Так же
    модификаторы доступа могут быть при объявлении полей через конструктор

    Существу т 4 модификатора доступа
    = public(модификатор по умолчанию) - доступен для всех
    - protected - доступен только для членов класса и классов-потомков
    - internal - доступен для всех внутри модуля
    - private - доступен только внутри класса


    Для более гибкой настройки доступности полей можно использовать геттеры и сеттеры - специальные функции которые можно
    задать каждому полю


                                             Геттеры и сеттеры

    get/set() - специальные функции, которые управляют считыванием и установкой значения поля.
    Вызываются каждый раз при обращении к полю
    - get() - вызывается при считывании значения
    - set() - вызывается при установке значения

    Вот пример объявления свойства с явными геттером и сеттером:

var name: String = ""
    get() = field.capitalize()
    set(value) {
        field = value.trim()
    }



 */

    println("Current speed - ${renault.currentSpeed}")

   /* Геттерами и сеттерами так же можно добавлять модификаторы доступа. Сделаем Сеттер прайват, а геттер оставим публичным
   get
   private set // читать может кто угодно, а устанавливать только члены этого класса

   Важное ограничение - нельзя сделать приватный геттер, если само поле с модификатором паблик.
   Аналогично и сеттером, если поле пометить приватным модификатором, то нельзя сделать сеттер публичным.
   Указывать геттеры и сеттеры явно не нужно, они нужны если необходимо настроить доступ или добавить какие-то
   дополнительные действия
   */


}






