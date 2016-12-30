package extra

class ClosingOpeningParentheses {


  def check(str: String): Boolean = {
    var i = 0

    for (s <- str) {
      if (s == '(') i += 1
      else if (s == ')') i -= 1

      if (i < 0) {
        return false
      }
    }

    if (i == 0) true else false
  }
}
