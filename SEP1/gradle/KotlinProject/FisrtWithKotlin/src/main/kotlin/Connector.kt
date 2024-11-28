package com.kotlinab

import java.sql.Connection
import java.sql.DriverManager

class Connector {
    fun db(): Connection {
        val uri = "jdbc:sqlserver://localhost:1433;databaseName=testDB;encrypt=true;trustservercertificate=true"
        val name = "sa"
        val pass = "123"
        return DriverManager.getConnection(uri, name, pass)
    }
    fun test() {
        val db = db()
        val dbmt = db.metaData
        println(dbmt.getDriverName());
        println(dbmt.getDatabaseProductName());
    }
}