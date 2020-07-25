package com.epam.NewYearGifts;

public abstract class Chocolates implements Comparable<Chocolates>{
	protected int id = -1;
	private String name = null;
	private int cost = -1;
	private int weight = -1;
	
	public Chocolates(int ID,String N, int ct, int wt){
		this.id = ID;
		this.name = N;
		this.cost = ct;
		this.weight = wt;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}


	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int compareTo(Chocolates chc){
		return this.id - chc.id; 
	}
	public String toString() {
        return "Chocolate : " + id + " - " + name + " - " + cost + " - " + weight + "\n";
    }
}