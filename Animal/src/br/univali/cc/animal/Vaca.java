/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.cc.animal;


public class Vaca extends Mamifero{

    

    public Vaca(String nome) {
        super(nome);
    }

    @Override
    public void talk() {
        System.out.println("Muuuu.....");
    }
    
    @Override
    public void imp() {
        System.out.println(this.getNome()+" Vaca");
    }

    
    
    
}
