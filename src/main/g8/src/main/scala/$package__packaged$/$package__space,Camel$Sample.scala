package $package$

import org.apache.spark.sql.SparkSession

object $package;format="space,Camel"$Sample:

  @main def run =
    val appName: String = "$package$"
    val spark = SparkSession.builder
      .appName(appName)
      .master(sys.env.getOrElse("SPARK_MASTER_URL", "local[*]"))
      .getOrCreate() // 1
    import spark.implicits._ // 2

    val df = appName.split('.').toList.toDF // 3
    df.show() // 4

    spark.stop
