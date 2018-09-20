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
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author alann
 */
@Path("/teste")
public class UserResource {

    private static final String URL = "jdbc:postgresql://localhost:5432/banco";
    private static final String USER = "postgres";
    private static final String PASSWORD = "ala91494924";

    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public void newUser(User user) throws SQLException, ClassNotFoundException {
        Connection con =  DriverManager.getConnection(URL, USER, PASSWORD);
        insert(con,user);
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
