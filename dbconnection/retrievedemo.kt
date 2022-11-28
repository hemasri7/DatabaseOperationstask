package com.axis.dbconnection

import java.sql.DriverManager
data class User(var id:Int,val name:String)

fun main() {
    val myurl="jdbc:mysql://localhost:3306/kotlindb"
    val connection=DriverManager.getConnection(myurl,"root","hema")
    println("Connection established successfully")

    //select query -Read
    val query = connection.prepareStatement("select * from users")
    val result = query.executeQuery()
    val users = mutableListOf<User>()
    while(result.next()){
        val id = result.getInt("id")
        val name = result.getString("name")
        users.add(User(id, name))
    }
    println(users)
}