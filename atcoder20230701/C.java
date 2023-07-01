package atcoder20230701;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class C {
	
	static class person {
		int id;
		double heads;
		double tails;
		
		person(int id, double heads, double tails){
			this.id = id;
			this.heads = heads;
			this.tails = tails;
		}
        double getSuccessRate() {
            return heads / (heads + tails);
        }
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        List<person> persons = new ArrayList<>();
        for(int i = 0; i < N; i++) {
        	double heads = sc.nextDouble();
        	double tails = sc.nextDouble();
        	persons.add(new person(i+1, heads, tails));
        }
        
        Collections.sort(persons, new Comparator<person>() {
            @Override
            public int compare(person p1, person p2) {
                if (p1.getSuccessRate() < p2.getSuccessRate()) {
                    return 1;
                } else if (p1.getSuccessRate() > p2.getSuccessRate()) {
                    return -1;
                } else {
                    return Integer.compare(p1.id, p2.id);  
                }
            }
        });
        
        for(person p : persons) {
        	System.out.print(p.id+ " ");
        }
	}
}
