package com.fpinkotlin.functions.exercise02

import com.fpinkotlin.functions.exercise02.compose
import io.kotlintest.properties.forAll
import io.kotlintest.specs.StringSpec

class FunctionsTest : StringSpec({
    "compose" {
        forAll { x: Int ->
            compose(::square, ::triple)(x) == square(triple(x))
        }
    }
})

