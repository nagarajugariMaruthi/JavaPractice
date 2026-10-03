package mypackage;

abstract class Rental {

    abstract void caluculateRent(int days);

    abstract void displaydetails();
}

// Car class
class Car extends Rental {

    @Override
    void caluculateRent(int days) {

        int rentperday = 2000;
        int totalrent = rentperday * days;

        System.out.println("Rent per day : " + rentperday);
        System.out.println("Total rent : " + totalrent);
    }

    @Override
    void displaydetails() {

        System.out.println("Vehicle : Car");
        System.out.println("Vehicle type : 4 wheeler");
    }
}

// Bike class
class Bike extends Rental {

    @Override
    void caluculateRent(int days) {

        int rentperday = 1000;
        int totalrent = rentperday * days;

        System.out.println("Rent per day : " + rentperday);
        System.out.println("Total rent : " + totalrent);
    }

    @Override
    void displaydetails() {

        System.out.println("Vehicle : Bike");
        System.out.println("Vehicle type : 2 wheeler");
    }
}

// Truck class
class Truck extends Rental {

    @Override
    void caluculateRent(int days) {

        int rentperday = 5000;
        int totalrent = rentperday * days;

        System.out.println("Rent per day : " + rentperday);
        System.out.println("Total rent : " + totalrent);
    }

    @Override
    void displaydetails() {

        System.out.println("Vehicle : Truck");
        System.out.println("Vehicle type : Heavy truck");
    }
}