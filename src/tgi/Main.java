package tgi;
//TESTPROGRAMM F‹R TGI
public class Main {

	public static void main(String[] args) {
		/*int min = 10, max = 100;
		int az2 = 0;
		double pr1, pr2;
		double az = 0; 
		double rnd=0;
		int s = 1000000;
		for(int i = 0; i<s; i++) {
			rnd = TGI.nextRndDo(min, max);
			System.out.println(i);
			if(rnd==min||rnd==max) {
				az++;
			}
			else if(rnd<min||rnd>max) {
				az2++;
			}
		}
		pr1 = az/(s/100);
		pr2 = (az2/s)*100;
		System.out.println(az + " " + az2);
		System.out.println(pr1 + "% aller Zahlen war min oder max und " + pr2 + "% aller zahlen war auﬂerhalb des Bereichs");
		*/
		
		//String s = TGI.nextLine();
		//System.out.println(s);
		//char c = TGI.RndChar();
		//char c = TGI.testlmao('a', 'b','c', 'd');
		//System.out.println(c);
		String [] test = {"test", "lmao", "rofl", "peter", "Albert", "michael8", "michael23", "michael2", "alfons5", "ali1", "ala"};
		String [] ergebnis = TGI.stringsort(test);
		for(int i = 0; i<test.length; i++) {
			System.out.println(ergebnis[i]);
		}
		//String s = "Testlmao";
		//s = TGI.AllesGroﬂ(s);
		//System.out.println(s);
		/*int [] lol = {1,5,7,3,4,2};
		int [] test = TGI.bubblesort(lol);
		for(int i = 0; i<test.length; i++) {
			System.out.println(test[i]);
		}*/
	}

}
