/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeetutorial.hello1;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author tiago.lucas
 */
@Named
@RequestScoped
public class Hello {
    private String name;
    
    public Hello(){        
    }
    
    public String getName(){
        return name;     
    }
    
    public void setName(String user_name){
        this.name = user_name;
    }
}
