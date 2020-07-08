package com.pcy.chapter02.datatype

/**
 * @author pengchenyu
 * @date 2020/7/8 12:16
 */

object StringDemo {

  def main(args: Array[String]): Unit = {
    //在将 String 类型转成 基本数据类型时，要确保 String 类型能够转成有效的数据，比如 我们可以把 "123" , 转成一个整数，但是不能把 "hello" 转成一个整数
    //    val s3 = "hello"
    //    println(s3.toInt)

    //思考就是要把 "12.5" 转成 Int
    //在 scala 中，不是将小数点后的数据进行截取，而是会抛出异常
    val s4 = "12.5"
    //println(s4.toInt) // error
    //println(s4.toDouble) //  error
  }

}
