package com.axis.dbconnection
import java.sql.DriverManager
import java.util.Scanner
fun main() {
    var sc=Scanner(System.`in`)
    print("Enter the id :")
    var id=sc.nextInt()
    print("Enter the name :")
    var name=sc.next()
    val myurl="jdbc:mysql://localhost:3306/kotlindb"
    val connection=DriverManager.getConnection(myurl,"root","hema")
    println("Connection established successfully")
    val prestmt=connection.prepareStatement("insert into users values(?,?)")

    prestmt.setInt(1,id)
    prestmt.setString(2,name)
    val result=prestmt.executeUpdate()
    if(result>0){
        println("inserted")
    }else{
        println("not inserted")
    }
}