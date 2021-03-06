object week5 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val nums = List(1, 2, 3, 4, 5, 6, 7)            //> nums  : List[Int] = List(1, 2, 3, 4, 5, 6, 7)
  
  def removeAt(n: Int, xs: List[Int]): List[Int] = xs match {
  	case Nil => Nil
  	case x :: xs => if(n==0) xs else x :: removeAt(n-1, xs)
  }                                               //> removeAt: (n: Int, xs: List[Int])List[Int]
  
  removeAt(2, nums)                               //> res0: List[Int] = List(1, 2, 4, 5, 6, 7)
  
  def flatten(xs: List[Any]): List[Any] = xs match {
  	case Nil => Nil
  	case (y :: ys) :: zs => flatten(y :: ys) ++ flatten(zs)
  	case y :: ys => y :: flatten(ys)
  	
  }                                               //> flatten: (xs: List[Any])List[Any]
  

	flatten(List(List(1, 2), 3, List(4, List(5, 6))))
                                                  //> res1: List[Any] = List(1, 2, 3, 4, 5, 6)
	flatten(List(4, List(5, 6)))              //> res2: List[Any] = List(4, 5, 6)
  def merge(xs: List[Int], ys: List[Int]): List[Int] =
  (xs, ys) match {
    case (x :: xs, y::ys) => if(x<y) xs ++ ys else merge(y :: xs, x:: ys)
  }                                               //> merge: (xs: List[Int], ys: List[Int])List[Int]
  
  def squareList(xs: List[Int]): List[Int] = xs match {
  	case Nil => xs
  	case y :: ys => y*y :: squareList(ys)
  }                                               //> squareList: (xs: List[Int])List[Int]
  
  squareList(List(1,2,3,4,5,6))                   //> res3: List[Int] = List(1, 4, 9, 16, 25, 36)
  
  def squareList2(xs: List[Int]): List[Int] =
  	xs map(x => x*x)                          //> squareList2: (xs: List[Int])List[Int]
  	
  squareList2(List(1,2,3,4,5,6))                  //> res4: List[Int] = List(1, 4, 9, 16, 25, 36)
  
  def pack[T](xs: List[T]): List[List[T]] = xs match {
  case Nil => Nil
  case x :: xs1 =>
  	val (first, rest) = xs span (z => z == x)
  	first :: pack(rest)
	}                                         //> pack: [T](xs: List[T])List[List[T]]
	

  
  pack(List("a", "a", "a", "b", "c", "c", "a"))   //> res5: List[List[String]] = List(List(a, a, a), List(b), List(c, c), List(a)
                                                  //| )
  
  def encode[T](xs: List[T]): List[(T, Int)] =
  pack(xs) map (ys => (ys.head, ys.length))       //> encode: [T](xs: List[T])List[(T, Int)]
	
	encode(List("a", "a", "a", "b", "c", "c", "a"))
                                                  //> res6: List[(String, Int)] = List((a,3), (b,1), (c,2), (a,1))
                                                  
  def mapFun[T, U](xs: List[T], f: T => U): List[U] =
  	(xs foldRight List[U]())( f(_) :: _)      //> mapFun: [T, U](xs: List[T], f: T => U)List[U]
  	
  mapFun(List(1,2,3,4,5,6), (x:Int) => x * x)     //> res7: List[Int] = List(1, 4, 9, 16, 25, 36)

	def lengthFun[T](xs: List[T]): Int =
  	(xs foldRight 0)( (x: T, y: Int) => y + 1)//> lengthFun: [T](xs: List[T])Int
  
  lengthFun(List(1,2,3,4,5,6))                    //> res8: Int = 6
}