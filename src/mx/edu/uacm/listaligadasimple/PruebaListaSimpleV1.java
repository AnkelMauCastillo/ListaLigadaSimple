package mx.edu.uacm.listaligadasimple;

import java.security.Principal;

public class PruebaListaSimpleV1{

    public static void main(String[] args){

        PruebaListaSimpleV1 prueba = new PruebaListaSimpleV1();
        prueba.inicia();
    }


    public void inicia(){

        ListaSimpleV1<String> miLista = new ListaSimpleV1<String>();

        //Elementos en lista:
        miLista.insertar("perro");
        miLista.insertar("gato");
        miLista.insertar("perico");
        miLista.insertar("pez dorado");
        miLista.insertar("canario");

        miLista.imprimeListaSimpleV1();
        System.out.println();
        System.out.println("Cantidad de elementos: "+miLista.Nodos());

        //Elemento removido en lista:
        miLista.remover("pez dorado");

        System.out.println("\n");

        miLista.imprimeListaSimpleV1();

        //Elemento removido en lista:
        miLista.insertar ("hamster");

        System.out.println("\n");

        miLista.imprimeListaSimpleV1();

        System.out.println("Planteles");
        ListaSimpleV1<Plantel> planteles = new ListaSimpleV1<>();
        Plantel plantel1 = new Plantel("SlT",10,5,"Av. San Isidro. Iztapalapa");
        Plantel plantel2 = new Plantel("CUAUTEPEC", 8, 6, "Colonia la Corona");
        Plantel plantel3 = new Plantel("CENTRO HISTORICO", 5, 3, "FRAY SERVANDO TERESA DE MIER, CENTRO HISTORICO");
        Plantel plantel4 = new Plantel("DEL VALLE", 4, 6,"SAN LORENZO, COL. DEL VALLE");
        Plantel plantel5 = new Plantel("CASA LIBERTAD", 6, 3,"ERMITA IZTAPALAPA, ZARAGOZA");
        planteles.insertar(plantel1);
        planteles.insertar(plantel2);
        planteles.insertar(plantel3);
        planteles.insertar(plantel4);
        planteles.insertar(plantel5);
        planteles.imprimeListaSimpleV1();

        System.out.println();
        System.out.println("Cantidad de Planteles: " + planteles.cantidad);


    }
}