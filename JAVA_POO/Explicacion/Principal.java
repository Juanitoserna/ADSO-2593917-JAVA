public class Principal{
    public static void main(String[]args){
        
        //Intancia de la clase Persona
        // Persona juanito = new Persona();
        // Persona alberth = new Persona(108800,"Jhon Alberht","Aricapa Pinto","Masculino",17,50,160);
        // Persona esteban = new Persona(108801,"Esteban","Castano Serna");

        // esteban.imprimirCartaPresentacion();

        // alberth.comer(2000)
        Persona lista[] = new Persona [10];
        lista[0] = new Persona();
        lista[1] = new Persona(108800,"Jhon Alberht","Aricapa Pinto","Masculino",17,50,160);
        lista[2] = new Persona(108801,"Esteban","Castano Serna");

        lista[0].imprimirCartaPresentacion();
        lista[1].imprimirCartaPresentacion();
        lista[2].imprimirCartaPresentacion();

    }
}