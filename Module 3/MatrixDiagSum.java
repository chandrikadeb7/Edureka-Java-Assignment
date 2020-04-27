/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chandrikadeb
 */
public class MatrixDiagSum 
{
    public static void main(String[] args)
    {
        
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==j)
                {
                    sum+=mat[i][j];
                }
            }
        }
        System.out.println("Original Matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of diagonal elements is: " +sum);
    } 
    
}
