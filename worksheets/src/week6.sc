object week6 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val n = 7                                       //> n  : Int = 7
  val lst = 1 until n                             //> lst  : scala.collection.immutable.Range = Range 1 until 7
  val lst2 = lst flatMap (i => (1 until i) map (j => (j,i)))
                                                  //> lst2  : scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1,2), (1
                                                  //| ,3), (2,3), (1,4), (2,4), (3,4), (1,5), (2,5), (3,5), (4,5), (1,6), (2,6), (
                                                  //| 3,6), (4,6), (5,6))
  def isPrime(in: Int): Boolean = (2 until in) forall (in % _ != 0)
                                                  //> isPrime: (in: Int)Boolean
  
  lst2 filter (pair => isPrime(pair._1 + pair._2))//> res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1,2), (2,3
                                                  //| ), (1,4), (3,4), (2,5), (1,6), (5,6))
                                                  
  def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double = (xs zip ys).map(xy => xy._1 * xy._2).sum
                                                  //> scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double
  
  scalarProduct(Vector(1,2,3),Vector(4,5,6))      //> res1: Double = 32.0
  
  def scalarProduct2(xs: Vector[Double], ys: Vector[Double]): Double = {
  	(for ((x, y) <- xs zip ys) yield (x * y)).sum
  }                                               //> scalarProduct2: (xs: Vector[Double], ys: Vector[Double])Double
  
  scalarProduct2(Vector(1,2,3),Vector(4,5,6))     //> res2: Double = 32.0
}