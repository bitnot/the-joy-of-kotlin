package com.fpinkotlin.functions.exercise04

import com.fpinkotlin.functions.exercise10.curried

class Functions

fun square(n: Int) = n * n

fun triple(n: Int) = n * 3

fun <T, U, V> compose(f: (U) -> V, g: (T) -> U): (T) -> V = { f(g(it)) }

val add: (Int) -> (Int) -> Int = { a -> { b -> a + b } }

val compose: ((Int) -> Int) -> ((Int) -> Int) -> ((Int) -> Int) = { f -> { g -> { i -> f(g(i)) } } }
