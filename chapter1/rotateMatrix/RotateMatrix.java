/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rotatematrix;

/**
 *
 * @author yunzhou
 */
public class RotateMatrix {

    /**
     * @param args the command line arguments
     */
    public static int[][] rotate(int[][] original,int size){
        int n = size-1;    //the comment version is clock-oriented rotate
        //currently version is reverse-clock version
        int[] temp = new int[size];
        for(int i = 0; i < size/2; i++){
            for(int j = i; j < n-i;j++){
                //temp[j] = original[i][j];
                temp[j] = original[j][i];
            }
            //under-moves-left
            for(int k = i+1; k < size-i; k++){
                //original[i][n-k] = original[k][i];
                 original[n-k][i] = original[i][k];
            }
            //right-moves-under
            for(int h = i+1;h<size-i;h++){
                //original[h][i] = original[n-i][h];
                original[i][h] = original[h][n-i];
            }
            //top-moves-right
            for(int w=i; w < n-i; w++){
                //original[n-i][n-w] = original[w][n-i];
                original[n-w][n-i] = original[n-i][w];
            }
            //temp-moves-top
            for(int p=i; p<n-i;p++){
                //original[p][n-i]=temp[p];
                original[n-i][p]=temp[p];
            }
        }
        return original;
    }
    
    public String toString(int[][] matrix, int size){
        String result = "";
        for(int i = 0; i<size; i++){
            for(int j = 0; j < size; j++){
                result = result + matrix[j][size-i-1] + " ";
            }
            result = result + "\n";
        }
        return result;
    }
    
    public String toStringUpdate(int[][] matrix, int size){
        String result = "";
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                result = result + matrix[j][i] + " ";
            }
            result = result + "\n";
        }
        return result;
    }
    
    
    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{{1,2,3,4},{5,6,7,8},{2,4,6,8},{1,3,6,9}};
      
        RotateMatrix r = new RotateMatrix();
        System.out.println(r.toString(matrix1, 4));
        System.out.println(r.toString(rotate(matrix1,4), 4));
        
         System.out.println(r.toStringUpdate(matrix1, 4));
        System.out.println(r.toStringUpdate(rotate(matrix1,4), 4));
        // TODO code application logic here
    }
}
