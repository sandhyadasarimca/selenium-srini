import java.util.HashMap;

public class TestMap {
public static void main(String[] args) {
	HashMap<String,String> abc=new HashMap<String,String>();
	abc.put("name","aparna");
	abc.put("city","bang");
	abc.put("state","karn");
	abc.put("state","hyd");
	System.out.println(abc.get("state"));
}
}
