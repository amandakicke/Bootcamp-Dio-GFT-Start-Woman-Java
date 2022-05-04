
package retornos;

public class Retornos {

    public static void main(String[] args) {
        
        //Retornos
        System.out.println("Exercício retornos");
        
        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do Quadrado: " + areaQuadrado);
        
        double areaRetangulo = Quadrilatero.area(5, 6);
        System.out.println("Ára do Retângulo: " + areaRetangulo);
        
        double areaTrapezio = Quadrilatero.area(6, 4, 2);
        System.out.println("Área do Trapézio: " + areaTrapezio);
    }
    
}
