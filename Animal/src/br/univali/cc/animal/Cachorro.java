/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.cc.animal;


public class Cachorro extends Mamifero{

    public Cachorro(String nome) {
        super(nome);
    }
    
    private boolean alto = false;
    
    
    public void latirAlto(){
        this.alto = true;
    }
    
    public void latirBaixo(){
        this.alto = false;
    }

    @Override
    public void talk() {
        String latido = "au au";
        System.out.println(this.alto ? latido.toUpperCase() : latido.toLowerCase());
    }

    @Override
    public void imp() {
        System.out.println(this.getNome()+" Cachorro");
    }
    
    
 
    
}
