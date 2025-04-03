package com.example.lb1

fun main()
{
    println("Artem Bikmaiev FIT 3-2")

    val a1 = 7;
    val b1 = 120;
    val c1 = 5;
    val d1 = 17
    val result1 = (a1 + b1 + c1 - d1) * 2 / 3 % 5 + c1
    println("Task result 7: $result1")

    val x2 = 130;
    val y2 = 140;
    val z2 = 10
    val result2 = (x2 > y2) || (z2 < x2) && (y2 > z2)
    println("Task result 12: $result2")

    val a3 = 18;
    val b3 = 15;
    val c3 = 120
    val result3 = (7 * a3 + 3 * b3 - 6 * c3) / ((a3 - b3) * c3)
    println("Task result 13: $result3")

    val a4 = 9;
    val b4 = 2;
    val c4 = 70;
    val d4 = 7
    val result4 = ((a4 * c4) / b4) / d4 + 10 * a4 % b4 - (a4 / d4)
    println("Task result 16: $result4")

    val a5 = 3;
    //val b5 = 19;
    val c5 = 20;
    val d5 = 9
    val result5 = ((a5 + c5) / d5) * a5 - 3 + 7 * (a5 - d5) - (c5 * d5)
    println("Task result 19: $result5")
}

