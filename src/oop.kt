fun main() {
    val user=user("Tabitha","Aluel","alueltabitha@gmail.com","0798008326","Aluel@123")
    println(user.email)
    println(user.password)
    var Tabz=Human("Tabby",22,66)
        Tabz.eat(8)
        println(Tabz.weight)
    Tabz.speak("I love myself")
    Tabz.birthday()


}
data class user(val firstName:String,val lastName:String,val email:String,val phoneNumber:String,val password:String){

}
class Human(var name:String,var age:Int,var weight:Int) {
    fun eat(foodWeight:Int):Int{
        println("I am eating $foodWeight kgs of food")
        weight=weight+foodWeight
        return weight

    }
    fun speak(speech:String) {
        println("$speech")
    }
    fun birthday() {
        age ++
        println(age)
    }



}
