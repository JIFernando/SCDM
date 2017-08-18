/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Disease;

import ejb.LocalDataBase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import jpa.Disease;

/**
 *
 * @author Fernando Jiménez Iglesias
 */
@Named("showDisease")
@RequestScoped
public class ShowDisease {

    @EJB
    LocalDataBase bdl;
    
    Disease disease;
    private int[] diagnosticos_id;
    
    public ShowDisease() {

    }

    public Disease getAviso() {
        return disease;
    }

    public void setAviso(Disease disease) {
        this.disease = disease;
    }

    public String capturarYMostrar(Disease disease) {
        this.disease = disease;
        return "showDisease?faces-redirect=true";
    }

    public String capturarYEditar() {
        return "editDisease?faces-redirect=true";
    }

    public String editDisease(Disease disease) {
       
        return "grid_avisos.xhtml";
    }
    
    public String deleteDisease() {
        bdl.deleteDisease(disease);
        
        return "grid_avisos.xhtml";
    }

    public LocalDataBase getBdl() {
        return bdl;
    }

    public void setBdl(LocalDataBase bdl) {
        this.bdl = bdl;
    }

    public int[] getDiagnosticos_id() {
               
        return diagnosticos_id;
    }

    public void setDiagnosticos_id(int[] diagnosticos_id) {
        this.diagnosticos_id = diagnosticos_id;
    }
    
    
}
