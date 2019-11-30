package main;

public class Object {

	private String name;
	private int Health;
	private double Gold;
	
	public Object() {
		
		this.name = "Default";
		this.Health = -1;
		this.Gold = -10.01;
		
	}
	
	public Object(String name, int Health, double Gold) {
		
		this.name = name;
		this.Health = Health;
		this.Gold = Gold;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return Health;
	}

	public void setHealth(int health) {
		Health = health;
	}

	public double getGold() {
		return Gold;
	}

	public void setGold(double gold) {
		Gold = gold;
	}
	
	
	
}
