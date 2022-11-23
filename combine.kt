fun main(){
    val listjava=mutableListOf<String>("ankith","gopal","anil","manish")
    val listkotlin=mutableListOf<String>("ankith","kumar","manish","rahul")
    val combine=listkotlin.union(listjava)
    println(combine)
}