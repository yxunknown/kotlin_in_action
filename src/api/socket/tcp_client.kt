package api.socket

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter
import java.net.Socket

fun main(args: Array<String>) {
    try {
        val client = Socket("47.106.251.234", 6050)
        val out = PrintWriter(client.getOutputStream(), true)
        val ins = BufferedReader(InputStreamReader(client.getInputStream()))
        out.write("测试和服务器的通信")
    } catch (e: Exception) {
        e.printStackTrace()
    }
}