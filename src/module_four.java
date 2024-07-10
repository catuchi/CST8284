
public class module_four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		String day = "Tuesday";
		
		// if else
		if(num % 2 == 0) {
			System.out.println(num + " is an even number");
		} else {
			System.out.println(num + " is an odd number");
		}
		
		// if else if
		if(num > 10) {
			System.out.println(num + " is greater than 10");
		} else if(num < 10) {
			System.out.println(num + " is less than 10");
		} else {
			System.out.println(num + " is equal than 10");
		}
		
		// switch statement
		switch(day) {
		case "Monday":
			System.out.println("Today is Monday");
		break;
		case "Tuesday":
			System.out.println("Today is Tuesday");
		break;
		case "Wednesday":
			System.out.println("Today is Wednesday");
		break;
		case "Thursday":
			System.out.println("Today is Thursday");
		break;
		case "Friday":
			System.out.println("Today is Friday");
		break;
		default:
			System.out.println("Today is a either Saturday or Sunday");
		}
		
		// while loop
		while(num > 0) {
			System.out.println(num);
			num-=2;
		}
		
		int newNum = 10;
		
		// for loop
		for(int i = 0; i < newNum; i+=2) {
			System.out.println("I love Java");
		}
		
		
		// for each loop
		int a[] = {10,20,30,40,50};
		for(int i: a) {
			System.out.println(i);
		}
		
		
		// do...while loop
		do {
			System.out.println(newNum * newNum);
			newNum-=2;
		} while (newNum > 0);
		
		// testing if statement without statement block
		if(true)
			System.out.println("Yay!");
		System.out.println("Nay!");
		
		// continue statement
		int numbre = 5;
		while(numbre > 0) {
			numbre--;
			if(numbre == 3) {
				continue;
			}
			System.out.println(numbre);
		}

	}

}
