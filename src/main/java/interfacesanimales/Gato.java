/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesanimales;

/**
 *
 * @author profesor
 */
public class Gato extends Felino implements Mascota {

    public Gato(double peso) {
        super(peso);
    }

    @Override
    public void cazar() {
        System.out.println("Cazando como un gato");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo como un gato");
    }
    
    public void maullar(){
        System.out.println("Miaauuuu");
    }

    @Override
    public boolean jugar(int minutosJuego) {
        if (minutosJuego > 100){
            System.out.println("El gato no juega");
            return false;
        }
        return true;
    }
    
    public void vacunar(){
        System.out.println("Gato vacunado de coronavirus");
    }

}
