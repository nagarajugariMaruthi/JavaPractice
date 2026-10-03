package collocation;

public class Products {

	public class Product implements Comparable<Product> {

	    int id;
	    String name;
	    double price;
	    double rating;

	    Product(int id, String name, double price, double rating) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	        this.rating = rating;
	    }

	    // Comparable: sort by price ascending
	    @Override
	    public int compareTo(Product p) {
	        return Double.compare(this.price, p.price);
	    }

	    void display() {
	        System.out.println(id + " " + name + " " + price + " " + rating);
	    }
	}
}