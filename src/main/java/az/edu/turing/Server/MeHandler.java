package az.edu.turing.Server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

class MeHandler implements HttpHandler {
    private final String name;
    private final String surname;

    public MeHandler(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String response = "Name: " + name + ", Surname: " + surname;
        exchange.sendResponseHeaders(200, response.length());
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }


}
