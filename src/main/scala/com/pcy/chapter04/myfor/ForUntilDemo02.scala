package com.pcy.chapter04.myfor

/**
 * @author pengchenyu
 * @date 2020/7/8 12:47
 *
 *       说明:
 *       1) 这种方式和前面的区别在于 i 是从 1 到 3-1
 *       2) 前闭合后开的范围,和 java 的 arr.length() 类似
 *       for (int i = 0; i < arr.lenght; i++){}
 */

object ForUntilDemo02 {
  def main(args: Array[String]): Unit = {
    //输出 10 句 "hello,尚硅谷!"
    val start = 1
    val end = 11
    //循环的范围是  start --- (end-1)
    for (i <- start until end) {
      println("hello, 尚硅谷" + i)
    }
  }
}