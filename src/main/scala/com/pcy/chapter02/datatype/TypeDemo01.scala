package com.pcy.chapter02.datatype

/**
 * @author pengchenyu
 * @date 2020/7/8 11:42
 */

object TypeDemo01 {
  def main(args: Array[String]): Unit = {

    var num1: Int = 10
    //因为 Int 是一个类，因此他的一个实例，就是可以使用很多方法
    //在 scala 中，如果一个方法，没有形参，则可以省略()
    println(num1.toDouble + "\t" + num1.toString + 100.toDouble)


    var isPass = true //
    println(isPass.toString)


    sayHi()

  }

  def sayHi(): Unit = {
    println("say hi")
  }
}