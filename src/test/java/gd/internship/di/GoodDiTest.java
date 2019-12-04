package gd.internship.di;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodDiTest {

    private static class TestDbConnection extends RealDbConnection {
        @Override
        public void write(String data) {
            super.write("test" + data);
        }
    }

    @Test
    void dbWriteTest() {
        String inputData = "Data";
        String expected = "testData";
        final TestDbConnection dbConnection = new TestDbConnection();

        new GoodDi(dbConnection)
                .writeDataIntoDatabase(inputData);

        String actual = dbConnection.read();

        assertEquals(expected, actual);
    }
}