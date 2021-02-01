/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author profesor
 */
public class Deportivo extends Vehiculo{
    
    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Deportivo() {
        // Implícitamente está llamando a super();
    }

    public Deportivo(int cilindrada, String matricula, String marca, String modelo, String color, double precio, boolean disponible) {
        super(matricula, marca, modelo, color, precio, disponible);
        this.cilindrada = cilindrada;
    }
    
    
}
