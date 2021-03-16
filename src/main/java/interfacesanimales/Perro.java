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
public class Perro extends Animal implements Mascota {

    public Perro(double peso) {
        super(peso);
    }

    public void ladrar() {
        System.out.println("Ladrando guau guau");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo como un perro");
    }

    @Override
    public boolean jugar(int minutosJuego) {
        if (minutosJuego > 200) {
            System.out.println("El perro no juega");
            return false;
        }
        return true;
    }

}
