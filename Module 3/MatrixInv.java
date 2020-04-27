/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chandrikadeb
 */
import java.util.Scanner;
public class MatrixInv 
{
	public static void main(String args[]) 
        {
		int i, j;
		float det = 0;
		float mat[][] = new float[3][3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements of matrix row wise:");
		for(i = 0; i < 3; ++i)
			for(j = 0; j < 3; ++j)
				mat[i][j] = sc.nextInt();
		
                for(i = 0; i < 3; i++)
	        det = det + (mat[0][i] * (mat[1][(i+1)%3] * mat[2][(i+2)%3] - mat[1][(i+2)%3] * mat[2][(i+1)%3]));
		
		System.out.println("\nDeterminant = " + det);
				
		System.out.println("\nInverse of matrix is:");
		for(i = 0; i < 3; ++i) 
                {
			for(j = 0; j < 3; ++j)
				System.out.print((((mat[(j+1)%3][(i+1)%3] * mat[(j+2)%3][(i+2)%3]) - (mat[(j+1)%3][(i+2)%3] * mat[(j+2)%3][(i+1)%3]))/ det) + " ");
			
			System.out.print("\n");
		}
	}
}

