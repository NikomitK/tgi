/*idk komische file 
 * die einfach so in dem Projekt 
 * lag, kein plan was da der 
 *	unterschied is oder woher die kommt
 */
package tgi;
import java.util.Scanner;
import java.util.Random;
public class TGIZwei {
	
	static Scanner s = new Scanner(System.in);
	static Random r = new Random();
	
	public static float nextRndFl(int min, int max) {
		try {
		return r.nextFloat() * (max-min)+min;
	}
	catch(Exception e) {
		System.out.println("min muss größer als max sein");
		return 694.20f;
	}
	}
	
	
	
	public static int nextRnd(int min, int max) {
		try{
		return r.nextInt((max - min) + 1) + min;
		}
		catch(Exception e) {
			System.out.println("min muss größer als max sein");
			return 69420;
		}
	}
	
	public static int nextRnd(int max) {
		try{
		return r.nextInt(max);
		}
		catch(Exception e) {
			System.out.println("min muss größer als max sein");
			return 69420;
		}
	}
	
	public static double nextRndDo(int min, int max) {
		try {
		return r.nextDouble() * (max-min)+min;
	}
	catch(Exception e) {
		System.out.println("min muss größer als max sein");
		return 6.9420;
		}
	}
	
	
	public static int nextInt() {
		try {
			return s.nextInt();
		}
		catch(Exception e) {
			System.out.println("Es wurde kein int eingegeben");
			return 0;
		}
	}
	
	
	public static String next() {
		try {
			return s.next();
		}
		catch(Exception e) {
			System.out.println("Es wurde kein String eingegeben");
			return null;
		}
	}
	
	
	public static double nextDouble() {
		try {
			return s.nextDouble();
		}
		catch(Exception e) {
				System.out.println("Es wurde kein double eingegeben");
				return 0;
		}
	}
	
	
	public static char nextChar() {
		try {
			return s.next().charAt(0);
		}
		catch(Exception e) {
				System.out.println("Es wurde kein char eingegeben");
				return 0;
		}
	}
	
	
	public static boolean nextBool() {
		try {
			return s.nextBoolean();
		}
		catch(Exception e) {
			System.out.println("es wurde kein boolean eingegeben");
			return false;
		}
	}
	
	
	public static float nextFloat() {
		try {
			return s.nextFloat();
		}
		catch(Exception e) {
			System.out.println("es wurde kein float eingegeben");
			return 0;
		}
	}
	
	
	
}
