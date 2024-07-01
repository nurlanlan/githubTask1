package az.edu.turing.Server;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Task1 {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(9000), 0);
        server.createContext("/", new RootHandler());

        String name = "John";
        String surname = "Doe";
        server.createContext("/me", new MeHandler(name, surname));

        server.setExecutor(null); // creates a default executor
        server.start();
        System.out.println("Server started on port 9000");
    }
}
