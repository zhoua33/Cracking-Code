/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package setzero;

/**
 *
 * @author yunzhou
 */
public class SetZero {

    /**
     * @param args the command line arguments
     */
    public int[][] setzerowithZero(int[][] matrix,int m, int n){
        boolean[] rows = new boolean[m];
        boolean[] column = new boolean[n];
        for(int i=0; i<m;i++){
            rows[i]=false;
        }
        for(int j=0; j<n;j++){
            column[j]=false;
        }
        
        for(int i =0; i< m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j]==0){
                    column[j] = true;
                    rows[i] = true;
                }
            }
        }
        
        for(int i=0; i<m;i++){
            if(rows[i]){
                for(int j=0;j<n;j++){
                    matrix[i][j]=0;
                }
            }
        }
        
        for(int j=0; j<n;j++){
            if(column[j]){
                for(int i =0; i<m;i++){
                    matrix[i][j]=0;
                }
            }
        }
        return matrix;
    }
    
     public String toStringUpdate(int[][] matrix, int m, int n){
        String result = "";
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result = result + matrix[i][j] + " ";
            }
            result = result + "\n";
        }
        return result;
    }
    
    
    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{{2,3,4,5},{0,5,6,7},{3,6,0,9},{3,2,9,8},{2,4,6,8}};
        
        SetZero try1 = new SetZero();
        
        // TODO code application logic here
        System.out.println(try1.toStringUpdate(matrix1,5,4));
        int[][] matrix = try1.setzerowithZero(matrix1, 5, 4);
        System.out.println(try1.toStringUpdate(matrix,5,4));
        
        
        int[][] matrix2 = new int[][]{{2,3,4,5},{0,5,6,7},{3,6,0,9},{3,0,9,8},{2,4,0,8}};
        
         System.out.println(try1.toStringUpdate(matrix2,5,4));
        int[][] matrix3 = try1.setzerowithZero(matrix2, 5, 4);
        System.out.println(try1.toStringUpdate(matrix3,5,4));
    }
}
