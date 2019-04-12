package Set1;

public class Example1 {

	/*
	 *  static polymorphism example
	 *  METHOD -OVERLOADING
	 * */ 

	    public static void main(String[] args) {
	        System.out.println("at example main method");

	        String s = "hello";

//	        System.out.println(main(s));
	    }

	    static String main() {
	        return "java";
	    }

	    static void main(int a) {

	    }

	    static int main(String s) {

	        return 0;
	    }

	    static void main(String[] a, int b) {

	    }
	}


