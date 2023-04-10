public class Persona{

    //Atributo

    int cedula;
    String nombre;
    String apellido;
    String genero;
    int edad;
    int peso;
    int altura;

    //metodos

    public Persona(){
        this.cedula = 0;
        this.nombre = "";
        this.apellido = "";
        this.genero = "";
        this.edad = 0;
        this.peso = 0;
        this.altura = 0;
    }                                       //parametros
    public Persona(int cedula,String nombre,String apellido){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = "";
        this.edad = 0;
        this.peso = 0;
        this.altura = 0;
    }
    public Persona(int cedula,String nombre,String apellido,String genero,int edad,int peso,int altura){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
    //para mandar esta variable afuera o para cuando me pidan el peso
    public int getPeso(){
        return this.peso;
    }
    //este sirve para modificar la variable 
    public void serPeso(int new_peso){
        this.peso = new_peso;
    }

    public void comer(int gramos){
        this.peso += (int)(gramos * 0.1);
    }

    public void imprimirCartaPresentacion(){
        System.out.println("--------------------------------------");
        System.out.println("--         DATOS PERSONA            --");
        System.out.println("--------------------------------------");
        System.out.println("|  cedula: " + this.cedula);
        System.out.println("|  nombre: " + this.nombre);
        System.out.println("|  apellido: " + this.apellido);
        System.out.println("|  genero: " + this.genero);
        System.out.println("|  edad: " + this.edad);
        System.out.println("|  peso: " + this.peso);
        System.out.println("|  altura: " + this.altura);
        System.out.println("--------------------------------------");
    }
}