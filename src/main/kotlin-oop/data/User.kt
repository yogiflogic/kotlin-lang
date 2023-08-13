package data

//  class User -> file main Properties_Constructor
//  class User -> file main Function ToString

//cara 1
//class User(usernameParam: String, passwordParam: String) {
//    var username: String = usernameParam
//    var password: String = passwordParam
//
//}

//cara ke 2 Recomeded (hanya bisa di primary constructor)
class User(var username: String,var password: String) {

    override fun toString(): String {
        return "User with username $username $password"
    }
}