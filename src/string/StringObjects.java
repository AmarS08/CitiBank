package string;

public class StringObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Ananya";//It is created in String Constant Pool
		System.out.println(name);
		name = "Amar S";
		System.out.println(name);
		String name1 = new String("AnanyaS");//It is created in Heap Memory
		System.out.println(name1);
		name1 = "Anu";
		System.out.println(name1);
		String s = new String("Ananya");
		s = s.concat(".S");
		System.out.println(s);
		name1 = name1.concat(".S");
		System.out.println(name1);
		StringBuffer sb = new StringBuffer("Ananya");
		sb.append(".S");
		System.out.println(sb);
		String s1 = new String("Ananya");
		String s2 = new String("Ananya");
		System.out.println(s1 == s2);//false bcz it checks for address comparisons
		System.out.println(s1.equals(s2));//true bcz it checks for content comparisons
		String str1 = new String("Md");
		str1.concat("Ali");
		String str2 = str1.concat("Sharukh");
		str1 = str1.concat("Nawaz");
		System.out.println(str1);//MdNawaz
		System.out.println(str2);//MdSharukh
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,5));
	}

}
