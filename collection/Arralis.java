package collection;


import java.util.ArrayList;
import java.util.List;

public class Arralis {

	public static void main(String[] args) {
	  List l1 = new ArrayList();
	  l1.add(6);
	  l1.add(14);
	  System.out.println(l1);
	  List l2 = new ArrayList();
	  l2.add(0,20);
	  l2.add(1,16);
	  l1.addAll(0,l2);
//	  l1.remove(0)
	  System.out.println(l1);
	  System.out.println(l1.get(0));

	}

}
