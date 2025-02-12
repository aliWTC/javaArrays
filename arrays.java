import java.util.Scanner;
import java.util.Random;



public class Main {
	public static void defaultArray() {
		int[] numbers = new int[5];
		System.out.print("Default: ");

		System.out.print(numbers[0]);
		System.out.print(numbers[1]);
		System.out.print(numbers[2]);
		System.out.print(numbers[3]);
		System.out.print(numbers[4]);
		System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
System.out.println();
	}



	public static void assigned() {

		int[] numbers = new int[] {21, 12, 22, 11, 2};
		
		System.out.print("Assigned Array: ");
		System.out.print(numbers[0]);
		System.out.print(' ');
		System.out.print(numbers[1]);
		System.out.print(' ');
		System.out.print(numbers[2]);
		System.out.print(' ');
		System.out.print(numbers[3]);
        System.out.print(' ');
		System.out.print(numbers[4]);
		System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println();
	}


	public static void loopAssigned() {
        System.out.print("Loop assignment: ");

		int[] numbers = new int[5];
        
        for (int i = 0; i < numbers.length; i++){
            if (i != 0){
                numbers[i] = numbers[i-1]+3;
                System.out.print(numbers[i]);
                System.out.print(' ');
            }
            else{
                numbers[i] = 3;
                System.out.print(numbers[i]);
                System.out.print(' ');
            }

        }
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
System.out.println();

}


    public static void asciiAssigned() {
        char[] charArray = new char[5];
        
        
        int number = 63;
        
        System.out.print("Letter array: ");
        for (int i = 0; i < charArray.length; i++){
            
            
            number=number+2;
            
            char asciiChar = (char) number;
            
            charArray[i] = asciiChar;
            
            System.out.print(charArray[i]);
            System.out.print(" ");
            
    }
    
    System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
System.out.println();
    
}

    public static void userMade() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of an array: ");
        
        int arrayLen = scanner.nextInt();
        
		int[] numbers = new int[arrayLen];

        
        
        
        for (int i = 0; i < arrayLen; i++){
            Random rand = new Random();
            int randomNum = rand.nextInt(101);
            
            numbers[i] = randomNum;
            System.out.print(numbers[i]);
            System.out.print(" ");
            
            
        }
        
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println();
    }



	public static void main(String[] args) {
	    defaultArray();
        assigned();
        loopAssigned();
        asciiAssigned();
		userMade();
	}
}
