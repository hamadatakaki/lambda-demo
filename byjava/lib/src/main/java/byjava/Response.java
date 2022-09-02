package byjava;

public class Response {
    public String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Response(String msg) {
        this.setMessage(msg);
    }

    public Response() {}
}
