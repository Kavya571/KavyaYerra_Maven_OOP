package com.epam.NewYearGifts;

import java.util.ArrayList;

public class TotalCost {
	public static int cal_total_cost(ArrayList <Chocolates> chocolates){
		int cost = 0;
		for(Chocolates chc: chocolates){
			cost = cost + chc.getCost();
		}
		return cost;
		}
	public static int calTotalWeight(ArrayList <Chocolates> chocolates){
		int weight = 0;
		for(Chocolates chc: chocolates){
			weight = weight + chc.getWeight();
		}
		return weight;
		}
	
}
	