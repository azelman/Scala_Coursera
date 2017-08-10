object week6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); 
  println("Welcome to the Scala worksheet");$skip(12); 
  val n = 7;System.out.println("""n  : Int = """ + $show(n ));$skip(22); 
  val lst = 1 until n;System.out.println("""lst  : scala.collection.immutable.Range = """ + $show(lst ));$skip(61); 
  val lst2 = lst flatMap (i => (1 until i) map (j => (j,i)));System.out.println("""lst2  : scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(lst2 ));$skip(68); 
  def isPrime(in: Int): Boolean = (2 until in) forall (in % _ != 0);System.out.println("""isPrime: (in: Int)Boolean""");$skip(54); val res$0 = 
  
  lst2 filter (pair => isPrime(pair._1 + pair._2));System.out.println("""res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$0));$skip(162); 
                                                  
  def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double = (xs zip ys).map(xy => xy._1 * xy._2).sum;System.out.println("""scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double""");$skip(48); val res$1 = 
  
  scalarProduct(Vector(1,2,3),Vector(4,5,6));System.out.println("""res1: Double = """ + $show(res$1));$skip(129); 
  
  def scalarProduct2(xs: Vector[Double], ys: Vector[Double]): Double = {
  	(for ((x, y) <- xs zip ys) yield (x * y)).sum
  };System.out.println("""scalarProduct2: (xs: Vector[Double], ys: Vector[Double])Double""");$skip(49); val res$2 = 
  
  scalarProduct2(Vector(1,2,3),Vector(4,5,6));System.out.println("""res2: Double = """ + $show(res$2))}
}
