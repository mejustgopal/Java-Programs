//  Create a Grocery class with a member variable, weight, and two 
// methods, weightNow() and checkWeight(). The weightNow() method 
// should initialize the weight variable and the checkWeight() method 
// should display its value. In addition, create an object of the Grocery 
// class to call the preceding methods

package Exercise;

import java.util.Scanner;

public class Grocery {
    private float weight;

    public void weightNow() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter weight of the Item: ");
        weight = s1.nextFloat();

        s1.close();
    }

    public void checkWeight() {
        System.out.println("Weight of the item is " + weight + "kg");
    }

    public static void main(String[] args) {
        Grocery obj = new Grocery();
        obj.weightNow();
        obj.checkWeight();
    }

}
