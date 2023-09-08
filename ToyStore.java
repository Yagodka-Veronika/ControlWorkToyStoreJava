import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyStore {
    private List<Toy> toys = new ArrayList<>();
    private List<Toy> prizeToys = new ArrayList<>();

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void updateWeight(int id, double weight) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setWeight(weight);
                break;
            }
        }
    }

        public void play() {
        Random random = new Random();
        double totalWeight = 0.0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }
        double randomNumber = random.nextDouble() * totalWeight;
        double currentWeight = 0.0;
        for (Toy toy : toys) {
            currentWeight += toy.getWeight();
            if (currentWeight >= randomNumber) {
                prizeToys.add(toy);
                break;
            }
        }
    }

    public Toy getPrizeToy() throws IOException {
        Toy prizeToy = prizeToys.get(0);
        prizeToys.remove(0);
        for (Toy toy : toys) {
            if (toy.getId() == prizeToy.getId()) {
                toy.setCount(toy.getCount() - 1);
                break;
            }
        }
        FileWriter writer = new FileWriter("prize1.txt");
        writer.write(prizeToy.getName());
        writer.close();
        return prizeToy;
    }

}

