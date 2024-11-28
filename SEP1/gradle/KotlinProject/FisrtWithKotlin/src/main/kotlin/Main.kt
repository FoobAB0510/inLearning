package com.kotlinab

import java.sql.ResultSet
import java.util.ArrayList
import kotlin.system.exitProcess
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import kotlinx.coroutines.*


val list = ArrayList<ThanhVien>();
val dbnow = Connector().db();

fun themThanhVien() {
    print("ID: ")
    val id = readln()
    print("Name: ")
    val name = readln()
    print("Tuoi: ")
    val tuoi = readln().toInt()
    print("Chieu cao: ")
    val hi = readln().toFloat()

    list.add(ThanhVien(id, name, tuoi, hi))
    println("Thêm thành công")
}

fun timThanhVien() {
    print("Enter ID: ")
    val id = readln()
    for (data in list) {
        if (data.getId() == id) {
            print("Ten: ${data.getName()}\nTuoi: ${data.getTuoi()}\nChieu cao: ${data.getH()}\n")
            break
        }
    }
}

fun xoaThanhVien() {
    print("Enter ID: ")
    val id = readln()
    var found = false
    for (data in list) {
        if (data.getId() == id) {
            list.remove(data)
            println("Xóa thành công")
            found = true
            break
        }
    }
    if (!found) {
        print("404 not found")
    }
}

fun suaThanhVien() {
    print("Enter ID: ")
    val id = readln()
    var found = false
    for ((index, data) in list.withIndex()) {
        if (data.getId() == id) {
            print("Name: ")
            val name = readln()
            print("Tuoi: ")
            val tuoi = readln().toInt()
            print("Chieu cao: ")
            val hi = readln().toFloat()

            list[index] = ThanhVien(id, name, tuoi, hi)
            println("Sửa thành công")
            found = true
            break
        }
    }
    if (!found) {
        print("404 not found")
    }
}

fun hienThanhVien() {
    for (data in list) {
        println("Tên: ${data.getName()}")
    }
}

fun SQLtrack() {
    val result: ResultSet = dbnow.prepareStatement("SELECT * FROM nv").executeQuery()
    var i = 0
    while (result.next()) {
        println("[RESULT ${i}]-----------------------------------")
        println("ID ${result.getInt("id")}")
        println("Name ${result.getString("name")}")
        println("Age ${result.getInt("age")}")
        println("Height ${result.getFloat("height")}")
        println("[RESULT ${i}]-----------------------------------\n")
        i++
    }
}

suspend fun api(): String {
    val client = HttpClient {
        install(JsonFeature) {
            serializer = KotlinxSerializer()
        }
    }

    val data = client.get<String>("https://api.qewertyy.dev/")
    return data
}

fun main() {
    var input: Int
    do {
        println("1. Them thanh vien\n2. Tim thanh vien\n3. Xoa thanh vien\n4. Sua thanh vien\n5. Hien thanh vien\n6. Track du lieu tu SQL Server\n7. Thu nghiem Fetch Reddit API tra ve Object\n8. Thoat")
        input = readln().toInt()

        when (input) {
            1 -> themThanhVien()

            2 -> timThanhVien()

            3 -> xoaThanhVien()

            4 -> suaThanhVien()

            5 -> hienThanhVien()

            6 -> SQLtrack()

            7 -> runBlocking {
                val wait = async {
                    api()
                }
                val result = wait.await()
                println("RESULT: $result")
            }
            8 -> exitProcess(0)
        }
    } while (input != 0)
}