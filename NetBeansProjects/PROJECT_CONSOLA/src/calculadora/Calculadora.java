package calculadora;

public class Calculadora {
    
    //1.Atributos instancia
    private double numero1;
    private double numero2;
    private String  operador;
    
    //2.Constructores
    public Calculadora() {
        this.numero1 = 0.0;
        this.numero2 = 0.0;
        this.operador = "";
    }

    public Calculadora(double numero1, double numero2, String operador) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operador = operador;
    }
    
    //3.Get and Set
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    
        //4.Tostring
    @Override
    public String toString() {
        return "Calculadora{" + "numero1=" + numero1 + ", numero2=" + numero2 + ", operador=" + operador + '}';
    }
    
    //5.Calculos y metodos
    public double calculo(){
        double resultado = 0.0;
        switch(operador){
            case "+": resultado = numero1+numero2;break;
            case "-": resultado = numero1-numero2;break;
            case "*": resultado = numero1*numero2;break;
            case "/": resultado = numero1/numero2;break;
            case "#": resultado = Math.pow(numero1, numero2);break;
        }
    return resultado;
    }
    
    public static void cabecera(){
            System.out.printf("%4s %10s %9s %9s %10s\n", "N","Operador","Numero 1","NUmero 2","Resultado");
            System.out.printf("%4s %10s %9s %9s %10s\n", "-","--------","--------","--------","---------");
    }
    
    public void cuerpo(int i){
        System.out.printf("%4d %10s %9.2f %9.2f %10.2f\n",i,operador,numero1,numero2,calculo());
    }
    
}
