package com.pcy.chapter01.vars

/**
 * @author pengchenyu
 * @date 2020/7/8 1:41
 *
 *      变量声明方法：
 *      var | val 变量名 [: 变量类型] = 变量值
 */

object VarDemo01 {
  def main(args: Array[String]): Unit = {
    //编译器，动态的 (逃逸分析)
    var age: Int = 10
    var sal: Double = 10.9
    var name: String = "tom"
    var isPass: Boolean = true
    //在 scala 中，小数默认为 Double ,整数默认为 Int
    var score: Float = 70.9f
    println(s"${age} ${isPass}")
  }
}
