package de.huddeldaddel.euler.math

import java.math.BigInteger

class FactorialFactory(private val cache: MutableMap<Int, BigInteger> = mutableMapOf()) {

    fun build(fac: Int): BigInteger {
        if(cache.containsKey(fac)) {
            return cache[fac] ?: BigInteger.ZERO
        }

        return if(2 > fac)
            BigInteger.ONE
        else {
            val result = build(fac - 1).multiply(fac.toBigInteger())
            cache[fac] = result
            result
        }
    }

}