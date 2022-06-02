/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.cc.animal;

/**
 *
 * @author 1978233
 */
public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
    
    

    public final String getNome() {
        return nome;
    }
    
    public abstract void imp();
        
    public abstract void talk();
    
}
