
fun main(args: Array<String>){
    val listjava=mutableListOf<String>("anil","gopal","ankith","manish")
    val listkotlin=mutableListOf<String>("ankith","kumar","manish","rahul")
    listkotlin.addAll(listjava)

    println(listkotlin)
}