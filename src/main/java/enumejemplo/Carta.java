/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumejemplo;

import jcarlos.poo.Persona;

/**
 *
 * @author profesor
 */
public class Carta {
    
    private Persona emisor;
    private Persona receptor;
    private TipoPapel tipoPapel;
    private String asunto;
    private String cuerpo;

    public Carta(Persona emisor, Persona receptor, TipoPapel tipoPapel, String asunto, String cuerpo) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.tipoPapel = tipoPapel;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Persona getEmisor() {
        return emisor;
    }

    public void setEmisor(Persona emisor) {
        this.emisor = emisor;
    }

    public Persona getReceptor() {
        return receptor;
    }

    public void setReceptor(Persona receptor) {
        this.receptor = receptor;
    }

    public TipoPapel getTipoPapel() {
        return tipoPapel;
    }

    public void setTipoPapel(TipoPapel tipoPapel) {
        this.tipoPapel = tipoPapel;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    @Override
    public String toString() {
        return "Carta{" + "emisor=" + emisor + ", receptor=" + receptor + ", tipoPapel=" + tipoPapel + ", asunto=" + asunto + ", cuerpo=" + cuerpo + '}';
    }
    
    
    
}
