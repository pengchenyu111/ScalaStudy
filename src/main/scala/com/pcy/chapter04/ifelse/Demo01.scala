package com.pcy.chapter04.ifelse

/**
 * @author pengchenyu
 * @date 2020/7/8 12:41
 *
 *
 */

object Demo01 {

  def main(args: Array[String]): Unit = {

    var sumVal = 9
    val result =
      if (sumVal > 20) {
        "结果大于 20"
      }
    println("res=" + result) //返回的是() 即 Unit
  }

}
