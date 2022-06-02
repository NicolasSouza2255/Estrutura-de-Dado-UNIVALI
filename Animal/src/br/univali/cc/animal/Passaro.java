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
public class Passaro extends Animal{
    

    public Passaro(String nome) {
        super(nome);
    }


    @Override
    public void talk() {
        System.out.println("piu piu");
    }
    
        @Override
    public void imp() {
        System.out.println(this.getNome()+" Passaro");
    }

    
    
    
}
