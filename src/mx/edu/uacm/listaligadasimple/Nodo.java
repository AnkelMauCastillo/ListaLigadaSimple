package mx.edu.uacm.listaligadasimple;

public class Nodo{

    Object info;
    Nodo siguiente;

    public Nodo (Object dato){

        info = dato;
        siguiente = null;
    }

    //Constructor por defecto
    public Nodo ( ){

    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return this.info.toString();
    }
}
