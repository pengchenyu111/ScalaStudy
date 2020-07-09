package com.pcy.chapter04.myfor

/**
 * @author pengchenyu
 * @date 2020/7/9 22:26
 */

object MultiFor {

  def main(args: Array[String]): Unit = {


    for (i <- 1 to 3; j <- 1 to 3) {
      println(" i =" + i + " j = " + j) //输出即句 9
    }

    //上面的写法，可以写成
    println("--------------------------")
    for (i <- 1 to 3) {
      for (j <- 1 to 3) {
        println(" i =" + i + " j = " + j) //输出即句 9
      }
    }

  }

}
