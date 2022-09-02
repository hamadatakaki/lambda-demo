package byjava;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

// demo command: 
// curl -XPOST "http://localhost:9000/2015-03-31/functions/function/invocations" -d '{"value":"42"}'

public class DemoLambda implements RequestHandler<Request, Response> {
    private String createMessage(int value) {
        int c = 42;
        if (value < c) {
            return String.format("lower than %s.", c);
        } else if (value == c) {
            return "equal!";
        } else {
            return String.format("higher than %s.", c);
        }
    }

    public Response handleRequest(Request req, Context cnt) {
        return new Response(this.createMessage(req.parse()));
    }
}
