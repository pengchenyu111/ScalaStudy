package com.pcy.chapter05.array

import scala.collection.mutable.ArrayBuffer

/**
 * @author pengchenyu
 * @date 2020/7/9 23:39
 *
 *      Scala 集合和 Java 集合互相转换
 */

object ArrayBuffer2JavaList {

  def main(args: Array[String]): Unit = {

    //要转换默认其中是字符串
    val arr = ArrayBuffer("1", "2", "3")

    import scala.jdk.CollectionConverters._
    val a2 = arr.asJava
    println(a2)


    val a3 = a2.asScala
    println(a3)
  }

}
