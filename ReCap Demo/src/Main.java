public class Main {

	public static void main(String[] args) {
		int firstNumber = 49;
		int secondNumber = 1;
		int thirdNumber = 14;
		
		if(thirdNumber > firstNumber && thirdNumber > secondNumber) {
			System.out.println("Third number is the biggest number.");
		}
		else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
			System.out.println("Second number is the biggest number.");
		}
		else if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.println("First number is the biggest number.");
		}
		else if (secondNumber == thirdNumber){
			System.out.println("You should pick different numbers");
		}
		else if(secondNumber == firstNumber) {
			System.out.println("You should pick different numbers");
		}
		else if(thirdNumber == firstNumber) {
			System.out.println("You should pick different numbers");
		}
		else {
			System.out.println("There is a problem with your numbers, please pick them again.");
		}

	}

}
