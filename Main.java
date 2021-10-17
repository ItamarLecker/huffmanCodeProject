package huffmanCodeProject;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		NewChar[] ch = Read("C:\\Users\\Itamar\\eclipse-workspace\\tree\\src\\huffmanCodeProject\\txt.txt");
		
		System.out.println("have an array");
		
						
		
		
		
	}//main****************************************************
	
	public static NewChar[] Read(String path) throws IOException {
		
		FileReader fr = new FileReader(path);
		
		NewChar[] ch = new NewChar[0];
		
		int i;
		int len = 0;

		while((i = fr.read()) != -1) { 
			
			len++;
			
			char Char = (char)i;
			
			ch = func(Char, ch);
		}

		ch = Sort(ch);
		System.out.println("\nsorted!!");
		
		ch = precentegculc(ch, len);
		System.out.println("\nprecenteg culculted");
		
		for(int j = 0; j<ch.length; j++) {
			System.out.println(ch[i].amunt);
		}
		
		return ch;
	}
	
	
	public static NewChar[] func(char Char, NewChar[] ch) {
		
		NewChar[] nch = new NewChar[ch.length + 1];
		
		for(int i = 0; i<ch.length; i++) {
			
			nch[i] = ch[i];
			
		}
		nch[nch.length -1].ch = Char;
		
		return nch;
		
	}
	
	public static NewChar[] culc(char[] ch) {
		
		NewChar[] allCh = new NewChar[1];
		allCh[0] = new NewChar(' ');
		
		for(int i = 0; i<ch.length; i++) {
			for(int j = 0; j<allCh.length; j++) {
				if(ch[i] == allCh[j].ch) {
					allCh[j].amunt++;
					j = allCh.length;
				}else if(j == allCh.length-1) {
					allCh = AddNewChar(ch[i], allCh);
				}
			}
			
		}
		return allCh;
		
		
	}
	
	public static NewChar[] AddNewChar(char chToAdd, NewChar[] ch) {
		
		NewChar[] newch = new NewChar[ch.length + 1];
		
		for(int i = 0; i<ch.length; i++) {
			newch[i] = ch[i];
		}
		NewChar ncToAdd = new NewChar(chToAdd);
		
		newch[newch.length -1] = ncToAdd; 
		
		
		return newch;
		
		
	}
	
	public static NewChar[] Sort(NewChar[] arr) {
		NewChar temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j].amunt > arr [j - 1].amunt) {
			    temp = arr[j];
			    arr[j] = arr[j - 1];
			    arr[j - 1] = temp;
			    }
		    }
		}
		return arr;
	}
	
	
	public static NewChar[] precentegculc(NewChar[] nch, int len){
		
		double sum = len;
		System.out.println(sum);
		for(int i = 0; i<nch.length; i++) {
			nch[i].amunt = nch[i].amunt/sum*100;
		}
		return nch;
		
	}
	
	

}






















