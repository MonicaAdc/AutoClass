package homework10;


import java.util.ArrayList;
import java.util.List;

public class CheckProducts {
		public static void main(String[] args) {
			List<String> list1 = new ArrayList();
			List<String> list2 = new ArrayList();
			List<String> rez = new ArrayList();
			list1.add("Product1");
			list1.add("Product2");
			list1.add("Product3");
			list1.add("Product4");
			list1.add("Product5");

			list2.add("Product1");
			list2.add("Product2");
			list2.add("Product6");
			list2.add("Product4");
			list2.add("Product8");

			for(String prod: list1){
				if (list2.contains(prod)){
					rez.add("Yes");
				}else {
					rez.add("No");
				}	
			}
			System.out.println(rez);
		}

	}
