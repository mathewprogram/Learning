
package miclase;


public class Principal {

    
    public static void main(String[] args) {
        String nombre = "Mihai";
        int edad = 33;
        double estatura = 1.78;
        char sexo = 'H';
        boolean casado = true;
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Sexo: " + sexo);
        System.out.println("Casado: " + casado);
        
        Persona miguel = new Persona("Miguel", 45,1.71,'H',false);
        
        System.out.println("Nombre: " + miguel.nombre);
        System.out.println("Edad: " + miguel.edad);
        System.out.println("Estatura: " + miguel.estatura);
        System.out.println("Sexo: " + miguel.sexo);
        System.out.println("Casado: " + miguel.casado);
        
        Persona maria = new Persona("Maria", 31, 1.73, 'M', true);
        maria.mitoString();
        System.out.println(maria);
        Persona x = maria;
        
        maria.cabecera();
        maria.cuerpo();
        miguel.cuerpo();
    }
    
}
