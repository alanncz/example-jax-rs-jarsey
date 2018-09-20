/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alann.ifpb.server.resource;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alann
 */

@XmlRootElement
public class User {
    
    private int id;
    private String name;
    private String imageLink;
    
    public User(){}

    public User(String name, String imageLink) {
        this.name = name;
        this.imageLink = imageLink;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", imageLink=" + imageLink + '}';
    }
    
}
