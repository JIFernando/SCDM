/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.*;

/**
 *
 * @author Fernando Jiménez Iglesias
 */
@Stateless
public class DataBase implements LocalDataBase{
    
    @PersistenceContext(unitName = "TFG-SCDM-ejbPU")
    private EntityManager em;
        
    /**
     * 
     * Call to the database to obtain a list of users
     * 
     * @return List<User>
     */
    @Override
    public List<User> getUsers(){
        return em.createQuery("select a from User a", User.class).getResultList();
    }
    
    /**
     * 
     * Insert a new User in the data base
     * 
     * @param user 
     */
    @Override
    public void insertUser(User user) {
        // throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("NUEVO ID: " + user.getId());
        em.persist(user);
    }
    
    /**
     *
     * Modify an user
     *
     * @param user
     */
    @Override
    public void editUser(User user) {
        // throw new UnsupportedOperationException("Not supported yet.");
        em.merge(user);
    }
    
    /**
     * Delete a user
     * @param User 
     */
    @Override
    public void deleteUser(User user){
        em.remove(user);
    }
    
    
    /**
     * Create disease
     * @param disease 
     */
    public void insertDisease(Disease disease){
        em.persist(disease);
    }
    
    /**
     * Edit a Disease 
     * @param disease 
     */
    @Override
    public void editDisease(Disease disease){
        em.merge(disease);
    }
    
    /**
     * Delete a Disease
     * @param disease 
     */
    @Override
    public void deleteDisease(Disease disease){
        em.remove(disease);
    }
    
    /**
     * 
     * Call to the database to obtain a list of diseases
     * 
     * @return List<Disease>
     */
    @Override
    public List<Disease> getDisease(){
        return em.createQuery("select a from Disease a", Disease.class).getResultList();
    }
    
    /**
     * Create symptom
     * @param symptom 
     */
    public void insertSymptom(Symptom symptom){
        em.persist(symptom);
    }
    
    /**
     * Edit a symptom 
     * @param symptom 
     */
    @Override
    public void editSymptom(Symptom symptom){
        em.merge(symptom);
    }
    
    /**
     * Delete a symptom
     * @param symptom 
     */
    @Override
    public void deleteSymptom(Symptom symptom){
        em.remove(symptom);
    }
    
    /**
     * 
     * Call to the database to obtain a list of symptoms
     * 
     * @return List<Symptom>
     */
    @Override
    public List<Symptom> getSymptom(){
        return em.createQuery("select a from Symptom a", Symptom.class).getResultList();
    }
    
    /**
     * Create implication
     * @param implication 
     */
    public void insertImplication(Implication implication){
        em.persist(implication);
    }
    
    /**
     * Edit a implication 
     * @param implication 
     */
    @Override
    public void editImplication(Implication implication){
        em.merge(implication);
    }
    
    /**
     * Delete a implication
     * @param implication 
     */
    @Override
    public void deleteImplication(Implication implication){
        em.remove(implication);
    }
    
    /**
     * 
     * Call to the database to obtain a list of implication
     * 
     * @return List<Implication>
     */
    @Override
    public List<Implication> getImplication(){
        return em.createQuery("select a from Implication a", Implication.class).getResultList();
    }
    
    /**
     * 
     * Call to the database to obtain a list of reference
     * 
     * @return List<Reference>
     */    
    @Override
    public List<Reference> getReference(){
        return em.createQuery("select a from Reference a", Reference.class).getResultList();
    }
    
    /**
     * Create reference
     * @param reference 
     */
    @Override
    public void insertReference(Reference reference){
        em.persist(reference);
    }  
    
    /**
     * Edit reference
     * @param reference 
     */    
    @Override
    public void editReference(Reference reference){
        em.merge(reference);
    }    
    
    /**
     * Delete reference
     * @param reference 
     */
    @Override
    public void deleteReference(Reference reference){
        em.remove(reference);
    }
}
