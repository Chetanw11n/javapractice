import java.util.Scanner;

class Byte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a byte value: ");
        byte a = sc.nextByte(); 
        System.out.println("You entered: " + a);
        sc.close();     }
}
