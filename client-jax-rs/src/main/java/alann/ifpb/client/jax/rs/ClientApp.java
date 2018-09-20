/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alann.ifpb.client.jax.rs;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author alann
 */
public class ClientApp {

    public static void main(String[] args)  {

        String name = "Alann";
        String imageLink = "https://www.comboinfinito.com.br/principal/wp-content/uploads/2017/04/goku-dragon-ball.jpg";
        User user = new User(name, imageLink);
        Client client = Client.create(new DefaultClientConfig());
        WebResource webResource = client.resource("http://localhost:8080/teste");
        webResource.type(MediaType.APPLICATION_XML).post(user);

    }

}
