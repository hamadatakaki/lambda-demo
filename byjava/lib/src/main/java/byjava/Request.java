package byjava;

public class Request {
    public String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Request(String value) {
        this.setValue(value);
    }

    public Request() {}

    public int parse() {
        try {
            return Integer.parseInt(this.getValue());
        } catch (Exception e) {
            return 0;
        }
    }
}
