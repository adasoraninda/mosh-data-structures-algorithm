import java.util.Arrays;

public class MyArray{

    public static void main(String[] args) {
      // Array<Integer> numbers = new Array<Integer>(20);
      // numbers.insert(10);
      // numbers.insert(20);
      // numbers.insert(30);
      // numbers.insert(40);
      // numbers.removeAt(1);
      // numbers.print();

      Array<String> sentences = new Array<String>(20);
      sentences.insert("a");
      sentences.insert("b");
      sentences.insert("c");
      sentences.insert("d");
      sentences.removeAt(1);
      sentences.print();
    }

    public void initializeAnArray(){
        // Declare
        int[] numbers1 = new int[2];

        // Declare & Initialize
        int[] numbers2 = {1, 2 ,3};
   
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));
    }

}