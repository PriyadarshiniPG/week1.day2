package week1.day2;

public class MyCalculator {
public static void main(String[] args) {
	Calculator cal=new Calculator();
	int add = cal.add(10, 5, 8);
	System.out.println(add);
	int sub = cal.sub(987, 188);
	System.out.println(sub);
	double mul = cal.mul(1.987654321, 3.98764321);
	System.out.println(mul);
	float div = cal.div(4.9876f, 5.9876f);
	System.out.println(div);
}
}
