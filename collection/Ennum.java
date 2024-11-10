package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ennum {

	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		for(int i=0; i<6;i++) {
			v.add(i);
		}
			System.out.println(v);	
			Iterator it = v.iterator();
			while(it.hasNext()) {
				int i=(Integer)it.next();
				System.out.println(i);
				if(i%2!=0)
					it.remove();
			}
			System.out.println(v);
		
		}
		

	

}
