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
public class Papagaio extends Passaro{
    

    public Papagaio(String nome) {
        super(nome);
    }

    
    private String vocabulario;

    public void setVocabulario(String vocabulario) {
        this.vocabulario = vocabulario;
    }
    
    @Override
    public void talk() {
        System.out.println(vocabulario);
    }
    
    
    
}
