package Assignment_1;

/*By : 15103080
 * This program sort list of string taken from user in ascending order
 */

import java.util.Scanner;

public class StringSorting
{
	private String temp;
	private String str[];
	private int n;
	
	public StringSorting(int n){			//Creating list of String
		 str = new String[n];
		 this.n = n;
	}
	
	public void getString(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter all the String:");
        for(int i = 0; i < n; i++)
        {
            str[i] = in.nextLine();
        }
	}
	
	public void sortString(){
		 for (int i = 0; i < n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (str[i].compareTo(str[j])>0) 
	                {
	                    temp = str[i];
	                    str[i] = str[j];
	                    str[j] = temp;
	                }
	            }
	        }
	}
	
	public void printSortedString(){
		 System.out.println("String in Sorted Order:");
	        for (int i = 0; i < n; i++) 
	        {
	            System.out.println(str[i]);
	        }
	        
	    }
	
	
    public static void main(String[] args) 
    {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of String you want to input:");
        int n = in.nextInt();
        StringSorting sort = new StringSorting(n);       
        
        sort.getString();
        sort.sortString();
        sort.printSortedString();
    }
       
}