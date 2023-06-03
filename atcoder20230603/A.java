package atcoder20230603;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A {
	static class Person {
		String name;
		int age;
		
		Person(String name, int age){
			this.name = name;
			this.age = age;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Person> people = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			String name = sc.next();
			int age = sc.nextInt();
			people.add(new Person(name,age));
		}
		sc.close();
		
		int youngestIndex = 0;
		for(int i = 0; i < N; i++) {
			if(people.get(i).age < people.get(youngestIndex).age) {
				youngestIndex = i;
			}
		}
		Collections.rotate(people, -youngestIndex);
		
		for(Person p : people) {
			System.out.println(p.name);
		}
	}
}
