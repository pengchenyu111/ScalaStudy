package com.pcy.chapter05.tuple

/**
 * @author pengchenyu
 * @date 2020/7/10 10:15
 *
 *       元组也是可以理解为一个容器，可以存放各种相同或不同类型的数据
 *       注意：元组中最大只能有 22 个元素
 */

object Tuple01 {

  def main(args: Array[String]): Unit = {


    // 访问元组中的数据,可以采用顺序号（_顺序号），也可以通过索引（productElement）访问。
    val t1 = (1, "a", "b", true, 2)
    println(t1._1)

    println(t1.productElement(0))

    //遍历元组, 元组的遍历需要使用到迭代器
    for (item <- t1.productIterator) {
      println("item=" + item)
    }


  }
}
