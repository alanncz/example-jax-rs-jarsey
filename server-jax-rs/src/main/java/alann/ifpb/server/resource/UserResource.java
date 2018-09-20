/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alann.ifpb.server.resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author alann
 */
@Path("/teste")
public class UserResource {

    private static final String URL = "jdbc:postgresql://database:5432/database";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public void newUser(User user) throws SQLException, ClassNotFoundException {
        Connection con =  DriverManager.getConnection(URL, USER, PASSWORD);
        insert(con,user);
    }
    
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public String newUser() {
        System.out.println("ping");
        return "ping";
    }

    public void insert(Connection con, User user) throws SQLException {
        String sql = "insert into client (name,link) values(?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, user.getName());
            ps.setString(2, user.getImageLink());
            ps.execute();
        }
    }

}
