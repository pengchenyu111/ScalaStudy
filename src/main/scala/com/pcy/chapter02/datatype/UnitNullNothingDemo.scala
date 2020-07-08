package com.pcy.chapter02.datatype

/**
 * @author pengchenyu
 * @date 2020/7/8 12:11
 *
 *       1) Null 类只有一个实例对象，null，类似于 Java 中的 null 引用。null 可以赋值给任意引用类型
 *       (AnyRef)，但是不能赋值给值类型(AnyVal: 比如 Int, Float, Char, Boolean, Long, Double, Byte, Short)
 *
 *       2) Unit 类型用来标识过程，也就是没有明确返回值的函数。由此可见，Unit 类似于 Java 里的 void。
 *       Unit 只有一个实例，()，这个实例也没有实质的意义
 *
 *       3) Nothing，可以作为没有正常返回值的方法的返回类型，非常直观的告诉你这个方法不会正常返
 *       回，而且由于 Nothing 是其他任意类型的子类，他还能跟要求返回值的方法兼容。
 */

object UnitNullNothingDemo {


  def main(args: Array[String]): Unit = {

    val res = sayHello()
    println("res=" + res)

    //Null类只有一个实例对象，null，类似于Java中的null引用。null可以赋值给任意引用类型(AnyRef)，
    //但是不能赋值给值类型(AnyVal: 比如 Int, Float, Char, Boolean, Long, Double, Byte, Short)
    val dog: Dog = null
    //错误
    //val char1: Char = null

  }

  //Unit 等价于 java 的 void,只有一个实例值()
  def sayHello(): Unit = {

  }

}

class Dog {
}
