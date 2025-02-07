class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person {
    Chef(String name, int id) {
        super(name, id);
    }

    void performDuties() {
        System.out.println(name + " is cooking.");
    }
}

class Waiter extends Person {
    Waiter(String name, int id) {
        super(name, id);
    }

    void performDuties() {
        System.out.println(name + " is serving.");
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon Ramsay", 1);
        Waiter waiter = new Waiter("John Doe", 2);

        chef.performDuties();
        waiter.performDuties();
    }
}
