package com.pcy.chapter05.set

import scala.collection.mutable

/**
 * @author pengchenyu
 * @date  2020/7/10 12:02
 *
 *        默认情况下，Scala 使 用 的 是 不 可 变 集 合 ， 如 果 你 想 使 用 可 变 集 合 ， 需 要 引 用
 *        scala.collection.mutable.Set 包
 */

object Set01 {

  def main(args: Array[String]): Unit = {

    println("------------ set创建------------")
    //创建
    val set = Set(1, 2, 3) //不可变
    println(set)
    val set2 = mutable.Set(1, 2, "hello") //可以变
    println("set2" + set2)

    println("------------ set添加------------")
    //如果添加的对象已经存在，则不会重复添加，也不会报错
    set2.add(4)
    set2 += 6
    set2.+=(5)
    println(set2)

    println("------------ set删除------------")
    //如果删除的对象不存在，则不生效，也不会报错
    set2 -= 2 // 操作符形式
    set2.remove("hello") // 方法的形式，scala 的 Set 可以直接删除值
    println(set2)



  }

}
