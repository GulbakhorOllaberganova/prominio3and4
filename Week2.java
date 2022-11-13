package labs;

public class Week2 {

	public static void main(String[] args) {
	int age =14;
	System.out.println( age>=16);
	age=18;
	System.out.println(age>=16);
	boolean hasLicense = true;
	
if(age>=16 && hasLicense) {
	System.out.println("You can drive");
}else {
	System.out.println("You cannot drive");
}
double costOfMilk =3.15;
int thirstLevel = 5;
if(costOfMilk <2.5 || thirstLevel >6) {
	System.out.println("Milk Please");
}else {
	System.out.println("No Thanks");
}
int numberOfCookies =7;
int numberOfChildren=2;

if (numberOfCookies % numberOfChildren >5) {
	System.out.println("Jackpot!");
}else if(numberOfCookies % numberOfChildren>=2) {
	System.out.println("Whooo!");
}else if(numberOfCookies % numberOfChildren>0) {
	System.out.println("Yes!");
}else {
	System.out.println("Sad Face");
}
	}

}
