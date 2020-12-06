
package RPN

object Tester extends App {

  val test1: String = "1 2 +"
  assert(RPNCalculator.RPN(test1) == 3.0)

  val test2: String = "5 7 8 9 + - /"
  assert(RPNCalculator.RPN(test2) == -0.5)

  val test3: String = "11.2 9.6 + 4.56 *"
  assert(RPNCalculator.RPN(test3) == 94.84799999999998)

  val test4: String = "7 6.7 289.7 9 / %"
  assert(RPNCalculator.RPN(test4) == 6.7)

  val test5: String = "9 1 * 300 6 / +"
  assert(RPNCalculator.RPN(test5) == 59.0)

  val test6: String = "10 2 8 * + 3 -"
  assert(RPNCalculator.RPN(test6) == 23.0)

  val test7: String = "77.43 2 + 54 + 31 - 2 22.6 424 8 / + - 54.0009 566 * + 31.5 23 889 90 1000 21 246 4 % - + - - + +"
  assert(RPNCalculator.RPN(test7) == 1872.5)


//  println(RPNCalculator.RPN(test7))

}
