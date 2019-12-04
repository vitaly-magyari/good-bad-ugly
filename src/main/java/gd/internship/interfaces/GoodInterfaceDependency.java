package gd.internship.interfaces;

import gd.internship.interfaces.db.DbConnection;

public class GoodInterfaceDependency {

    private DbConnection dbConnection;

    GoodInterfaceDependency(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void writeDataIntoDatabase(String data) {
        dbConnection.write(data);
    }
}
