/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizrecursiva;

/**
 *
 * @author User
 */

import java.util.Random;

public class MatrizRecursiva {

    /**
     * @param args the command line arguments
     */

    private static Random random = new Random();
    private static final String numeros = "0123456789101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172737475767778798081828384858687888990919293949596979899100";
    private static int numerico = numeros.length() - 1;
    
    
    public static void main(String[] args) {
        int[][] matriz = new int[3][5];

        for (int i = 0; i < matriz.length; i++) {
            rellenar(matriz, i, 0);
        }

        //Salida
        for (int i = 0; i < matriz.length; i++) {
            StringBuilder fila = new StringBuilder();
            fila.append("Fila " + i + ": ");
            for (int j = 0; j < 5; j++) {
                fila.append(matriz[i][j]);
                fila.append(",");
            }
            System.out.println(fila);
        }
        
}
    
    public static void rellenar(int[][] matriz, int i, int j) {
        matriz[i][j] = numeros.charAt(random.nextInt(numerico));
        if (j < matriz[i].length - 1) {
            rellenar(matriz, i, j + 1);
        }
    }
 }

