package JavaTraining;

/**
 * @author Vaughan Schmidt
 *
 * Basic command line argument parsing
 */
public class using_args {

    public static void main(String[] args) {

	System.out.println("Number of arguments passed on command line: " + args.length );

	    for (String arg : args) {
		    System.out.println( arg );
	    }
    }
}
