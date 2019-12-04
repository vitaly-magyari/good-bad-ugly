package gd.internship.state;

public class BetterImmutability {

    private final String businessParam;

    BetterImmutability(String param) {
        businessParam = param;
    }

    public String processData(String data) {
        return data + businessParam;
    }
}
