
package recursividad;

public class P1 {

//Returnos the sum of the first n integers of the given array

    public static void main(String[] args) {
        // Arreglos
        int[] numeros = {76, 88, 2, 3, 4, 5};
        int[] numeros2 = {10, 20, 30, 40};
        int[] numeros3 = {1, 1, 1, 1, 1, 1, 1};
        
        // Elementos a sumar
        int n1 = 6;
        int n2 = 4;
        int n3 = 5;
        
        // Llamar al método
        System.out.println("Suma arreglo1: " + linearSum(numeros, n1));
        System.out.println("Suma arreglo2: " + linearSum(numeros2, n2));
        System.out.println("Suma arreglo3: " + linearSum(numeros3, n3));
    }
    
    public static int linearSum(int[] data, int n) {
        if (n==0)
            return 0;
        else
            return linearSum(data, n-1) + data[n-1];
    }
}
    

