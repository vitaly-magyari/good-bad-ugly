package gd.internship.di;

public class GoodDi {
    private RealDbConnection dbConnection;

    GoodDi(RealDbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void writeDataIntoDatabase(String data) {
        dbConnection.write(data);
    }
}
