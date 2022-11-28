package com.axis.dbconnection

import java.sql.DriverManager



fun main() {
    val myurl="jdbc:mysql://localhost:3306/kotlindb"
    val connection=DriverManager.getConnection(myurl,"root","hema")
    println("Connection established successfully")

    //update
    val stmt = connection.createStatement()
    val update_res=stmt.executeUpdate("update users set name = 'Rohit' where id = 1")
    if( update_res > 0){
        println("successfully updated record in users db !!!")
        println("$update_res updated")
    } else{
        println("Update Not sucessful")
    }
}