package me.lightspeed7.dsug.scala.build

object Pascal {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(97); 
  println("Pascal's Triangle Worksheet");$skip(22); 

  val row1 = Seq(1L);System.out.println("""row1  : Seq[Long] = """ + $show(row1 ));$skip(24); 
  val row2 = Seq(1L, 1);System.out.println("""row2  : Seq[Long] = """ + $show(row2 ));$skip(27); 
  val row3 = Seq(1L, 2, 1);System.out.println("""row3  : Seq[Long] = """ + $show(row3 ));$skip(30); 
  val row4 = Seq(1L, 3, 3, 1);System.out.println("""row4  : Seq[Long] = """ + $show(row4 ));$skip(33); 
  val row5 = Seq(1L, 4, 6, 4, 1);System.out.println("""row5  : Seq[Long] = """ + $show(row5 ));$skip(38); 
  val row6 = Seq(1L, 5, 10, 10, 5, 1);System.out.println("""row6  : Seq[Long] = """ + $show(row6 ))}

  // How to go from row3 to row4

  // structure - need to generate the next value on the fly

  //
}
