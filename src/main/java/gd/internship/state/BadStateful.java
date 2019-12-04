package gd.internship.state;

public class BadStateful {
    private String statefulString;

    public void badProcedure() {
        statefulString = "someValue";
    }

    public String processData(String data) {
        return data + statefulString;
    }
}
