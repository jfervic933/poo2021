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
public class AlumnoPost extends Alumno{

    private boolean beca;
    private int importeBeca;

    public AlumnoPost(boolean beca, int importeBeca, String nombre, String apellido, String nif, String email) {
        super(nombre, apellido, nif, email);
        this.beca = beca;
        this.importeBeca = importeBeca;
    }
    
    // Una subclase no abstract debe implementar todos los 
    // métodos abstract de su superclase
    @Override
    public void estudiar() {
        System.out.println("Soy de post y estudio 1 minuto al día");
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    public int getImporteBeca() {
        return importeBeca;
    }

    public void setImporteBeca(int importeBeca) {
        this.importeBeca = importeBeca;
    }
    
    
    
}
