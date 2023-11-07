package umariana.com;

public class ListaDoble {

    // Atributos
    private Nodo primero, ultimo;

    /**
     * Constructor inicializa la cabezera y la cola
     */
    public ListaDoble() {
        primero = null;
        ultimo = null;
    }

    /**
     * Método para saber si la lista esta vacia
     *
     * @return Retorna primero igualandolo a null
     */
    public boolean listaVacia() {
        return primero == null;
    }

    /**
     * Método que permite agregar un nodo al inicio de la lista
     *
     * @param pDato Dato que se va a agregar
     */
    public void agregarNodoInicio(int pDato) {
        // Preguntar si la lista no esta vacia
        if (!listaVacia()) {
            primero = new Nodo(pDato, primero, null);
            primero.siguiente.anterior = primero;
        } else {
            primero = ultimo = new Nodo(pDato);
        }
    }

    /**
     * Método que permite agregar un nodo al final de la lista
     *
     * @param pDato Dato que se va a agregar
     */
    public void agregarNodoFinal(int pDato) {
        // Preguntar si la lista no está vacía
        if (!listaVacia()) {
            ultimo = new Nodo(pDato, null, ultimo);
            ultimo.anterior.siguiente = ultimo;
        } else {
            primero = ultimo = new Nodo(pDato);
        }
    }

    /**
     * Método que permite mostrar la lista de inicio a fin
     *
     * @return Retorna la lista construida
     */
    public String mostrarListaIF() {
        String datos = "<=>";
        if (!listaVacia()) {
            Nodo actual = primero;
            while (actual != null) {
                datos = datos + actual.dato + "<=>";
                actual = actual.siguiente;
            }
        }
        return datos;
    }
    
    public String mostrarListaFI() {
        String datos = "<=>";
        if (!listaVacia()) {
            Nodo actual = ultimo;
            while (actual != null) {
                datos = datos + actual.dato + "<=>";
                actual = actual.anterior;
            }
        }
        return datos;
    }
    
    public void eliminarNodoInicio(){
        String datos = "<=>";
        if (!listaVacia()) {
            Nodo actual = primero;
            if (actual != null) 
            {
                primero = primero.siguiente;
                primero.anterior = null;
            }
        }
    }
    
    public void eliminarNodoFinal(){
        String datos = "<=>";
        if (!listaVacia()) {
            Nodo actual = ultimo;
            if (actual != null) 
            {
                ultimo = ultimo.anterior;
                ultimo.siguiente = null;
            }
        }
    }
}
