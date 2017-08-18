/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userControler;

import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import jpa.User;

/**
 *
 * @author Fernando Jiménez Iglesias
 */
@Named(value = "controlAutorizacion")
@SessionScoped
public class AutorizationControler {
    private User user;
    
    /**
     * Creates a new instance of ControlAutorizacion
     */
    public AutorizationControler() {
    }

    public User getUser() {
        return user;
    }

    public void setEmpleado(User user) {
        this.user = user;
    }

    public String home() {
        // Implementar el método
        // Devuelve la página Home dependiendo del rol del usuario
        // Si no hay usuario debe devolver la página de login
        // Si el usuario es el administrador debe devolver la página admin.xhtml
        // Si el usuario es un usuario normal debe devolver la página normal.xhtml
        if (user == null) {
            return "login.xhtml";
        } else {
            return "inicio.xhtml";
        }
    }

    public String logout() {
        // Destruye la sesión (y con ello, el ámbito de este bean)
       FacesContext ctx = FacesContext.getCurrentInstance();
        ctx.getExternalContext().invalidateSession();
        user = null;
        return "login?faces-redirect=true";
    }
}
