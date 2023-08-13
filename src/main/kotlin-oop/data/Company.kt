package data
// class COMPANY -> file main Function EQUALS
// class COMPANY -> file main FUNCTION HASHCODE

class Company(val name: String) {

    override fun hashCode(): Int {
        return name.hashCode()
    }
    override fun equals(other: Any?): Boolean {
        return when(other){
            is Company -> other.name == other.name
            else -> false
        }
    }
}