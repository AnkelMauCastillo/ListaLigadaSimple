package mx.edu.uacm.listaligadasimple;



public class GrupoPlanteles {

    private int totalPlanteles;
    private ListaSimpleV1<Plantel> listaplanteles = new ListaSimpleV1<>();



    public GrupoPlanteles() {
    }
    public void guardarPlantel(String nombre, int numeroCarreras, int numeroPosgrados, String direccion){
        Plantel miPlantel = new Plantel(nombre, numeroCarreras, numeroPosgrados, direccion);
        listaplanteles.insertar(miPlantel);
    }

    public void actualizarPlantel (String nombre, int numeroCarrras, int numeroPosgrados, String direccion){

    }

    public void eliminarPlantel (String nombre){

    }
    public String plantelMenosAlumnos(){
        return null;
    }

    public boolean buscarPlantel(String nombre){
        return false;
    }

    public int contarPlanteles(){
        totalPlanteles = listaplanteles.cantidad;
        return  this.totalPlanteles;
    }

    public void imprimirGrupos(){
      listaplanteles.imprimeListaSimpleV1();
        System.out.println(contarPlanteles());
    }
}
