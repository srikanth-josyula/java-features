package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStreams {
	public static void main(String[] args) {
		
		//Convert Stream to Collections
		Stream<Integer> intStream = Stream.of(1,2,3,4);
		List<Integer> intList = intStream.collect(Collectors.toList());
		System.out.println(intList); //prints [1, 2, 3, 4]

		intStream = Stream.of(1,2,3,4); //stream is closed, so we need to create it again
		Map<Integer,Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i+10));
		System.out.println(intMap); //prints {1=11, 2=12, 3=13, 4=14}
		
		//Convert Stream to Arrays
		Stream<Integer> intStream2 = Stream.of(1,2,3,4);
		Integer[] intArray = intStream2.toArray(Integer[]::new);
		System.out.println(Arrays.toString(intArray)); //prints [1, 2, 3, 4]
	}
}
