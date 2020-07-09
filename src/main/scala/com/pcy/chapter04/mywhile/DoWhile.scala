package com.pcy.chapter04.mywhile

/**
 * @author pengchenyu
 * @date 2020/7/9 22:36
 */

class DoWhile {

  def main(args: Array[String]): Unit = {
    var i = 0 // for
    do {
      printf(i + "hello,尚硅谷\n")
      i += 1
    } while (i < 10)
  }

}
