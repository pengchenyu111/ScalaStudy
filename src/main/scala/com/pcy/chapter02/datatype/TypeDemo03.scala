package com.pcy.chapter02.datatype

/**
 * @author pengchenyu
 * @date 2020/7/8 12:00
 */

object TypeDemo03 {

  def main(args: Array[String]): Unit = {
    println("long 的最大值" + Long.MaxValue + "~" + Long.MinValue)

    var i = 10 //i Int
    var j = 10L //j Long
    var e = 9223372036854775807L //说 9223372036854775807 超过 int

    //2.2345678912f  , 2.2345678912
    var num1:Float = 2.2345678912f
    var num2:Double = 2.2345678912
    println("num1=" + num1 + "num2=" + num2)
  }
}
