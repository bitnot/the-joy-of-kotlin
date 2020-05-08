package com.fpinkotlin.functions.exercise05

class Functions

fun square(n: Int) = n * n

fun triple(n: Int) = n * 3

fun <T, U, V> compose(f: (U) -> V, g: (T) -> U): (T) -> V = { f(g(it)) }

val add: (Int) -> (Int) -> Int = { a -> { b -> a + b } }

val compose: ((Int) -> Int) -> ((Int) -> Int) -> (Int) -> Int =
    { x: (Int) -> Int -> { y: (Int) -> Int -> { z: Int -> x(y(z)) } } }

fun <A, B, C> higherCompose(): ((B) -> C) -> ((A) -> B) -> (A) -> C =
    { f ->
        { g -> { a: A -> f(g(a)) } }
    }


