package streamPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Group a list of persons by their age
Input: List persons = [Person("John", 25), Person("Alice", 30), Person("Bob", 25)]
Output: {25=[Person("John", 25), Person("Bob", 25)], 30=[Person("Alice", 30)]}
 */
class Person {
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	Person (String name, int age){
		this.name = name;
		this.age = age;
	}
	private String name;
	private int age;
	
}
public class Stream03 {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("John", 25)); 
		list.add(new Person("Alice", 30)); 
		list.add(new Person("Bob", 25)); 
		list.add(new Person("Emily", 30)); 
		
		Map<Integer, List<Person>> group = list.stream().collect(Collectors.groupingBy(Person::getAge));
		
		System.out.println(group);
	}
	
}
