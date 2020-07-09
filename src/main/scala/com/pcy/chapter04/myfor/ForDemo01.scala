package com.pcy.chapter04.myfor

/**
 * @author pengchenyu
 * @date 2020/7/8 12:45
 */

object ForDemo01 {
  def main(args: Array[String]): Unit = {
    //输出 10 句 "hello,尚硅谷!"
    val start = 1
    val end = 10
    //说明
    //1. start 从哪个数开始循环
    //2. to 是关键字
    //3. end 循环结束的值
    //4. start to end 表示前后闭合
    for (i <- start to end) {
      println("你好，尚硅谷" + i)
    }

    //说明 for 这种推导时，也可以直接对集合进行遍历
    var list = List("hello", 10, 30, "tom")
    for (item <- list) {
      println("item=" + item)
    }
  }
}
