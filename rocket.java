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
    public ArrayList<Item> LoadItems(String address) {
    }
    public ArrayList<Item> LoadU1(ArraList<Item> items) {
    }
    public ArrayList<Item> LoadU2(ArraList<Item> items) {
    }
    public int runSimulation(Arraylist<rocket> rocket) {
    }
    
}
