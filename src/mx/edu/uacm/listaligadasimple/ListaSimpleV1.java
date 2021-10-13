package mx.edu.uacm.listaligadasimple;

public class ListaSimpleV1<P> {

    Nodo cabecera;
    int cantidad;

    ListaSimpleV1 (){

        cabecera = new Nodo (null);
        cantidad = 0;
    }

    public void eliminar (){

        if (cabecera.siguiente == null)
        {

            System.out.print ("Lista esta vacia");
        }
        else
        {

            cabecera.siguiente = cabecera.siguiente.siguiente;
        }
    }

    public void remover (Object elemento){

        Nodo p = new Nodo ();
        Nodo q = new Nodo ();

        p = cabecera.siguiente;
        q = cabecera.siguiente;

        while (p != null){

            if (elemento.equals (p.info)) {

                if (p == cabecera.siguiente) {

                    eliminar ();
                    p = q = cabecera.siguiente;
                }
                else {

                    q.siguiente = p.siguiente;
                    p = p.siguiente;
                }

                cantidad--;
            }
            else {

                q = p;
                p = p.siguiente;
            }
        }
    }

    public boolean buscar (Object elemento){

        Nodo p = new Nodo ();
        p = cabecera.siguiente;

        while (p != null && !p.info.equals (elemento)){

            p = p.siguiente;

            if (p == null){

                return false;
            }
        }
        return true;
    }

    public void insertar (Object elemento){

        Nodo n = new Nodo (elemento);
        if (cabecera.siguiente == null){

            cabecera.siguiente = n;
        }
        else{

            n.siguiente = cabecera.siguiente;
            cabecera.siguiente = n;
        }

        cantidad++;
    }

    public int Nodos (){

        return cantidad + 1;
    }


    //13/09/2021
    public void imprimeListaSimpleV1(){

        Nodo p = new Nodo ();
        p = cabecera.siguiente;

        while (p != null){

            System.out.print(p.getInfo().toString() +" \n");


            p = p.siguiente;
        }
    }




}


