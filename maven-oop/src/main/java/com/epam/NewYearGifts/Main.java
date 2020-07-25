package com.epam.NewYearGifts;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Chocolates> al = new ArrayList<Chocolates>();
		   al.add(new Gifts(1, "Snickers", 300, 15));
		   al.add(new Gifts(2, "Cadbury", 50, 10));
		   al.add(new Gifts(3, "Twix", 100, 20));
		   System.out.println("1.Calculate total Cost of all gifts");
		   System.out.println("2.Calculate the total weight of all chocolates  "); 
		   System.out.println("3. Sorting the gifts by chocolate Id's");

		   int choice = sc.nextInt();
		   
		   switch(choice){
		   case 1:
			   System.out.println(TotalCost.cal_total_cost(al));
			   break;
		   case 2:
			   System.out.println(TotalCost.calTotalWeight(al));
			   break;
		   case 3:
			   System.out.println(Sorting.sortById(al));
			   break;
		   default:
			   System.out.println("Invalid Input");
			   }
	}
}  
		   
		   

