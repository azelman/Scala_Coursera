object week5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); 
  println("Welcome to the Scala worksheet");$skip(42); 
  
  val nums = List(1, 2, 3, 4, 5, 6, 7);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(147); 
  
  def removeAt(n: Int, xs: List[Int]): List[Int] = xs match {
  	case Nil => Nil
  	case x :: xs => if(n==0) xs else x :: removeAt(n-1, xs)
  };System.out.println("""removeAt: (n: Int, xs: List[Int])List[Int]""");$skip(23); val res$0 = 
  
  removeAt(2, nums);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(178); 
  
  def flatten(xs: List[Any]): List[Any] = xs match {
  	case Nil => Nil
  	case (y :: ys) :: zs => flatten(y :: ys) ++ flatten(zs)
  	case y :: ys => y :: flatten(ys)
  	
  };System.out.println("""flatten: (xs: List[Any])List[Any]""");$skip(56); val res$1 = 
  

	flatten(List(List(1, 2), 3, List(4, List(5, 6))));System.out.println("""res1: List[Any] = """ + $show(res$1));$skip(30); val res$2 = 
	flatten(List(4, List(5, 6)));System.out.println("""res2: List[Any] = """ + $show(res$2));$skip(152); 
  def merge(xs: List[Int], ys: List[Int]): List[Int] =
  (xs, ys) match {
    case (x :: xs, y::ys) => if(x<y) xs ++ ys else merge(y :: xs, x:: ys)
  };System.out.println("""merge: (xs: List[Int], ys: List[Int])List[Int]""");$skip(122); 
  
  def squareList(xs: List[Int]): List[Int] = xs match {
  	case Nil => xs
  	case y :: ys => y*y :: squareList(ys)
  };System.out.println("""squareList: (xs: List[Int])List[Int]""");$skip(35); val res$3 = 
  
  squareList(List(1,2,3,4,5,6));System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(69); 
  
  def squareList2(xs: List[Int]): List[Int] =
  	xs map(x => x*x);System.out.println("""squareList2: (xs: List[Int])List[Int]""");$skip(37); val res$4 = 
  	
  squareList2(List(1,2,3,4,5,6));System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(166); 
  
  def pack[T](xs: List[T]): List[List[T]] = xs match {
  case Nil => Nil
  case x :: xs1 =>
  	val (first, rest) = xs span (z => z == x)
  	first :: pack(rest)
	};System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(54); val res$5 = 
	

  
  pack(List("a", "a", "a", "b", "c", "c", "a"));System.out.println("""res5: List[List[String]] = """ + $show(res$5));$skip(94); 
  
  def encode[T](xs: List[T]): List[(T, Int)] =
  pack(xs) map (ys => (ys.head, ys.length));System.out.println("""encode: [T](xs: List[T])List[(T, Int)]""");$skip(51); val res$6 = 
	
	encode(List("a", "a", "a", "b", "c", "c", "a"));System.out.println("""res6: List[(String, Int)] = """ + $show(res$6));$skip(145); 
                                                  
  def mapFun[T, U](xs: List[T], f: T => U): List[U] =
  	(xs foldRight List[U]())( f(_) :: _);System.out.println("""mapFun: [T, U](xs: List[T], f: T => U)List[U]""");$skip(50); val res$7 = 
  	
  mapFun(List(1,2,3,4,5,6), (x:Int) => x * x);System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(85); 

	def lengthFun[T](xs: List[T]): Int =
  	(xs foldRight 0)( (x: T, y: Int) => y + 1);System.out.println("""lengthFun: [T](xs: List[T])Int""");$skip(34); val res$8 = 
  
  lengthFun(List(1,2,3,4,5,6));System.out.println("""res8: Int = """ + $show(res$8))}
}
