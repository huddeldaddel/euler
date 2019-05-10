package de.huddeldaddel.euler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem11Test {

    @Test
    public void testGrid() {
        final Problem11.Grid grid = new Problem11.Grid();
        Assertions.assertEquals(8, grid.get(0,0));
        Assertions.assertEquals(15, grid.get(0,5));
        Assertions.assertEquals(48, grid.get(19,19));
    }

}
