import java.io.File;
import java.io.FileNotFoundException;
import java.rmi.server.RMISocketFactory;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.ZipEntry;

public class Item {
    String name;
    int weight;

    public Item(String name_, int weight_) {
        name = name_;
        weight = weight_;
    }
}

interface Spaceship {

    public boolean lanch();

    public boolean land();

    public boolean canCarry(Item item);

    public void carry(Item item);

}

class Rocket implements Spaceship {
    public boolean lanch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return false;
    }

    @Override
    public void carry(Item item) {

    }
}

class U1 extends Rocket {
    @Override
    public boolean lanch() {
    }

    @Override
    public boolean land() {
        return;
    }
}

class U2 extends Rocket {
    @Override
    public boolean lanch() {
        return;
    }

    @Override
    public boolean land() {
        return;
    }
}

class Simulation {
    public ArrayList<Item> LoadItems(String address) throws FileNotFoundException {
        String fileName = "phase_1.txt";
        File f = new File("phase_1.txt");
        Scanner sc = new Scanner(f);
        ArrayList<Item> LoadItems= new ArrayList<Item>();

        while (sc.hasNextLine()){
            String line= sc.nextLine();
            String[] details= line.split("=");
            String name= details[0];
            int weight = Integer.parseInt(details[1]);
            Item items= new Item(String name_, int weight_);
            LoadItems.add (items);
        }
        sc.close();
    }
    public ArrayList<Item> LoadU1(ArraList<Item> items) {
    }
    public ArrayList<Item> LoadU2(ArraList<Item> items) {
    }
    public int runSimulation(Arraylist<rocket> rockets) {
    }
    
}
