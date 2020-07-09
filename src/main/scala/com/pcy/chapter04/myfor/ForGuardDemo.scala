package com.pcy.chapter04.myfor

/**
 * @author pengchenyu
 * @date 2020/7/8 12:50
 */

object ForGuardDemo {


  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3 if i != 2) {
      print(i + " ") //1 3
    }
  }
}
