import kotlin.math.ceil

class User {
    private var subscribed : Boolean = false
    private var purchases : UInt = 0u
    private val id : UInt = number

    companion object {
        var number : UInt = 0u
    }

    init {
        number++
    }

    private fun addPurchases(value : UInt) {
        purchases += value
    }

    fun subscribe() {
        subscribed = true
    }

    fun unSubscribe() {
        subscribed = false
    }

    fun buy(price : UInt) : UInt {
        println()
        println("$this:\nКупил за $price")
        var finalPrice : UInt
        when (purchases) {
            in 0u..1000u -> finalPrice = price
            in 1001u..10000u -> {
                finalPrice = price - 100u
                println("Скидка 100. Цена: $finalPrice")
            }
            else -> {
                finalPrice = ceil(price.toDouble() * 0.95).toUInt()
                println("Скидка 5%. Цена: $finalPrice")
            }
        }
        if (subscribed) {
            finalPrice = ceil(finalPrice.toDouble() * 0.99).toUInt()
            println("Скидка 1%. Цена: $finalPrice")
        }
        addPurchases(price)
        return finalPrice
    }

    override fun toString(): String {
        return "Пользователь номер ${id + 1u}"
    }
}