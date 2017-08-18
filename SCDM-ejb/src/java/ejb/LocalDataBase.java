/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.Date;
import java.util.List;
import javax.ejb.Local;
import jpa.*;

/**
 *
 * @author Fernando Jiménez Iglesias
 */
@Local
public interface LocalDataBase {
    
    
    public List<User> getUsers();    
    public void insertUser(User user);    
    public void editUser(User user);        
    public void deleteUser(User user);
    
    public List<Disease> getDisease();
    public void insertDisease(Disease disease);    
    public void editDisease(Disease disease);    
    public void deleteDisease(Disease disease);
    
    public List<Symptom> getSymptom();
    public void insertSymptom(Symptom symptom);    
    public void editSymptom(Symptom symptom);    
    public void deleteSymptom(Symptom symptom);
    
    public List<Implication> getImplication();
    public void insertImplication(Implication implication);    
    public void editImplication(Implication implication);    
    public void deleteImplication(Implication implication);
    
    public List<Reference> getReference();
    public void insertReference(Reference reference);    
    public void editReference(Reference reference);    
    public void deleteReference(Reference reference);
}
