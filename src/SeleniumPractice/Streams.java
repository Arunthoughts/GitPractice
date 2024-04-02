package SeleniumPractice;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	//@test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.asList("Ram", "Ran", "Ashok", "David", "Vinoth");
		Stream<String> result = Stream.concat(Arrays.asList("Ram", "Ran", "Ashok", "David", "Vinoth").stream(), Arrays.asList("1","Ninan" , "Raj").stream());
		result.filter(n -> n.equalsIgnoreCase("ninan")).collect(Collectors.toList());
		
		Arrays.asList(1,3,45,3,7,6,9,6,8,8,7,1).stream().distinct().sorted().forEach(n -> System.out.println(n));
	}
}
