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
  		
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(775); 
  
  
  val p1 = new Poly(1 -> 2.0, 3 -> 4.0, 5 -> 6.2);System.out.println("""p1  : polynomials.Poly = """ + $show(p1 ));$skip(40); 
  val p2 = new Poly(1 -> 2.0, 5 -> 3.8);System.out.println("""p2  : polynomials.Poly = """ + $show(p2 ));$skip(13); val res$0 = 
  
  p1 + p2;System.out.println("""res0: polynomials.Poly = """ + $show(res$0));$skip(14); val res$1 = 
  
  p1 ++ p2;System.out.println("""res1: polynomials.Poly = """ + $show(res$1))}
}
