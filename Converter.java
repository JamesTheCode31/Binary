import java.util.Scanner; 

public class Converter {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Enter a decimal number: ");
            int decimal = scanner.nextInt();
            String binary = Integer.toBinaryString(decimal);
            System.out.println("Binary representation: " + binary);
        } 
    }
}
/*
Import the Scanner class for reading user input
Create a Scanner object to read input from the console
Prompt the user to enter a decimal number
Read the entered decimal number
Convert the decimal number to its binary representation
Output the binary representation
The Scanner object is automatically closed here
*/