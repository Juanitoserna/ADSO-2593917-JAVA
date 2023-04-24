
public class Principal{
    public static void main (String[]args){

        
        Persona arreglo_cliente[] = new Persona [100];
        Persona arreglo_vendedor[] = new Persona [100];

        arreglo_cliente[0] = new Persona("1059784369", "Juan Esteban", "clle 20");
        
        arreglo_vendedor[0] = new Persona("1059784368", "Vendedor 1", " ");

        Factura constructor = new Factura(arreglo_cliente, arreglo_vendedor);
    }
}