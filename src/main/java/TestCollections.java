import java.util.ArrayList;

public class TestCollections {
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		s.add("abc");
		s.add("dfg");
		s.add("ghj");
		s.add("hnh");
//		for (int i = 0; i < s.size(); i++) {
//			System.out.println(s.get(i));
//		}
		for(String a:s){
			System.out.println(a);
		}
	}
}
