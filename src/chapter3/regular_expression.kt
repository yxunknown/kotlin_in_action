package chapter3

import java.io.File

fun main(args: Array<String>) {
    val s = "12.234-8.112".split("\\.|-".toRegex())
    println(s)

    println("2321.2312-231#ADA~dsd.23".split(".", "-", "#", "~"))
    lsWithRE("/Users/chengpiao")
}

fun ls(currentPath: String) {
    val file = File(currentPath)
    if (file.isDirectory) {
        val files = file.listFiles()
        for ((index, f) in files.withIndex()) {
            val path = f.path
            val size = f.length() / 1024
            if (f.isFile) {
                val name = path.substringBeforeLast(".").substringAfterLast("/")
                val ext = path.substringAfterLast(".")
                val dir = path.substringBeforeLast("/")
                println("#$index dir: $dir name: $name ext: $ext size: $size KB")
            } else {
                println("#$index dir: $path size: $size KB")
            }
        }
    } else {
        val path = file.path
        val name = path.substringBeforeLast(".")
        val ext = path.substringAfterLast(".")
        val dir = path.substringBeforeLast("/")
        println("# dir: $dir name: $name ext: $ext size: ${file.length() / 1024} KB")
    }
}

fun lsWithRE(path: String) {
    val file = File(path)
    if (file.isDirectory) {
        val regex = """(.+)/(.+)\.(.+)""".toRegex()
        val files = file.listFiles()
        for (f in files) {
            val p = f.path
            val matchResult = regex.matchEntire(p)
            if (null != matchResult) {
                val (dir, name, ext) = matchResult.destructured
                println("$dir $name $ext")
            }
        }
    }
}