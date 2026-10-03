package collocation;

class Product implements Comparable<Product> {

    int id;
    String name;
    double Price;
    double rating;

    Product(int id, String name, double Price, double rating) {

        this.id = id;
        this.name = name;
        this.Price = Price;
        this.rating = rating;
    }

    @Override
    public int compareTo(Product p) {
        return Double.compare(this.Price, p.Price);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + Price + " " + rating;
    }
}