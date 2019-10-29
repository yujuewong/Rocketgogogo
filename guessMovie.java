import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

class guessMovie 
{
    public static void main(String args[]) throws FileNotFoundException
    {
        File file= new File("moiveList.txt");
        Scanner sc = new Scanner(file);
        ArrayList<String> names = new ArrayList<>();
        boolean didPass= false;

        while (sc.hasNextLine())
        {
            String curr = sc.nextLine();
            System.out.println(curr);
            names.add(curr);
        }
    
        sc.close();
        int moiveNumber=names.size();
        int selectedMoive=(int)(Math.random()*names.size());
        System.out.println(selectedMoive);
        System.out.println(names.get(selectedMoive).toString());


    }
}
