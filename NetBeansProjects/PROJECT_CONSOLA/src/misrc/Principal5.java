package misrc;

/*
import java.util.Random;
 */
import java.util.Scanner;

public class Principal5 {

    public static void main(String[] args) {
        /*
        Traducir el dia de la semana de numero a letra
        1 Lunes
        2 Martes
         */

 /*
       String dialetra = "";
       int dia = (int)(Math.random() * 9 + 1); //[1,2,3,4,5,6,7,8,9]
       switch(dia) {
           case 1: dialetra = "Lunes";break;
           case 2: dialetra = "Martes";break;
           case 3: dialetra = "Miercoles";break;
           case 4: dialetra = "Jueves";break;
           case 5: dialetra = "Viernes";break;
           case 6: dialetra = "Sabado";break;
           case 7: dialetra = "Domingo";break;
           default: System.out.print("Dia no valido ");
       }
       System.out.println(dia + " " + dialetra);
         */
 /*
        int dado = (int)(Math.random() * 6 + 1); 
        System.out.println("Dado: " + dado);
        if(dado %2 == 0) {
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
         */
 /*
        int numero = 0; //0, 5, -5
        System.out.println("Numero: " + numero);
        if(numero == 0) {
            System.out.println("Cero");
        }else if(numero > 0) {
            System.out.println("Positivo");
        }else {
            System.out.println("Negativo");
        }
    }
         */
 /*Random random = new Random();
        int numero = 100;
        int randomNumber = random.nextInt(2 * numero +1) - numero;
        System.out.println("Numero: " + randomNumber);
        if(randomNumber == 0) {
            System.out.println("Cero");
        }else if(randomNumber > 0) {
            System.out.println("Positivo");
        }else {
            System.out.println("Negativo");
        }
         */
        
 
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese año: ");
        
        int diasmes = 0;
        double anio = sc.nextDouble();
        int mes = (int) (Math.random() * 12 + 1); //[1,2,3,4,5,6,7,8,9,10,11,12]
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                diasmes = 31;
                break;
            case 4, 6, 9, 11:
                diasmes = 30;
                break;
            case 2:
                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                    diasmes = 29;
                } else {
                    diasmes = 28;
                }
        }
        System.out.println(anio + mes + ": " + diasmes);
*/
        int anio = (int) (Math.random() * 2 + 2000); //[2000-2024]
        int diasmes = 0;
        int mes = (int) (Math.random() * 12 + 1); //[1,2,3,4,5,6,7,8,9,10,11,12]
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                diasmes = 31;
                break;
            case 4, 6, 9, 11:
                diasmes = 30;
                break;
            case 2:
                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                    diasmes = 29;
                } else {
                    diasmes = 28;
                }
        }
        System.out.println(anio + mes + ": " + diasmes);
        
    }
}
/*
if (año % 4 == 0 and año % 100 != 0) or (año %400 == 0):
    return True 29
else: 
    return False 28
*/
