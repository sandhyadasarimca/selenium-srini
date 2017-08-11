import java.util.HashSet;

public class TestSet {
public static void main(String[] args) {
	HashSet<String> abc=new HashSet<String>();
	abc.add("aparna");
	abc.add("srini");
	abc.add("sandhya");
	abc.add("aaa");
	abc.add("bbb");
	abc.add("aaa");
	for(String s:abc){
		System.out.println(s);
	}
}
}
