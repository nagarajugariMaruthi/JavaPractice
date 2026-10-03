package collocation;

import java.util.ArrayList;
import java.util.List;

public class AccessUsingindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> Products = new ArrayList<>();
		
		Products.add("Laptop");
		Products.add("Mobile");
		Products.add("pouch");
		Products.add("Head Phones");
		Products.add("Keywords");
		
		
		System.out.println("First Products : " + Products.get(0));
        System.out.println("Second Prodcuts : " + Products.get(1));
        System.out.println("third Prodcuts : " + Products.get(3));
	}

}
