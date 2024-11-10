package abstra;

public class Circle extends Shape {

	public static void main(String[] args) {
		Shape s = new Circle();
           s.displayshape();
           s.displayname();
         Shape s2= new Triangle() ; 
         s2.displayshape();
	}

	@Override
	public void displayshape() {
		System.out.println(" hello");
		
	}

}
