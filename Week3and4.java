package labs;

public class Week3and4 {

	public static void main(String[] args) {
		fullname("Gulbakhor", "Ollaberganova");//8
		concatenete("Hello", 5);//7
		int[] sumindex= {1,9,7};
		//System.out.println(sumarray(sumindex));//9
		
		double[]hi= {2.0,8.0};
		double[]buy= {4.0, 2.0};
		//System.out.println(average(hi));//10
		//System.out.println(firstEgreater(hi, buy));
		//System.out.println(willBuyDrink(false, 20.0));//11
		//System.out.println(isoddnumber(3));//12
	


		//System.out.println(fullname("Gulbakhor", "Ollaberganova"));
	//	1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.	
int []ages= {3, 9, 23, 64, 2, 8, 28, 93,30};
//System.out.println( ages[ages.length - 1]- ages[0]);
double sum=0;
for(int i=0; i<ages.length; i++) {

sum+=ages[i];

//System.out.println(sum);
}
double avg=sum/ages.length;
//System.out.println(avg);
//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

double summ=0;
String names[]= {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
for(String name: names) {
	summ+=name.length();
	//System.out.println(summ);
	double average=summ/name.length();
	//System.out.println(average);
}
//3.	How do you access the last element of any array?
// array name with index of array length subtracted one: ages[ages.length-1];
//names[names.length-1];
//4.	How do you access the first element of any array?
// array name with "0" index: ages[0]
//names[0];
//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
int[]nameLengths=new int[names.length];
for(int i=0; i< names.length; i++) {
nameLengths[i]=names[i].length();
	//System.out.println( nameLengths[i]);
};
//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
	int summary =0;
	for(int a=0; a<nameLengths.length; a++) {
		summary+=nameLengths[a];
		//System.out.println(summary);
	}
	//7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	
}
		
	
	

	public static void concatenete(String word, int n){
		String result="";
		for(int i=0; i<n; i++) {
		result+=word;	
		
	//	System.out.println(result);
		
		}
		
	}
	//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	public static String fullname(String firstName, String lastName) {
		return firstName+ " " +lastName;
	}
	//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean sumarray(int[]array) {
		int all=0;
		for(int j=0; j<array.length; j++) {
			all+=array[j];
			System.out.println(all);
			}
		
		if(all>100) {
			return false;
		}else {
			return true;
		}
		}
	//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double average(double[]averg) {
		double all=0;
		for (int i=0; i<averg.length; i++) {
			all+=averg[i];
			
		}
		return all/averg.length;
		
	}
	
	//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		
		public static boolean firstEgreater(double[]one, double[]two) {
			double first=0.0;
			double second=0.0;
			double oneAverage=0;
			double twoAverage=0;
			for(int l=0; l<one.length; l++) {
				first+=one[l];
				oneAverage= first/one.length;
				//System.out.println(oneAverage);
			}
			for(int d=0; d<two.length; d++) {
				second+=two[d];
			    twoAverage= second/two.length;
				System.out.println(twoAverage);
			
			if(oneAverage>twoAverage) {
				return true;
			}else {
				return false;
			}
			
			
		}
			return false;
		
	}
		//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if(isHotOutside= true && moneyInPocket>10.50) {
				return true;
			}else {
				return false;
			}
		}
		//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		public static boolean isoddnumber(int number) {
			if(number%2 !=0) {
				return true;
			}else {
				return false;
			}
			
		}
}// isoddnumber must return true if number is odd and it must return false if number is not odd.

