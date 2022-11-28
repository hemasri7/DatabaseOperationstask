package com.axis.dbconnection


import java.sql.DriverManager



fun main() {
    val myurl="jdbc:mysql://localhost:3306/kotlindb"
    val connection=DriverManager.getConnection(myurl,"root","hema")
    println("Connection established successfully")

    //  create
    val stmt= connection.createStatement()
    stmt.execute("create table product(id int,name varchar(45));")
    print("table created")
}