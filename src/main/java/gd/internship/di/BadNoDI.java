package gd.internship.di;

public class BadNoDI {
    public void writeDataIntoDatabase(String data) {
        new RealDbConnection().write(data);
    }
}
