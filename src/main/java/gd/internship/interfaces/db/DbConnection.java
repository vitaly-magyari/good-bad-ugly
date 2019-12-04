package gd.internship.interfaces.db;

public interface DbConnection {
    void write(String data);
    String read();
}
