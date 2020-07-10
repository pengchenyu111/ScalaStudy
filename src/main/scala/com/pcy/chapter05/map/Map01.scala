package com.pcy.chapter05.map

import scala.collection.mutable

/**
 * @author pengchenyu
 * @date 2020/7/10 11:31
 */

object Map01 {

  def main(args: Array[String]): Unit = {


    //方式 1-构造不可变映射
    //1.默认 Map 是 immutable.Map
    //2.key-value 类型支持 Any
    //3.在 Map 的底层，每对 key-value 是 Tuple2
    val map1 = Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
    println(map1)

    //方式 2-构造可变映射
    //1.从输出的结果看到，可变的 map 输出顺序和声明顺序不一致
    val map2 = mutable.Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
    println(map2)

    //方式 3-创建空的映射
    val map3 = new scala.collection.mutable.HashMap[String, Int]
    println(map3)

    //方式 4-对偶元组
    val map4 = mutable.Map(("Alice", 10), ("Bob", 20), ("Kotlin", "北京"))
    println("map4=" + map4)


    println("-------------------- map 取值 -------------------")
    //方式 1-使用 map(key)
    println(map4("Alice")) // 10
    //抛出异常（java.util.NoSuchElementException: key not found:）
    //println(map4("Alice~"))

    //方式 2-使用 contains 方法检查是否存在 key
    if (map4.contains("Alice")) {
      println("key 存在，值=" + map4("Alice"))
    } else {
      println("key 不存在:)")
    }

    //方式 3 方式 3-使用 map.get(key).get 取值
    //1. 如果 key 存在 map.get(key) 就会返回 Some(值)  ,然后 Some(值).get 就可以取出
    //2. 如果 key 不存在 map.get(key) 就会返回 None
    println(map4.get("Alice").get)
    //println(map4.get("Alice~").get)  // 抛出异常

    //方式 4-使用 map4.getOrElse()取值
    println(map4.getOrElse("Alice~~~", "默认的值 鱼 <・)))><< "))


    println("-------------------- map 更新 -------------------")

    //修改
    //1) map 是可变的，才能修改，否则报错
    //2) 如果 key 存在：则修改对应的值,key 不存在,等价于添加一个 key-val
    val map5 = mutable.Map(("A", 1), ("B", "北京"), ("C", 3))
    map5("A") = 20 //修改为20
    println("map5=" + map5)

    //增加
    map4 += ("D" -> 4)
    map4.addOne(("E" -> 5))
    map4 += ("F" -> 6, "G" -> 7)
    println(map4)

    // 删除
    //1) "A","B" 就是要删除的 key, 可以写多个.
    //2) 如果 key 存在，就删除，如果 key 不存在，也不会报错.
    map5 -= ("A", "B", "AAA")
    println("map5=" + map5)


    println("-------------------- map 遍历 -------------------")
    val map6 = mutable.Map(("A", 1), ("B", "北京"), ("C", 3))
    println("----(k, v) <- map6--------")
    for ((k, v) <- map6) println(k + " is mapped to " + v)

    println("----k <- map6.keys--------")
    for (k <- map6.keys) println(k)
    println("----v <- map6.values--------")
    for (v <- map6.values) println(v)

    //这样取出方式 v 类型是 Tuple2
    println("----v <- map6--------")
    for (v <- map6) println(v + " key=" + v._1 + " val=" + v._2) //v 是 Tuple?

  }

}
