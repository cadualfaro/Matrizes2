/*
Atividade 2: Tirar a média de 3 matrizes de mesmo tamanho
 */
package matrizes2;
import java.util.Arrays;
import java.util.Random;
public class Matrizes2 {

    public static void main(String[] args) {
        Random rand = new Random();
            int matrizA [][] = new int[5][5];
            int matrizB [][] = new int[5][5];
            int matrizC [][] = new int[5][5];
            int media [][] = new int [5][5];
            
        
            for(int i=0;i<matrizA.length;i++)
                for(int j=0;j<matrizA.length;j++)
                    matrizA [i][j] = rand.nextInt(20);
                
            
            for(int i=0;i<matrizB.length;i++)
                for(int j=0;j<matrizB.length;j++)
                    matrizB [i][j] = rand.nextInt(20);

            for(int i=0;i<matrizC.length;i++)
                for(int j=0;j<matrizC.length;j++)
                    matrizC [i][j] = rand.nextInt(20);
            
            for(int i=0;i<media.length;i++)
                for (int j=0;j<media.length;j++)
                media [i][j] = (matrizA [i][j] + matrizB [i][j] + matrizC [i][j])/3;
            
            for(int i=0;i<media.length;i++)
                System.out.println(Arrays.toString(media[i]));
}
}