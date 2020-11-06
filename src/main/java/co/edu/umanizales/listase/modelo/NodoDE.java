/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.umanizales.listase.modelo;

/**
 *
 * @author carloaiza
 */
public class NodoDE {
    private Perro dato;
    private NodoDE siguiente;
    private NodoDE anterior;

    public NodoDE(Perro dato) {
        this.dato = dato;
    }

    public Perro getDato() {
        return dato;
    }

    public void setDato(Perro dato) {
        this.dato = dato;
    }

    public NodoDE getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDE siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDE getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDE anterior) {
        this.anterior = anterior;
    }

    
    
    
    
    
    
}
