// File: RecursiveMultipler.java
// Written by: Jennifer King
// Date: 11/05/2018

import javax.swing.JOptionPane;

public class RecursiveMultipler 
{
	public static int multiply(int x, int y)
	{
		if(x == 0 || y == 0)
		{
			return 0;
		}
		else if (x < 0)
		{
			System.out.println("x: " + x);
			return y + multiply(x+1, y);
		}
		else
		{
			System.out.println("x: " + x);
			return y + multiply(x-1, y);
		}
	}
	
	public static void main(String[] args)
	{
		String num1, num2;
		int x, y, z;
		
		num1 = JOptionPane.showInputDialog("Enter a number:");
		x = Integer.parseInt(num1);
		num2 = JOptionPane.showInputDialog("Okay, enter another number:");
		y = Integer.parseInt(num2);
		
		z = multiply(x, y);
		
		JOptionPane.showMessageDialog(null, x + " times " + y + " equals " + z, "Message", JOptionPane.PLAIN_MESSAGE);
	}
}
