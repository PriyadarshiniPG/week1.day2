package week1.day2;

public class LearnMethods {
	public static void main(String[] args) {
		LearnMethods obj=new LearnMethods();
		obj.printCarName();
		//reason why return wont print anything is it will get us the output when calling the method 
		//to know the o/p we have to store it in a variable and print them
		int carRegNumber = obj.getCarRegNumber();
		System.out.println(carRegNumber);
		String carVarient = obj.getCarVarient();
		System.out.println(carVarient);
		float multiplyTwoNum = obj.multiplyTwoNum(1.8907f, 3);
		System.out.println(multiplyTwoNum);
	}
public void printCarName() {
	System.out.println("BMW");
}
public int getCarRegNumber() {
	return 1567;
}
public String getCarVarient() {
	return "Diesel";
	
}
public float  multiplyTwoNum(float d,int b) {
	return d*b;
	
}
}
