package org.geektimes.rest.demo;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Variant;

public class RestClientDemo {

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        Response response = client
                .target("http://127.0.0.1:8080/hello/world")      // WebTarget
                .request() // Invocation.Builder
                .get();                                     //  Response

        String content = response.readEntity(String.class);

        System.out.println(content);


        // post
        Client client2 = ClientBuilder.newClient();
        Response response2 = client
                .target("http://127.0.0.1:8080/hello")      // WebTarget
                .request() // Invocation.Builder
                .post(Entity.entity("{\"q1\":1,\"q2\":2}",
                        new Variant(new MediaType("text", "plain"), "en", "UTF-8")));                                     //  Response
        String content2 = response2.readEntity(String.class);
        System.out.println(content2);
    }
}
