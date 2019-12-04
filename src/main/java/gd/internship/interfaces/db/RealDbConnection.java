package gd.internship.interfaces.db;

public class RealDbConnection implements DbConnection {

    private String data;

    @Override
    public void write(String data) {
        this.data = data;
    }

    @Override
    public String read() {
        return data;
    }
}
