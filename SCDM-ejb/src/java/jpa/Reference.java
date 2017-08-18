/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Fernando Jiménez Iglesias
 */
@Entity
public class Reference {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String typeLinks;
    private List<String> links;

    public Reference() {
        this.typeLinks = "";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.typeLinks);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reference other = (Reference) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    /**
     * *************GETTERS Y SETTERS**************
     */
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeLinks() {
        return typeLinks;
    }

    public void setTypeLinks(String typeLinks) {
        this.typeLinks = typeLinks;
    }

    public List<String> getLinks() {
        return links;
    }

    public void setLinks(List<String> links) {
        this.links = links;
    }    
}
