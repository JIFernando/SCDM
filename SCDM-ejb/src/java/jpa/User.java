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
import javax.persistence.Inheritance;
import static javax.persistence.InheritanceType.JOINED;

/**
 *
 * @author Fernando Jiménez Iglesias
 */
@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nick;
    private String email;
    private String pass;
    private String sex;
    private List<Diagnosis> diagnosis;
    private String img;
        
    public User() {
        this.nick = "";
        this.email = "";
        this.sex = "";
        this.pass = "";
    }
    
    @Override
    public boolean equals(Object object){
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        
        return ((Integer) this.id != null) && ((Integer) other.id != null)
                && this.id == other.id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
        hash = 41 * hash + Objects.hashCode(this.nick);
        return hash;
    }
        
    @Override       
    public String toString(){
        return nick;
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

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public List<Diagnosis> getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(List<Diagnosis> diagnosis) {
        this.diagnosis = diagnosis;
    }
}
