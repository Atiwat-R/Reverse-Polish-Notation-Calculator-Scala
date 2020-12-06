
package RPN

object RPNCalculator extends App {

  def RPN(x: String): Double = {
    def engine(xs: List[Double], x: String): List[Double] = {
      xs match {
        case Nil => x.toDouble :: xs
        case List(_) => x.toDouble :: xs
        case head1::head2::tail => {
          x match {
            case "*" => head1 * head2 :: tail
            case "+" => head1 + head2 :: tail
            case "-" => head2 - head1 :: tail
            case "/" => head2 / head1 :: tail
            case "^" => math.pow(head2, head1) :: tail
            case "//" => (head2 / head1).toInt :: tail
            case "%" => head2 % head1 :: tail
            case _ => x.toDouble :: xs
          }
        }
      }
    }
    val xs: List[String] = x.split(" ").toList
    val acc: List[Double] = List()
    xs.foldLeft(acc)(engine).head
  }

//    val x: String = "10 2 ^"
//    val xrpn = RPN(x)
//    println(xrpn)

  /**
   * Reverse Polish Notation Calculator. A very basic version.
   * Accepts a String of RPN expression, usable for both integers and doubles.
   * Supports addition, subtraction, multiplication, division,
   * exponent, floor division, and modulo.
   */

}

