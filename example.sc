import scala.Console.in
print("Hello scala")

val substr: String = "l"
val my_seq: Seq[String] = Seq("privet", "world", "Hello", "cup", "of", "tea")

class Sug(comp_names:Seq[String]){
  def suggest(input:String):Seq[String] = {
    val resss = comp_names.filter(_.contains(input))
    resss
  }

}
val sug = new Sug(my_seq)
println(sug.suggest(substr))



//for (str <- my_seq) {
//  if (str.contains(substr)) {
//    println(str)
//  }
//
//}
//println(my_seq)
