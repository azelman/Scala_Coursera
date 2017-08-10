object week61 {
  println("Welcome to the Scala worksheet")
  
  val col = 2
  val row = 2
  val n = 4
  
  val queens = Vector(2,0)
  
  def diags =
  for {
  	c <- 0 until n
  	r <- 0 until n
  	if (c - col == r - row) || (c + col == r + row)
  	} yield (c, r)
 
	 
  val q =  (0 until queens.length) zip queens.reverse
  !(diags exists (x => q.toSet contains x))
  
  diags
     
     def isSafe(col: Int, queens: List[Int]): Boolean = {
    val row = queens.length
  	// 1st check columns
  	if (queens contains col) false
  	// 2nd check all diagonals
  	else {
  		val q =  (0 until queens.length) zip queens.reverse
  		!(diags(row, col, 4) exists (x => q.toSet contains x))
  		}
  }
  
  def diags(row: Int, col: Int, n: Int): IndexedSeq[(Int, Int)] =
  	for {
  	c <- 0 until n
  	r <- 0 until n
  	if (c - col == r - row) || (c + col == r + row)
  	} yield (c, r)
  	
  def show(sol: List[Int]) =
}