import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ToyStore toyStore = new ToyStore();
        Toy toy1 = new Toy(1, "Car", 23, 20.0);
        Toy toy2 = new Toy(2, "Doll", 40, 30.0);
        Toy toy3 = new Toy(3, "Ball", 20, 25.0);
        Toy toy4 = new Toy(4, "Teddy Bear", 35, 25.0);
        toyStore.addToy(toy1);
        toyStore.addToy(toy2);
        toyStore.addToy(toy3);
        toyStore.addToy(toy4);
        toyStore.updateWeight(1, 30.0);
        toyStore.play();
        Toy prizeToy = toyStore.getPrizeToy();
        System.out.println("Congratulations! You won a " + prizeToy.getName() + "!");
    }
}

