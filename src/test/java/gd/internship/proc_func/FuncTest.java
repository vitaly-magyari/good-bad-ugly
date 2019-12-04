package gd.internship.proc_func;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncTest {

    @Test
    void funcTest() {
        String expected = "someValue";
        String actual = new GoodFunction().goodFunction();

        assertEquals(expected, actual);
    }
}
