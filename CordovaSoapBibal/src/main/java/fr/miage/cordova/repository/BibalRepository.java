/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.cordova.repository;

import io.spring.guides.gs_producing_web_service.*;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 *
 * @author alex
 */
@Component
public class BibalRepository {
    private static final Map<String,Book> books= new HashMap<>();
    
    @PostConstruct
    public void initFakeData(){
        Book lesMiserables = new Book();
        lesMiserables.setName("Les misérables");
        lesMiserables.setDisponible(true);
        lesMiserables.setSynopsis("La vie des Acsi");
        lesMiserables.setBibliotheque("Bu du PLG");
        lesMiserables.setGeolocX(48.69744738);
        lesMiserables.setGeolocY(6.17180586);
        
        Book lesLiaisonsDangereuses = new Book();
        lesLiaisonsDangereuses.setName("Les liasons dangereuses");
        lesLiaisonsDangereuses.setDisponible(false);
        lesLiaisonsDangereuses.setSynopsis("See, sex and fuck");
        lesLiaisonsDangereuses.setBibliotheque("Bu du artem");
        lesLiaisonsDangereuses.setGeolocX(48.67259967);
        lesLiaisonsDangereuses.setGeolocY(6.17120504);
        
        Book uml = new Book();
        lesLiaisonsDangereuses.setName("UML");
        lesLiaisonsDangereuses.setDisponible(true);
        lesLiaisonsDangereuses.setSynopsis("UML pour les nuls");
        lesLiaisonsDangereuses.setBibliotheque("Bu de Metz Saulcy");
        lesLiaisonsDangereuses.setGeolocX(49.11927609);
        lesLiaisonsDangereuses.setGeolocY(6.16562605);
        
        books.put(lesMiserables.getName(),lesMiserables);
        books.put(lesLiaisonsDangereuses.getName(),lesLiaisonsDangereuses);
        books.put(uml.getName(),uml);
    }
    
    public Book findBook(String name){
        Assert.notNull(name, "Le nom du livre ne peut etre vide");
        return books.get(name);
    }
}
