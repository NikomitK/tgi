package tgi;
import java.util.Scanner;
import java.util.Random;
public class TGI {
	
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
	
	public static int[] bubblesort(int [] s) {
		int k;
		for(int i = 1; i<s.length; i++) {
			for(int j = 0; j<s.length-1; j++) {
				if(s[j]>s[j+1]) {
					k = s[j];
					s[j] = s[j+1];
					s[j+1] = k;
				}
			}
		}
		
		
		return s;
	}
	
	public static String [] stringsort(String [] s) {
		String k;
		for(int i = 1; i<s.length; i++) {
			for(int j = 0; j<s.length-1; j++) {
				int dings = -1;
				int bums;
				String eins = AllesGroß(s[j]);
				String zwei = AllesGroß(s[j+1]);
				if(eins.length()<zwei.length()) {
					bums = eins.length();
				}
				else {
					bums = zwei.length();
				}
				for(int z = 0; z<bums;z++) {
					if(eins.charAt(z)==zwei.charAt(z)) {
						continue;
					}
					else {
						dings = z;
						break;
					}
					
				}
				try {
				int te = (int) eins.charAt(dings);
				int st = (int) zwei.charAt(dings);
				if(te>st) {
					k = s[j];
					s[j] = s[j+1];
					s[j+1] = k;
				}
				}
				catch(Exception e) {
					if(eins.length()<zwei.length()) {
						break;
					}
					else {
						k = s[j];
						s[j] = s[j+1];
						s[j+1] = k;
					}
				}
			}
		}
		
		
		return s;
	}
	
	public static String AllesGroß(String s) {
		String j = "";
		for(int i = 0; i<s.length(); i++) {
			int f = (int) s.charAt(i);
			if(f>90) {
				f = f-32;
			}
			char c = (char) f;
			j = j+c;
		}
		return j;
	}
	public static char testlmao(char... lmao) {
		char c = '0';
		int i = nextRnd(0, lmao.length-1);
		c = lmao[i];
		return c;
	}
	
	public static char RndChar() {
		int i = nextRnd(0,1);
		int k;
		if(i==1) {
			k = nextRnd(65,90);
		}
		else {
			k = nextRnd(97,122);
		}
		char c = (char) k;
		return c;
	}
	
	public static int nextRnd(int max) {
		try {
			return r.nextInt(max);
		} catch (Exception e) {
			return 69420;
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
	
	
	public static String nextString() {
		try {
			return s.next();
		}
		catch(Exception e) {
			System.out.println("Es wurde kein String eingegeben");
			return null;
		}
	}
	
	
	public static String nextLine() {
		try {
			return s.nextLine();
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
