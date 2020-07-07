package com.pcy.chapter01.docandprint

/**
 * @author pengchenyu
 * @date 2020/7/8 1:28
 *
 *      生成文档
 *      进到当前文件目录执行命令：
 *      scaladoc -d d:/mydoc GenerateDoc.scala
 *
 */

object GenerateDoc {

  /**
   * @deprecated 过期了
   * @example 10 + 20 return 30
   * @param n1
   * @param n2
   * @return
   */
  def count(n1: Int, n2: Int): Int = {
    return n1 + n2
  }

}
