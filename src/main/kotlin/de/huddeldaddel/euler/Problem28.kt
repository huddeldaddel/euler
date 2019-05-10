package de.huddeldaddel.euler

fun main(args: Array<String>) {
    val size = 1001
    val problem28 = Problem28(size)
    problem28.initializeSpiral()
    println(problem28.getSumOfDiagonals())
}

class Problem28(val size: Int) {

    var spiral: Array<Array<Int>> = Array(size) { _ -> Array(size) { _ -> 0 } }
    var value = 0

    fun initializeSpiral() {
        val center = size / 2
        spiral[center][center] = ++value
        fillSpiralRight(center +1, center)
    }

     private tailrec fun fillSpiralRight(x: Int, y: Int) {
        spiral[y][x] = ++value
        if(0 != spiral[y+1][x]) {
            if(x +1 < size)
                fillSpiralRight(x+1, y)
        } else {
            fillSpiralDown(x, y+1)
        }
    }

    private tailrec fun fillSpiralDown(x: Int, y: Int) {
        spiral[y][x] = ++value
        if(0 != spiral[y][x-1]) {
            fillSpiralDown(x, y+1)
        } else {
            fillSpiralLeft(x-1, y)
        }
    }

    private tailrec fun fillSpiralLeft(x: Int, y: Int) {
        spiral[y][x] = ++value
        if(0 != spiral[y-1][x]) {
            fillSpiralLeft(x -1, y)
        } else {
            fillSpiralUp(x, y -1)
        }
    }

    private tailrec fun fillSpiralUp(x: Int, y: Int) {
        spiral[y][x] = ++value
        if(0 != spiral[y][x +1]) {
            fillSpiralUp(x, y -1)
        } else {
            fillSpiralRight(x +1, y)
        }
    }

    fun getSumOfDiagonals(): Int {
        var sum = 0
        for(i in 0 until size) {
            sum += spiral[i][i]
            sum += spiral[size -1 -i][i]
        }
        val center = size / 2
        sum -= spiral[center][center]
        return sum
    }

}