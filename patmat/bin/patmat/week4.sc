package patmat

object week4 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val list = Huffman.times(List('a', 'b', 'e', 'c', 'e', 'd', 'a'))
                                                  //> list  : List[(Char, Int)] = List((a,2), (b,1), (e,2), (c,1), (d,1))
  Huffman.makeOrderedLeafList(list)               //> res0: List[patmat.Huffman.Leaf] = List(Leaf(b,1), Leaf(c,1), Leaf(d,1), Leaf
                                                  //| (a,2), Leaf(e,2))
  Huffman.createCodeTree(List('a', 'b', 'e', 'c', 'e', 'd', 'a'))
                                                  //> res1: patmat.Huffman.CodeTree = Fork(Fork(Leaf(d,1),Leaf(a,2),List(d, a),3),
                                                  //| Fork(Leaf(e,2),Fork(Leaf(b,1),Leaf(c,1),List(b, c),2),List(e, b, c),4),List(
                                                  //| d, a, e, b, c),7)
  Huffman.decode(Huffman.frenchCode, Huffman.secret)
                                                  //> res2: List[Char] = List(h)
}