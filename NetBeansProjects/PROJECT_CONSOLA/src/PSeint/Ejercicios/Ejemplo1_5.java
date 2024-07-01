package PSeint.Ejercicios;

public class Ejemplo1_5 {
    //Variables de instancia (Atributos)
    private int num;
    
    //Constructores
    public Ejemplo1_5() {
        this.num = 0;
    }

    public Ejemplo1_5(int num) {
        this.num = num;
    }
    
    //Metodos set y get
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    //Metodo ToString
    @Override
    public String toString() {
        return "Ejemplo1_5{" + "num=" + num + '}';
    }
    
    //Metodos Otros
    public int cuadrado(){
        return (int)Math.pow(num,2);
        }
    
    public int cubo(){
        return (int)Math.pow(num,3);
        }
    
}
