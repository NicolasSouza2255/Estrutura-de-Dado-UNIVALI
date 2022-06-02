/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.cc.animal;


public final class BemTeVi extends Passaro{
    

    public BemTeVi(String nome) {
        super(nome);
    }


    @Override
    public void talk() {
        System.out.println("Bem-Te-Vi");
    }
    
    
    
}
