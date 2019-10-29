import java.rmi.server.RMISocketFactory;
import java.util.Scanner;
public class Item {
    String name;
    int weight;
}
public Item(){
    name=U1;
}
interface Spaceship
{

    public boolean lanch();

    public boolean land();

    public boolean canCarry(Item item);

    public void carry(Item item);

}
class Rocket implements Spaceship
{
    public boolean lanch()
    {
        return true;
    }
    public boolean land()
    {
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
class U1 extends Rocket
{
    @Override
    public boolean lanch() {
    }

    @Override
    public boolean land()
    {
        return;
    }
}
class U2 extends Rocket
{
    @Override
    public boolean lanch()
    {
        return ;
    }

    @Override
    public boolean land()
    {
        return;
    }
}
class Simulation {
     File file = new File("phase1");
     Scanner loadItems = new Scanner(file);
     Arraylist<String> list=new Arraylist<String>();
     while (loadItems.hasNext()){
         list.add(loadItems,next());
     }
     loadItems.close();
}
