package example

object PhpLike {
  implicit def booleanToInt(b: Boolean): Int = if(b) 1 else 0
  implicit def stringToInt(s: String): Int = {
    val tmp: String = "[0-9]*".r.findFirstMatchIn(s)
      .map(_.toString)
      .getOrElse("0")
    Integer.parseInt(tmp)
  }
}

