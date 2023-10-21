package midterm_week04;

public class Circle {
	int radius;		//필드
	String name;	//필드
	
	public Circle() {} //생성자 메소드
	public double getArea() {	//면적 계산 메소
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) { //메인 메소드
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.print("면적은 "+ area);
	}
}


//20page 부