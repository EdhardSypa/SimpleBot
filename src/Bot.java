import java.util.Scanner;
public class Bot {
	final static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		greet("Al", 2020);
		remindName();
		guessAge();
		count();
		askQuestion();
		end();
	}
	
	static void greet(String assistantName, int birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }
	
	static void remindName() {
		System.out.print("> ");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

	static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        System.out.print("> ");
        int remaind3 = scanner.nextInt();
        System.lineSeparator();
        System.out.print("> ");
        int remaind5 = scanner.nextInt();
        System.lineSeparator();
        System.out.print("> ");
        int remaind7 = scanner.nextInt();
        int age = (remaind3 * 70 + remaind5 * 21 + remaind7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }
	
	static void count() {
		System.out.println("Now I will prove to you that I can count to any number you want.");
		System.out.print("> ");
		int number = scanner.nextInt();
		for(int i = 0; i <= number; i++) {
			System.out.println(i + "!");
		}
	}
	
	static void askQuestion() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("A Syntax Error is?");
        System.out.println("1. An error you will never find");
        System.out.println("2. An error you find at the end when the program gives out a wrong value due to logic error");
        System.out.println("3. An error caused by language rules being broken.");
        System.out.println("4. An error due to user error.");
        int answer = 3;
        while (true) {
        	System.out.print("> ");
        	int guess = scanner.nextInt();
        	if(answer == guess) {
        		break;
        	} 
        	System.out.println("Please, try again.");
        }
    }
	
	static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
