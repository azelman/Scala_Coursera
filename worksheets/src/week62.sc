object week62 {

  
  def wordOccurrences(w: String): List[(Char, Int)] = {
    var map = w groupBy (x => x.toLower)
    (for ((x, y) <- map) yield (x, y.length)).toList.sorted
  }                                               //> wordOccurrences: (w: String)List[(Char, Int)]
  
  var map = List("AAA", "bbb", "cc", "DdDdDd", "DDD", "aDasd")
                                                  //> map  : List[String] = List(AAA, bbb, cc, DdDdDd, DDD, aDasd)
  map.reduceLeft((a, b) => a+b)                   //> res0: String = AAAbbbccDdDdDdDDDaDasd
  
  var dict = List("tea", "ate", "eat")            //> dict  : List[String] = List(tea, ate, eat)
  var map2 = for(word <- dict) yield (wordOccurrences(word), word)
                                                  //> map2  : List[(List[(Char, Int)], String)] = List((List((a,1), (e,1), (t,1)),
                                                  //| tea), (List((a,1), (e,1), (t,1)),ate), (List((a,1), (e,1), (t,1)),eat))
  
  
  map2 groupBy { case (x,y) => y }                //> res1: scala.collection.immutable.Map[String,List[(List[(Char, Int)], String)
                                                  //| ]] = Map(tea -> List((List((a,1), (e,1), (t,1)),tea)), eat -> List((List((a,
                                                  //| 1), (e,1), (t,1)),eat)), ate -> List((List((a,1), (e,1), (t,1)),ate)))
  
}