/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alann.ifpb.server.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author alann
 */
@Path("/teste")
public class UserResource {

    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public void newUser(User user) {
        System.out.println(user);
    }

}
