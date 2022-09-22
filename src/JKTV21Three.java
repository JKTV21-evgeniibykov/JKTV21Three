
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pupil
 */
public class JKTV21Three {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number XXX: ");
        String num = scanner.next();
        if (num.length() == 3) {
            System.out.println("1 = " + num.substring(2,3));
            System.out.println("10 = " + num.substring(1,2));
            System.out.println("Sum = " + (Integer.parseInt(num.substring(0,1)) + Integer.parseInt(num.substring(1,2)) + Integer.parseInt(num.substring(2,3))));
        }
    }
    
}
