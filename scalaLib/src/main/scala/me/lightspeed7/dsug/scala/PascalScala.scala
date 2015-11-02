package me.lightspeed7.dsug.scala

trait PascalScala {

  def recursive(row: Int): Seq[Long] = {
    row match {
      case n: Int if n <= 0 => Seq()
      case 1                => Seq(1L)
      case n: Int => {
        val oreo = Seq(1L)
        val filling = ((recursive(n - 1) zip recursive(n - 1).tail) map { case (a, b) => a + b })
        oreo ++ filling ++ oreo
      }
    }
  }

  // 
  // Pretty print 
  // /////////////////////////
  def maxLength(line: Seq[Long]): Int = line.foldLeft(0)((max, cur) => Math.max(max, max.toString.size))

  def span(entry: String, size: Int): String = {
    val left = (size - entry.size) / 2
    val right = size - left - entry.size
    
    "".padTo(left, ' ') + entry + "".padTo(right, ' ')
  }

  def prettyPrint(tree: Seq[Seq[Long]]) = {
    val maxNumLength = tree.foldLeft(0) { (max, cur) => Math.max(max, maxLength(cur)) }
    val maxLineLength = tree.foldLeft(0) { (max, line) => Math.max(max, line.size) }
    val totalLineLength = maxLineLength * (maxNumLength + 2)

    tree.map { line =>
      val formattedLines = line.map { n => span(n.toString, maxNumLength) }
      span(formattedLines.mkString(" "), totalLineLength)
    }

  }

}

