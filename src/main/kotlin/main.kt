fun main() {
    val users: Array<User> = arrayOf(User(), User())
    users[0].subscribe()
    users[0].buy(1001u)
    users[0].buy(10000u)
    users[0].buy(5000u)

    users[1].buy(1001u)
    users[1].buy(10000u)
    users[1].buy(5000u)
}
