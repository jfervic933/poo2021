/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * @author profesor
 */
public class CocheProfesor {
    
    private Motor motor;
    private Rueda ruedaDI,ruedaDD, ruedaTI, ruedaTD;
    private Puerta puertaPiloto, puertaCopiloto;

    public CocheProfesor(Motor motor, Rueda ruedaDI, Rueda ruedaDD, Rueda ruedaTI, Rueda ruedaTD, Puerta puertaPiloto, Puerta puertaCopiloto) {
        this.motor = motor;
        this.ruedaDI = ruedaDI;
        this.ruedaDD = ruedaDD;
        this.ruedaTI = ruedaTI;
        this.ruedaTD = ruedaTD;
        this.puertaPiloto = puertaPiloto;
        this.puertaCopiloto = puertaCopiloto;
    }

    public CocheProfesor(Motor motor) {
        this.motor = motor;
    }
    
    public CocheProfesor() {
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Rueda getRuedaDI() {
        return ruedaDI;
    }

    public void setRuedaDI(Rueda ruedaDI) {
        this.ruedaDI = ruedaDI;
    }

    public Rueda getRuedaDD() {
        return ruedaDD;
    }

    public void setRuedaDD(Rueda ruedaDD) {
        this.ruedaDD = ruedaDD;
    }

    public Rueda getRuedaTI() {
        return ruedaTI;
    }

    public void setRuedaTI(Rueda ruedaTI) {
        this.ruedaTI = ruedaTI;
    }

    public Rueda getRuedaTD() {
        return ruedaTD;
    }

    public void setRuedaTD(Rueda ruedaTD) {
        this.ruedaTD = ruedaTD;
    }

    public Puerta getPuertaPiloto() {
        return puertaPiloto;
    }

    public void setPuertaPiloto(Puerta puertaPiloto) {
        this.puertaPiloto = puertaPiloto;
    }

    public Puerta getPuertaCopiloto() {
        return puertaCopiloto;
    }

    public void setPuertaCopiloto(Puerta puertaCopiloto) {
        this.puertaCopiloto = puertaCopiloto;
    }

    @Override
    public String toString() {
        return "CocheProfesor{" + "motor=" + motor + 
                "\n ruedaDI=" + ruedaDI + 
                "\n ruedaDD=" + ruedaDD + 
                "\n ruedaTI=" + ruedaTI + 
                "\n ruedaTD=" + ruedaTD + 
                "\n puertaPiloto=" + puertaPiloto + 
                "\n puertaCopiloto=" + puertaCopiloto + '}';
    }

}
