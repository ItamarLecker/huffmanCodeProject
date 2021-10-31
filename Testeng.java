package huffmanCodeProject;

import java.util.Arrays;

public class Testeng {

	public static void main(String[] args) {
		
			
	}
	public NewChar[][] brake(NewChar[] ch, int cp) {
		NewChar[][] nch = new NewChar[2][]; 
		NewChar[] ch1 = new NewChar[cp+1];
		NewChar[] ch2 = new NewChar[ch.length-ch1.length];
		int num=0;
		for(int i = 0; i<ch1.length; i++) {
			ch1[i] = ch[num];
			num++;
		}
		
		for(int i = 0; i<ch2.length; i++) {
			ch2[i] = ch[num];
			num++;
		}
		
		nch[0] = ch1;
		nch[1] = ch2;
		return nch;
	}

}
