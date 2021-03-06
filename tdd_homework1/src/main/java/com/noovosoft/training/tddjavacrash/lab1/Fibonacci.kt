package com.noovosoft.training.tddjavacrash.lab1

fun findFibonacci(number: Int): Int {
    var current = 1
    var prev = 0
    var next: Int
    if (number <= 1)
        return number
    for (i in 2..number) {
        next = current + prev
        prev = current
        current = next
    }
    return current
}

fun recursiveFibonacci(number: Int): Int {
    return when(number) {
        0 ->  0
        1 ->  1
        else ->  recursiveFibonacci(number-1) + recursiveFibonacci(number-2)
    }
}