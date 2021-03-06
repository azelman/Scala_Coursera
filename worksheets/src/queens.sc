object queens {
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
  }                                               //> nqueens: (n: Int)Set[List[Int]]
  
  def isSafe(col: Int, queens: List[Int]): Boolean = {
    val row = queens.length
    val q =  (0 until queens.length) zip queens.reverse
  	q forall {
  		case (r,c) => col != c && math.abs(col -c) != row -r
  	}

  }                                               //> isSafe: (col: Int, queens: List[Int])Boolean
  
nqueens(3)                                        //> res0: Set[List[Int]] = Set()
  	
}