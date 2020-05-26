import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Basics {
	
	public static void main(String[] args) {
		String[] list= {"A","A","V","C","R","T","G",""};
		List<String> colList=Arrays.asList(list);
		System.out.println("Initial size "+colList.size());
		colList.stream().distinct().forEach(System.out::println);
		colList=colList.stream().distinct().collect(Collectors.toList());
		System.out.println("Final size "+colList.size());
		colList.stream().sorted().forEach(System.out::println);
	}

}
