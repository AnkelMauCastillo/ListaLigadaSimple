package mx.edu.uacm.listaligadasimple;


public class Plantel {

    private String nombre;
    private int noCarreras;
    private int noPosgrados;
    private String direccion;

    Plantel(){}

    public Plantel(String nombre, int noCarreras, int noPosgrados, String direccion) {
        this.nombre = nombre;
        this.noCarreras = noCarreras;
        this.noPosgrados = noPosgrados;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNoCarreras() {
        return noCarreras;
    }

    public int getNoPosgrados() {
        return noPosgrados;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Plantel{" +
                "nombre='" + nombre + '\'' +
                ", noCarreras=" + noCarreras +
                ", noPosgrados=" + noPosgrados +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
