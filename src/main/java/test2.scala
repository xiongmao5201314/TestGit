import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object test2 {
  def main(args: Array[String]): Unit = {
    // 1. 创建
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("Hello")
    val sc: SparkContext = new SparkContext(conf)
    val rdd1 = sc.parallelize(Array("hello", "hello", "world", "hello", "atguigu", "hello", "atguigu", "atguigu"))
    val wordOne= rdd1.map((_, 1))
    val wordOneGrouped = wordOne.groupByKey()
    wordOneGrouped.collect.foreach(println)
    sc.stop()
   
    }
//    rdd2.collect.foreach(println)


}
