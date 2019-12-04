package gd.internship.interfaces;

import gd.internship.interfaces.db.DbConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodInterfaceDependencyTest {

    @Test
    void dbInterFaceTest() {
        DbConnection testDbConnection = new DbConnection() {
            private String data;

            @Override
            public void write(String data) {
                this.data = "test" + data;
            }

            @Override
            public String read() {
                return data;
            }
        };

        String inputData = "Data";
        String expected = "testData";

        new GoodInterfaceDependency(testDbConnection)
                .writeDataIntoDatabase(inputData);

        String actual = testDbConnection.read();

        assertEquals(expected, actual);
    }

}