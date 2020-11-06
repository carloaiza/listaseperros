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
public class ListaDE {
    private NodoDE cabeza;
    //Otros metodos

    public ListaDE() {
    }
    /**
     *   	
	pase al otro mientras este ammarrado a otro
	amarra el perro nuevo	
	Ayudante.siguiente.anterior=ayudante	

     * @param dato 
     */
    public void adicionarNodo(Perro dato)
    {
        if(cabeza!=null)
        {
            NodoDE temp = cabeza;
            while(temp.getSiguiente()!=null)
            {
                temp= temp.getSiguiente();
            }
            //Parado en el último
            temp.setSiguiente(new NodoDE(dato));
            temp.getSiguiente().setAnterior(temp);
        }
        else
        {
            cabeza = new NodoDE(dato);
        }
    }    
    
    public void adicionarAlInicio(Perro dato)
    {
        if(cabeza !=null)
        {
            //Si ya hay datos
            NodoDE temp = new NodoDE(dato);
            temp.setSiguiente(cabeza);
            cabeza.setAnterior(temp);
            cabeza = temp;
        }
        else
        {
            cabeza = new NodoDE(dato);
        }
    }
    
}
