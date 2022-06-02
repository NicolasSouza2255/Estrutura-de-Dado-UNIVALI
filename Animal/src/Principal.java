
import br.univali.cc.animal.Animal;
import br.univali.cc.animal.BemTeVi;
import br.univali.cc.animal.Cachorro;
import br.univali.cc.animal.Papagaio;
import br.univali.cc.animal.Passaro;
import br.univali.cc.animal.Vaca;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal;
        animal = new Cachorro("toto");
        ((Cachorro)animal).latirAlto();
        animal.talk();
        animal.imp();
        ((Cachorro)animal).latirBaixo();
        animal.talk();
        animal = new Passaro("urubu");
        animal.talk();
        animal.imp();
        animal = new Vaca("malhada");
        animal.talk();
        animal.imp();
               animal = new BemTeVi("bemtevi");
        animal.talk();
        animal = new Papagaio("poli");
        if (animal instanceof Papagaio){
            ((Papagaio)animal).setVocabulario("fala  o que o humano fala");
        }
        animal.talk();
        
        
        
        Cachorro bidu = new Cachorro("bidu");
        bidu.latirAlto();
        bidu.talk();
        bidu.imp();

        
        Papagaio loro = new Papagaio("loro jose");
        loro.setVocabulario("#$%#%#$$¨&¨*&");
        loro.talk();
        
    }
    
}
