object polynomials {
  class Poly(terms0: Map[Int, Double]) {
  	def this(bindings: (Int, Double)*) = this (bindings.toMap)
  	val terms = terms0 withDefaultValue 0.0
  	
  	def + (other: Poly) = new Poly(terms ++ (other.terms map adjust))
  	def adjust (term: (Int, Double)): (Int, Double) = {
  		val (exp, coeff) = term
  		exp -> (coeff + terms(exp))
  	}
  	
  	def ++ (other: Poly) = new Poly((other.terms foldLeft terms) (addTerm))
  	
  	def addTerm(terms: Map[Int, Double], term: (Int, Double)) = {
  		val (exp, coeff) = term
  		terms + (exp -> (terms(exp) + coeff))
  	}
  	
  	override def toString =
  	  (for ((exp, coeff) <- terms.toList.sorted.reverse) yield coeff + "x^" + exp) mkString " + "
  		
  }
  
  
  val p1 = new Poly(1 -> 2.0, 3 -> 4.0, 5 -> 6.2) //> p1  : polynomials.Poly = 6.2x^5 + 4.0x^3 + 2.0x^1
  val p2 = new Poly(1 -> 2.0, 5 -> 3.8)           //> p2  : polynomials.Poly = 3.8x^5 + 2.0x^1
  
  p1 + p2                                         //> res0: polynomials.Poly = 10.0x^5 + 4.0x^3 + 4.0x^1
  
  p1 ++ p2                                        //> res1: polynomials.Poly = 10.0x^5 + 4.0x^3 + 4.0x^1
}