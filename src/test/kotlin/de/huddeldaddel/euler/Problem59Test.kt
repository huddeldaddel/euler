package de.huddeldaddel.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem59Test {

    @Test
    fun testDecryptWithPassword() {
        val cypher = listOf('k'.toInt(), 65, 107)
        val result = Problem59().decryptWithPassword(cypher, "**")
        Assertions.assertEquals("AkA", result)
    }

}