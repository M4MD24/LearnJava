package _1_learn._1_9_network._1_9_9_restful_api;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class RESTfulAPIExample {
    public static void main(final String[] ARGUMENTS) throws IOException {
        final HttpServer HTTP_SERVER = HttpServer.create(
                new InetSocketAddress(
                        "localhost",
                        1424
                ),
                0
        );
        HTTP_SERVER.createContext(
                "/home",
                new MovieHandler()
        );
        HTTP_SERVER.setExecutor(Executors.newSingleThreadExecutor());
        HTTP_SERVER.start();
        System.out.println("Server started at http://localhost:1424/home");
    }

    private static class MovieHandler implements HttpHandler {
        @Override
        public void handle(final HttpExchange EXCHANGE) throws IOException {
            final OutputStream OUTPUT_STREAM = EXCHANGE.getResponseBody();
            final String TEXT_OF_RESPONSE;
            switch (EXCHANGE.getRequestMethod()) {
                case "GET":
                    TEXT_OF_RESPONSE = "GET request received!";
                    EXCHANGE.sendResponseHeaders(
                            200,
                            TEXT_OF_RESPONSE.length()
                    );
                    break;
                case "POST":
                    TEXT_OF_RESPONSE = "POST request received!";
                    EXCHANGE.sendResponseHeaders(
                            201,
                            TEXT_OF_RESPONSE.length()
                    );
                    break;
                case "PUT":
                    TEXT_OF_RESPONSE = "PUT request received!";
                    EXCHANGE.sendResponseHeaders(
                            200,
                            TEXT_OF_RESPONSE.length()
                    );
                    break;
                case "DELETE":
                    TEXT_OF_RESPONSE = "DELETE request received!";
                    EXCHANGE.sendResponseHeaders(
                            200,
                            TEXT_OF_RESPONSE.length()
                    );
                    break;
                case "PATCH":
                    TEXT_OF_RESPONSE = "PATCH request received!";
                    EXCHANGE.sendResponseHeaders(
                            200,
                            TEXT_OF_RESPONSE.length()
                    );
                    break;
                case "HEAD":
                    EXCHANGE.sendResponseHeaders(
                            200,
                            -1
                    );
                    OUTPUT_STREAM.close();
                    return;
                case "OPTIONS":
                    TEXT_OF_RESPONSE = "OPTIONS request received!";
                    EXCHANGE.getResponseHeaders().add(
                            "Allow",
                            "GET, POST, PUT, DELETE, PATCH, OPTIONS, HEAD, M3MD69"
                    );
                    EXCHANGE.sendResponseHeaders(
                            200,
                            TEXT_OF_RESPONSE.length()
                    );
                    break;
                case "M3MD69":
                    TEXT_OF_RESPONSE = "CUSTOM request received!";
                    EXCHANGE.sendResponseHeaders(
                            200,
                            TEXT_OF_RESPONSE.length()
                    );
                    break;
                default:
                    TEXT_OF_RESPONSE = "Unsupported method!";
                    EXCHANGE.sendResponseHeaders(
                            405,
                            TEXT_OF_RESPONSE.length()
                    );
                    break;
            }
            OUTPUT_STREAM.write(TEXT_OF_RESPONSE.getBytes());
            OUTPUT_STREAM.flush();
            OUTPUT_STREAM.close();
        }
    }
}