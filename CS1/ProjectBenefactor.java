/**
 * Project Benefactor Program
 * Created on 2/5/2022
 *
 * @author Jared Talladay
 *
 *
 */
import java.util.*;
import java.text.NumberFormat;

class ProjectBenefactor {

	public static void main(String[] args) {

		// Receive information from user using scanner class
		// Store values for "name", "net worth", and "number of heirs"

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = scan.nextLine();
		System.out.println("Please enter your net worth: ");
		double net_Worth = scan.nextDouble();
		System.out.println("Please enter your number of heirs: ");
		long number_Of_Heirs = scan.nextLong();

		//Perform claculations to find disbursement and remainder
		double disbursement = (net_Worth/number_Of_Heirs);
		double remainder = net_Worth % number_Of_Heirs;

		//initialize number format class for converting numbers to currency
		NumberFormat formatter = NumberFormat.getCurrencyInstance();

		//Print out information to user
		System.out.println("Name: " + name);
		System.out.println("Net worth: " + net_Worth);
		System.out.println("Number of heirs: " + number_Of_Heirs);
		System.out.println(name + ": your net worth of " + formatter.format(net_Worth));
		System.out.println("can be divided equally between " + number_Of_Heirs + " heirs");
		System.out.println("with each receiving " + formatter.format(disbursement));
		System.out.println("and " + formatter.format(remainder) + " remaining.");
		}

}
