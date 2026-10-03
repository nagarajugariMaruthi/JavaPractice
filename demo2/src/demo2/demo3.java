package demo2;

public class demo3 {

}
class Biryani {

    void prepareIngredients() {
        System.out.println("Preparing ingredients...");
        String[] items = {"Rice", "Chicken", "Spices", "Onion", "Tomato", "Oil"};
        
        for (String item : items) {
            System.out.println(item + " is ready");
        }
    }

    void marinateChicken() {
        System.out.println("\nMarinating chicken with spices...");
        System.out.println("Chicken marinated for 30 minutes");
    }

    void cookRice() {
        System.out.println("\nCooking rice...");
        int time = 1;
        
        while (time <= 3) {
            System.out.println("Boiling... step " + time);
            time++;
        }
        System.out.println("Rice is cooked");
    }

    void cookChicken() {
        System.out.println("\nCooking chicken...");
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Cooking step " + i);
        }
        System.out.println("Chicken cooked");
    }

    void mixAndCook() {
        System.out.println("\nMixing rice and chicken...");
        
        int dumTime = 1;
        do {
            System.out.println("Dum cooking... " + dumTime);
            dumTime++;
        } while (dumTime <= 3);

        System.out.println("Biryani is ready 🍛");
    }
}

public class   {
    public static void main(String[] args) {

        Biryani b = new Biryani();

        b.prepareIngredients();
        b.marinateChicken();
        b.cookRice();
        b.cookChicken();
        b.mixAndCook();
    }
}