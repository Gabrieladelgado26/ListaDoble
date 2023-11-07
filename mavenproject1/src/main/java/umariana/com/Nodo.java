package umariana.com;

public class Nodo {   

    // Atributos
    public int dato;
    public Nodo siguiente;
    public Nodo anterior;
    
    // Constructor para cuando no haya nodos
    
    public Nodo (int pDato)
    {
        this(pDato,null,null);
    }
    
    // Constructor cuando ya existen nodos
    public Nodo (int pDato, Nodo pSiguiente, Nodo pAnterior)
    {
        dato = pDato;
        siguiente = pSiguiente;
        anterior = pAnterior;
    }
}
