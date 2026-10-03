package collocation;

import java.util.TreeSet;

public class TressFindtheSecondHightsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> Numbers = new TreeSet<>();
		
		Numbers.add(50);
		Numbers.add(20);
		Numbers.add(80);
		Numbers.add(30);
		Numbers.add(80);
		Numbers.add(10);
		Numbers.add(60);
		
		System.out.println("Sortaed Numbers : " + Numbers);
		
		Integer Hight = Numbers.last();
		
		Integer SecondHight = Numbers.lower(Hight);
		
		System.out.println("first Hight Tree Number : " + Hight);
		System.out.println("SecongHight Tree  Numbers : " + SecondHight);
	}
}

