package JAXWS;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new CompteService());
        System.out.println("Service Deploye sur http://0.0.0.0:9191/ ");
    }
}
