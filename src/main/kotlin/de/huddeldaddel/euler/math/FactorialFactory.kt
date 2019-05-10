package de.huddeldaddel.euler.math

import java.math.BigInteger

class FactorialFactory {

    fun build(fac: Int): BigInteger {
        return if(1 == fac)
            BigInteger.ONE
        else
            build(fac -1).multiply(fac.toBigInteger())
    }

}