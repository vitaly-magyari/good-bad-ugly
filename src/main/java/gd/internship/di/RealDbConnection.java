package gd.internship.di;

public class RealDbConnection {

    private String data;

    public void write(String data) {
        this.data = data;
    }

    public String read() {
        return data;
    }
}
