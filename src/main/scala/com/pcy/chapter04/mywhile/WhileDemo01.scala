package com.pcy.chapter04.mywhile

/**
 * @author pengchenyu
 * @date 2020/7/9 22:32
 */

object WhileDemo01 {

  def main(args: Array[String]): Unit = {

    //输出 10 句 hello,尚硅谷
    //1. 定义循环变量
    var i = 0
    //2. i < 10 条件
    while (i < 10) {
      println("hello,尚硅谷" + i) //循环体
      //循环变量迭代
      i += 1
    }
  }

}
