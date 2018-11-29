package api.security

import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.Socket
import java.nio.channels.SocketChannel

fun main(args: Array<String>) {
    val ds = DatagramSocket(3000)
    val buf = byteArrayOf()
    val dp = DatagramPacket(buf, 1024)
    while (true) {
        ds.receive(dp)
        
    }
}