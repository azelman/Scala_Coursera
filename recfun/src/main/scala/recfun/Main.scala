package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {

    if (c == 0 || r == c) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)

  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def loop(n: Int, chars: List[Char]): Boolean = {
      if (chars.isEmpty)
        n == 0
      else if (chars.head != '(' && chars.head != ')')
        loop(n, chars.tail)
      else if (chars.head == '(')
        loop(n + 1, chars.tail)
      else if (chars.head == ')' && n > 0)
        loop(n - 1, chars.tail)
      else false
    }
    loop(0, chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def loop(money: Int, coins: List[Int]): Int = {
      if (money < 0 || coins.isEmpty) return 0
      if (money == 0) return 1
      loop(money, coins.tail) + loop(money - coins.head, coins)
    }
    loop(money, coins)

  }
}
