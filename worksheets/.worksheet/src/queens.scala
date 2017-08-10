object queens {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(292); 
  def nqueens(n: Int): Set[List[Int]] = {
  	def placeQueens(k: Int): Set[List[Int]] = {
  		if (k == 0) Set(List())
  		else
  			for {
  				queens <- placeQueens(k-1)
  				col <- 0 until n
  				if(isSafe(col, queens))
  			} yield col :: queens
  	}
  	placeQueens(n)
  };System.out.println("""nqueens: (n: Int)Set[List[Int]]""");$skip(223); 
  
  def isSafe(col: Int, queens: List[Int]): Boolean = {
    val row = queens.length
    val q =  (0 until queens.length) zip queens.reverse
  	q forall {
  		case (r,c) => col != c && math.abs(col -c) != row -r
  	}

  };System.out.println("""isSafe: (col: Int, queens: List[Int])Boolean""");$skip(14); val res$0 = 
  
nqueens(3);System.out.println("""res0: Set[List[Int]] = """ + $show(res$0))}
  	
}
