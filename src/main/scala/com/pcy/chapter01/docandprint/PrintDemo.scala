package com.pcy.chapter01.docandprint

/**
 * @author pengchenyu
 * @date 2020/7/8 1:09
 *
 *
 *       print的几种使用方式
 */

object PrintDemo {

  def main(args: Array[String]): Unit = {
    var str1: String = "hello"
    var str2: String = " world"
    println(str1 + str2)

    var name: String = "Tom"
    var age: Int = 10
    var sal: Float = 10.67f
    var height: Double = 180.15
    //格式化输出
    printf("名字是%s 年龄%d 薪水%.2f 升高%.3f", name, age, sal, height)

    //scala支持使用$输出内容
    println(s"\n个人信息如下：\n 名字$name 年龄$age 薪水$sal 身高$height")
    println(s"\n个人信息如下2：\n 名字$name 年龄${age + 10} 薪水$sal 身高$height")
  }
}
