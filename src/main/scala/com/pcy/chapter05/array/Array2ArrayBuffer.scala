package com.pcy.chapter05.array

import scala.collection.mutable.ArrayBuffer


/**
 * @author pengchenyu
 * @date 2020/7/9 23:17
 *
 *       arr1.toBuffer  //定长数组转可变数组
 *       arr2.toArray  //可变数组转定长数组
 *
 *       注意事项：
 *       arr2.toArray 返回结果才是一个定长数组， arr2 本身没有变化
 *       arr1.toBuffer 返回结果才是一个可变数组， arr1 本身没有变化
 *
 */

object Array2ArrayBuffer {

  def main(args: Array[String]): Unit = {

    val arr2 = ArrayBuffer[Int]()
    // 追加值
    arr2.append(1, 2, 3)
    println(arr2)

    //说明
    //1. arr2.toArray 调用 arr2 的方法 toArray
    //2. 将 ArrayBuffer ---> Array
    //3. arr2 本身没有任何变化
    val newArr = arr2.toArray
    println(newArr)

    //说明
    //1. newArr.toBuffer 是把 Array->ArrayBuffer
    //2. 底层的实现
    /*
     override def toBuffer[A1 >: A]: mutable.Buffer[A1] = {
    val result = new mutable.ArrayBuffer[A1](size)
    copyToBuffer(result)
    result
  }
     */

    //3. newArr 本身没变化
    val newArr2 = newArr.toBuffer
    newArr2.append(123)
    println(newArr2)
  }

}
