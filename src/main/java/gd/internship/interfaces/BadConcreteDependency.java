package gd.internship.interfaces;

import gd.internship.interfaces.db.RealDbConnection;

public class BadConcreteDependency {
    private RealDbConnection dbConnection;

    BadConcreteDependency(RealDbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void writeDataIntoDatabase(String data) {
        dbConnection.write(data);
    }
}
