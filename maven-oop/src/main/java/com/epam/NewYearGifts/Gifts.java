package com.epam.NewYearGifts;
import java.util.ArrayList;

public class Gifts extends Chocolates {

	public Gifts(int ID, String N, int ct, int wt) {
		super(ID, N, ct, wt);
		// TODO Auto-generated constructor stub
	}

	static int calWeight(ArrayList<Chocolates> wt){
		int totalSum = 0;
		for(int i = 0; i < wt.size(); i++){
			totalSum = totalSum + wt.get(i).getWeight();
		}
		return totalSum;
	}

	public int compareTo(Chocolates o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

