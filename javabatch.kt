fun main(args: Array<String>){
    val listjava=mutableListOf<String>("anil","gopal","ankith","manish")
    val listkotlin=mutableListOf<String>("ankith","kumar","manish","rahul")
    listkotlin.addAll(listjava)

    println(listkotlin)

    val combine=listkotlin.union(listjava)
    println(combine)

    val distinct =combine.distinct().toList()
    print(distinct)




}


