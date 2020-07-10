package com.pcy.chapter05.list

import scala.collection.mutable.ListBuffer

/**
 * @author pengchenyu
 * @date 2020/7/10 10:49
 *
 *       ListBuffer 是可变的 list 集合，可以添加，删除元素,ListBuffer 属于序列
 */

object ListBuffer01 {

  def main(args: Array[String]): Unit = {
    //创建 ListBuffer
    val lst0 = ListBuffer[Int](1, 2, 3)
    //如何访问
    println("lst0(2)=" + lst0(2)) // 输出 lst0(2)= 3
    for (item <- lst0) { // 遍历，是有序
      println("item=" + item)
    }

    //动态的增加元素，lst1 就会变化, 增加一个一个的元素
    val lst1 = new ListBuffer[Int] //空的 ListBuffer
    lst1 += 4 // lst1 (4)
    lst1.append(5) // list1(4,5) 可添加多个

    //
    lst0 ++= lst1 // lst0 (1, 2, 3,4,5)

    println("lst0=" + lst0)


    val lst2 = lst0 ++ lst1 // lst2(1, 2, 3,4,5,4,5)
    println("lst2=" + lst2)

    val lst3 = lst0 :+ 5 // lst0 不变 lst3(1, 2, 3,4,5,5)
    println("lst3=" + lst3)


    println("=====删除=======")
    println("lst1=" + lst1)
    lst1.remove(1) // 表示将下标为 1 的元素删除
    for (item <- lst1) {
      println("item=" + item) //4
    }
  }

}
