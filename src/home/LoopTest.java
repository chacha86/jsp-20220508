package home;
import java.util.ArrayList;

public class LoopTest {

	public static void main(String[] args) {
		
		String[] strArr = {"사과", "배", "감", "귤", "포도"};
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("월요일");
		strList.add("화요일");
		strList.add("수요일");
		strList.add("목요일");
		strList.add("금요일");
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		
		for(String str : strArr) {
			System.out.println(str);
		}
		
		for(String str : strList) {
			System.out.println(str);
		}
		
		
		
		
	}

}
