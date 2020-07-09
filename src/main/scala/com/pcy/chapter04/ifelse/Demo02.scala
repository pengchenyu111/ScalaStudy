package com.pcy.chapter04.ifelse

import scala.io.StdIn

/**
 * @author pengchenyu
 * @date 2020/7/8 12:43
 *
 *       在 scala 中没有 switch,而是使用模式匹配来处理
 */

object Exercise05 {
  def main(args: Array[String]): Unit = {

    println("输入月份")
    val month = StdIn.readInt()
    println("输入年龄")
    val age = StdIn.readInt()

    val tikcet = 60
    if (month >= 4 && month <= 10) {
      if (age >= 18 && age <= 60) {
        println("你的票价是" + tikcet)
      } else if (age < 18) {
        println("你的票价是" + tikcet / 2)
      } else {
        println("你的票价是" + tikcet / 3)
      }
    } else {
      if (age >= 18 && age <= 60) {
        println("你的票价是" + 40)
      } else {
        println("你的票价是" + 20)
      }
    }
  }
}