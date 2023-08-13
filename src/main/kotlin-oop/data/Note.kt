package data
// class Note -> file main Getter_Setter

class Note(title : String) {

    var title: String = title
        get() = field // fiela -> mengacu ke variable title
        set(value) {
            println("Bagian Setter")
            if (value.isNotBlank()) {
                field = value
            }else{
                println("Invalid title")
            }
        }
}

class BigNote(val title: String){
    val bigTitle: String
    get() = title.uppercase()
}