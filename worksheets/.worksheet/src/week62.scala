object week62 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(182); 

  
  def wordOccurrences(w: String): List[(Char, Int)] = {
    var map = w groupBy (x => x.toLower)
    (for ((x, y) <- map) yield (x, y.length)).toList.sorted
  };System.out.println("""wordOccurrences: (w: String)List[(Char, Int)]""");$skip(66); 
  
  var map = List("AAA", "bbb", "cc", "DdDdDd", "DDD", "aDasd");System.out.println("""map  : List[String] = """ + $show(map ));$skip(32); val res$0 = 
  map.reduceLeft((a, b) => a+b);System.out.println("""res0: String = """ + $show(res$0));$skip(42); 
  
  var dict = List("tea", "ate", "eat");System.out.println("""dict  : List[String] = """ + $show(dict ));$skip(67); 
  var map2 = for(word <- dict) yield (wordOccurrences(word), word);System.out.println("""map2  : List[(List[(Char, Int)], String)] = """ + $show(map2 ));$skip(41); val res$1 = 
  
  
  map2 groupBy { case (x,y) => y };System.out.println("""res1: scala.collection.immutable.Map[String,List[(List[(Char, Int)], String)]] = """ + $show(res$1))}
  
}
