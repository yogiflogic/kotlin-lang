package data
// class Create_Product_Request -> file main Reflection

data class Create_Product_Request(
    val  id: String,
    val  name: String,
    val  price: Long
)

data class Create_Category_Request(
    val  id: String,
    val  name: String
)