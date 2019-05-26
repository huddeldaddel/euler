package de.huddeldaddel.euler.math

class FractionComparator : Comparator<Fraction> {

    override fun compare(o1: Fraction, o2: Fraction): Int {
        return o1.toDouble().compareTo(o2.toDouble())
    }

}