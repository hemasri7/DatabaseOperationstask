package com.axis.dbconnection

import java.sql.DriverManager



fun main() {
    val myurl="jdbc:mysql://localhost:3306/kotlindb"
    val connection=DriverManager.getConnection(myurl,"root","hema")
    println("Connection established successfully")

    //insert query - create
    var stmt=connection.createStatement()
    var res=stmt.executeUpdate("insert into users values(1,'Hema')")
    if(res>0)
    {
        println("successfully inserted record into users db !!!")
    }
    else{
        println("Insert not successful")
    }
}