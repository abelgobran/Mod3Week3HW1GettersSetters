package Mod3Week3HW1GettersSetters;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer ht = new Computer();
		Computer zell = new Computer();
		
		
		ht.setName("HT");
		ht.setYear(2015);
		ht.setCost(800.73);
		
		zell.setName("Zell");
		zell.setYear(2020);
		zell.setCost(1750.00);
		
		System.out.println("ht.getName");
		System.out.println("ht.getYear");
		System.out.println("ht.getCost");
		
		System.out.println();
		
		System.out.println("zell.getName");
		System.out.println("zell.getYear");
		System.out.println("zell.getCost");
		
	}

}
