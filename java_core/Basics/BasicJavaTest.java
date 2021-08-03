import java.util.ArrayList;



public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava notBasic = new BasicJava();
    // print all
        System.out.println("print all");
        String testPrintTo255 = notBasic.printTo255(256);
        System.out.println("print odds");
        String testPrintOdds = notBasic.printOdds(256);
        System.out.println("print sigma");
        // notBasic.printOdds2;
        int testSigma = notBasic.sigma(256);
        System.out.println(testSigma);
        System.out.println("print iterate");
        int[] arrTest = {1,3,5,7,9,13};
        notBasic.iterate(arrTest);
        System.out.println("print findMax");
        ArrayList<Integer> arrTest2 = new ArrayList<Integer>();
        arrTest2.add(-3);
        arrTest2.add(-5);
        arrTest2.add(-7);
        int maxTest = notBasic.findMax(arrTest2);
        System.out.println(maxTest);
        System.out.println("print oddArray");
        ArrayList<Integer> testOddArray = notBasic.oddArray(256);
        System.out.println(testOddArray);









        // System.out.println(testPrintTo255);
        // System.out.println(testPrintOdds);
    }
}