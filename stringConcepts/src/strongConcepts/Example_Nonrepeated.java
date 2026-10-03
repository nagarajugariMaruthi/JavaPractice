package strongConcepts;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Scanner;

public class Example_Nonrepeated {

	public static void main(String[] args) {
		// TODO Auto-generated      stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
				Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char c :str.toCharArray()) {
			
			map.put(c, map.getOrDefault(c, 0) + 1);
			
				  for (Map.Entry<Character, Integer> e : map.entrySet()) {
				
				if(e.getValue() == 1) {
					System.out.println("First non repeated value " + e.getKey());
					
					return;
				}
					System.out.println("No non repeated character found.");
				}
			}
					sc.close();
				}
			}
					