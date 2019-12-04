package gd.internship.par_class;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodFuncParamTest {

    @Test
    void funcParamTest() {
        int testParam = 2;
        int expected = 4;
        int actual = new GoodFuncParam().calculateBusinessValue(testParam);

        assertEquals(expected, actual);

    }
}