/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnoabstracta;

/**
 *
 * @author profesor
 */
public class AlumnoUni extends Alumno{
    
    private int creditosGratis;

    public AlumnoUni(int creditosGratis, String nombre, String apellido, String nif, String email) {
        super(nombre, apellido, nif, email);
        this.creditosGratis = creditosGratis;
    }

    @Override
    public void estudiar() {
        System.out.println("Estudio mucho y no voy de fiesta");
    }
    
    
    
}
