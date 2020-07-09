package com.pcy.chapter04.myfor

/**
 * @author pengchenyu
 * @date 2020/7/9 22:25
 */

object ForVar {

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3; j = 4 - i) {
      print(j + " ") // 3,2,1
    }

  }

}
