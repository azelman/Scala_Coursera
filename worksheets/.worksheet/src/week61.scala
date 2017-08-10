object week61 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(17); 
  
  val col = 2;System.out.println("""col  : Int = """ + $show(col ));$skip(14); 
  val row = 2;System.out.println("""row  : Int = """ + $show(row ));$skip(12); 
  val n = 4;System.out.println("""n  : Int = """ + $show(n ));$skip(30); 
  
  val queens = Vector(2,0);System.out.println("""queens  : scala.collection.immutable.Vector[Int] = """ + $show(queens ));$skip(130); 
  
  def diags =
  for {
  	c <- 0 until n
  	r <- 0 until n
  	if (c - col == r - row) || (c + col == r + row)
  	} yield (c, r);System.out.println("""diags: => scala.collection.immutable.IndexedSeq[(Int, Int)]""");$skip(59); 
 
	 
  val q =  (0 until queens.length) zip queens.reverse;System.out.println("""q  : scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(q ));$skip(44); val res$0 = 
  !(diags exists (x => q.toSet contains x));System.out.println("""res0: Boolean = """ + $show(res$0));$skip(11); val res$1 = 
  
  diags;System.out.println("""res1: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$1));$skip(315); 
     
     def isSafe(col: Int, queens: List[Int]): Boolean = {
    val row = queens.length
  	// 1st check columns
  	if (queens contains col) false
  	// 2nd check all diagonals
  	else {
  		val q =  (0 until queens.length) zip queens.reverse
  		!(diags(row, col, 4) exists (x => q.toSet contains x))
  		}
  };System.out.println("""isSafe: (col: Int, queens: List[Int])Boolean""");$skip(183); 
  
  def diags(row: Int, col: Int, n: Int): IndexedSeq[(Int, Int)] =
  	for {
  	c <- 0 until n
  	r <- 0 until n
  	if (c - col == r - row) || (c + col == r + row)
  	} yield (c, r);System.out.println("""diags: (row: Int, col: Int, n: Int)IndexedSeq[(Int, Int)]""");$skip(33); 
  	
  def show(sol: List[Int]) =;System.out.println("""show: (sol: List[Int])Null""")}
}
