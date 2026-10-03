package methods_Question;

import java.util.function.Function;

public class StaticMethodReferance {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = x -> Math.abs(x);
		System.out.println(f.apply(-10));
	}
	}

// 1. Reference a static method.
//Lambda:
//x -> Math.abs(x)
//Method Reference:
//Math::abs
	
	
