import java.util.ArrayList;



public class BasicJava {

    public String printTo255(int number) {
        for(int i = 0; i < number; i++){
           System.out.println(i);
        }
        return "";
    }
    public String printOdds(int number) {
        int i = 0;
        while(i < number) {
            if (i % 2 == 1){
                System.out.println(i);
            }
            i ++;
        }
        return "";
    }
    // public void printOdds2(int number) {
    //     int i = 1;
    //     while(i<number){
    //         System.out.println(i);
    //         i += 2;
    //     }
    // }
    public int sigma(int number) {
        int sum = 0;
        for(int i = 0;  i < number; i++) {
            sum += i;
        }
            return sum;
    }
    public void iterate(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public int findMax(ArrayList<Integer> array) {
        int max = array.get(0);
        for(int i = 1; i < array.size(); i++) {
            array.get(i);
            if(array.get(i) > max){
                max = array.get(i);
            }
        }
        return max;
    }
    public ArrayList<Integer> oddArray(int number) {
        ArrayList <Integer> oddNums = new ArrayList<Integer>();
        for( int i = 0; i < number; i++) {
            if (i % 2 == 1){
                oddNums.add(i);
            }
        }
        return oddNums;
    }

}