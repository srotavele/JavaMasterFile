import java.util.Random;
import java.util.ArrayList;


public class PuzzlingTest {

    public static void main(String[] args) {
        Puzzling randPuzz = new Puzzling();
        ArrayList<Integer> randRolls = randPuzz.tenRolls();
        System.out.println(randRolls);
    }


}