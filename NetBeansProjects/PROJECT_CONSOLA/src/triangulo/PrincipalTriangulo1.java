package triangulo;

public class PrincipalTriangulo1 {
    //[1, 10000] Math.random()
    
    public static void main(String[] args) {
        Triangulo.cabecera();
        
        for(int i=0; i<1000; i++){
            Triangulo t = new Triangulo((int)(Math.random() * 10000 + 1),
                                        (int)(Math.random() * 10000 + 1));
            t.cuerpo(i + 1);
            
            /*
            int base = (int)(Math.random() * 10000 + 1);
            int altura = (int)(Math.random() * 10000 + 1);
            Triangulo t = new Triangulo(base,altura);
            */
            
        }
    }
    
}


/*
N   Base    Altura  Area
-   ----    ------  ----
1   56        83    56*83
*/