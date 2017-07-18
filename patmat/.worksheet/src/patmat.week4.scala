package patmat

object week4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(68); 
  val list = Huffman.times(List('a', 'b', 'e', 'c', 'e', 'd', 'a'));System.out.println("""list  : List[(Char, Int)] = """ + $show(list ));$skip(36); val res$0 = 
  Huffman.makeOrderedLeafList(list);System.out.println("""res0: List[patmat.Huffman.Leaf] = """ + $show(res$0));$skip(66); val res$1 = 
  Huffman.createCodeTree(List('a', 'b', 'e', 'c', 'e', 'd', 'a'));System.out.println("""res1: patmat.Huffman.CodeTree = """ + $show(res$1));$skip(53); val res$2 = 
  Huffman.decode(Huffman.frenchCode, Huffman.secret);System.out.println("""res2: List[Char] = """ + $show(res$2))}
}
