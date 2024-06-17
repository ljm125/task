package com.example.myproject4

//import java.util.ArrayList
import kotlin.collections.ArrayList


fun main(){
    // 변수 list를 MutableList 통해 객체를 생성, 추가 가능하도록 설정함(정보는 MainMenu 클래스에서 받아옴)
    // 여기서 ArrayList()는 배열 형태의 리스트를 만드는 걸 의미함
    // 그렇다면 MainMenu 클래스에 있는 정보들은 어떻게 선언해야 하는지?? 원래는 println문으로 작성해서 결괏값을 출력했는데..
//    val list : MutableList<Burgers> = ArrayList()
//    val a = intest().toString()
//    list.add(a)
//    println(list)
    var mainmenu = MainMenu()
    var burger = Burgers()
    var ice = IceCream()
    var beverage = Drink()
    println("${mainmenu.menu()}")

    while (true) {

        print("원하는 종류를 선택하세요 : ")
        var number1 = readLine()!!

        if(number1=="0") {
            println("프로그램을 종료합니다.")
            break
        }

        when (number1) {
            "1" -> {
                println("${burger.burgers()}")
                print("원하시는 상품 번호를 입력하세요 : ")
                var check1 = readLine()!!
                when(check1){
                    "1" -> burger.shackburger()
                    "2" -> burger.smokeshack()
                    "3" -> burger.shroom()
                    "4" -> burger.cheese()
                    "0" -> println("뒤로가기 ${mainmenu.menu()}")
                }
            }
            "2" -> {
                println("${ice.iceCream()}")
                print("원하시는 상품 번호를 입력하세요 : ")
                var check2 = readLine()!!
                when (check2) {
                    "1" -> ice.chocolate()
                    "2" -> ice.vanila()
                    "3" -> ice.strawberry()
                    "4" -> ice.melon()
                    "0" -> println("뒤로가기 ${mainmenu.menu()}")
                }
            }
            "3" -> {
                println("${beverage.drink()}")
                print("원하시는 상품 번호를 입력하세요 : ")
                var check3 = readLine()!!
                when (check3) {
                    "1" -> beverage.coffee()
                    "2" -> beverage.black()
                    "3" -> beverage.lemonade()
                    "4" -> beverage.banana()
                    "0" -> println("뒤로가기 ${mainmenu.menu()}")
                }
            }
        }
    }

}

open class MainMenu(){
    fun menu() {
        println("[SHAKESHACK MENU]")
        println("1.Burgers")
        println("2.Ice Cream")
        println("3.Drinks")
        println("0.종료")
    }

    open fun burgers(){
        println("[Burgers MENU]")
        println("1.ShackBurger")
        println("2.SmokeShack")
        println("3.Shroom Burger")
        println("4.Cheeseburger")
        println("0.뒤로가기")
    }

    open fun iceCream() {
        println("[Ice Cream MENU]")
        println("1.Chocolate Ice Cream")
        println("2.Vanila Ice Cream")
        println("3.Strawberry Ice Cream")
        println("4.Melon Ice Cream")
        println("0.뒤로가기")
    }

    open fun drink(){
        println("[Drinks MENU]")
        println("1.Coffee")
        println("2.Black Tea")
        println("3.Lemonade")
        println("4.Banana Juice")
        println("0.뒤로가기")
    }
}

class Burgers : MainMenu() {

    fun shackburger(){
        var name = "ShackBurger"
        var price = 5500

        println("${name}의 가격은 ${price}입니다.")
    }

    fun smokeshack(){
        var name = "SmokeShack"
        var price = 6500

        println("${name}의 가격은 ${price}입니다.")
    }

    fun shroom(){
        var name = "Shroom Burger"
        var price = 7000

        println("${name}의 가격은 ${price}입니다.")
    }

    fun cheese(){
        var name = "Cheese Burger"
        var price = 5700

        println("${name}의 가격은 ${price}입니다.")
    }
}

class IceCream : MainMenu() {

        fun chocolate() {
            var name = "Chocolate Ice Cream"
            var price = 5000

            println("${name}의 가격은 ${price}입니다.")
        }

        fun vanila() {
            var name = "Vanila Ice Cream"
            var price = 6000

            println("${name}의 가격은 ${price}입니다.")
        }

        fun strawberry() {
            var name = "Strawberry Ice Cream"
            var price = 6000

            println("${name}의 가격은 ${price}입니다.")
        }

        fun melon() {
            var name = "Melon Ice Cream"
            var price = 5500

            println("${name}의 가격은 ${price}입니다.")
        }
    }

class Drink : MainMenu() {

    fun coffee() {
        var name = "Coffee"
        var price = 4500

        println("${name}의 가격은 ${price}입니다.")
    }

    fun black() {
        var name = "Black Tea"
        var price = 5000

        println("${name}의 가격은 ${price}입니다.")
    }

    fun lemonade() {
        var name = "Lemonade"
        var price = 4500

        println("${name}의 가격은 ${price}입니다.")
    }

    fun banana() {
        var name = "Banana Juice"
        var price = 5500

        println("${name}의 가격은 ${price}입니다.")

    }
}

//fun intest(){
//    var test = "5. Deep Cheese Burger"
//}