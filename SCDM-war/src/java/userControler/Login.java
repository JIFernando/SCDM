/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userControler;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import jpa.User;
import ejb.LocalDataBase;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Fernando Jiménez Iglesias
 */

@Named(value = "login")
@RequestScoped
public class Login {
    private Integer user;
    private String password;
    private List<User> users;
    
    @Inject
    private AutorizationControler ctrl;
    @EJB
    private LocalDataBase bdl;
    
    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPasswordc(String contrasenia) {
        this.password = password;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    /**
     * Creates a new instance of Login
     */
    public Login() {
        
    }

    public String authenticate() {
        if (!correctUser()) {
            FacesContext ctx = FacesContext.getCurrentInstance();
            ctx.addMessage("user", new FacesMessage(FacesMessage.SEVERITY_ERROR, "incorrect user or password", "incorrect user or password incorrect"));
            System.out.println("Incorrect user");
        }
        return ctrl.home();
    }

    private boolean correctUser() {
        boolean found = false;
        if(user!=null){
            System.out.println("User: " + user);
            List<User> usersBD = bdl.getUsers();
            System.out.println("Users bd" + usersBD);
            for (User u : usersBD) {
                System.out.println("User bd: " + u.getId());
                if (user.equals(u.getId()) && u.getPass().equals(password)) {
                    found = true;
                    ctrl.setEmpleado(u);
                }
            }        
        }
        return found;
    }
}

