/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chandrikadeb
 */
class Area 
{
    void area(float x)
    {
        System.out.println("The area of the square is "+x*x+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("The area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("The area of the circle is "+z+" sq units");
    }
}
public class ShapesArea 
{
     public static void main(String args[]) 
	{
	   Area ob = new Area();
	   ob.area(5);
	   ob.area(11,12);
	   ob.area(2.5);
        }
}
