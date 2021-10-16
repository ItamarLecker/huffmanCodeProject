package huffmanCodeProject;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		char[] ch = Read("C:\\Users\\Itamar\\eclipse-workspace\\tree\\src\\huffmanCodeProject\\txt.txt");
		
		System.out.println("have an array");
		
		NewChar[] allCh;
		
		allCh = culc(ch);
		
		System.out.println("\naonunt culculted!");
		
		allCh = Sort(allCh);
		System.out.println("\nsorted!!");
		
		allCh = precentegculc(allCh, ch);
		System.out.println("\nprecenteg culculted");
		for(int i = 0; i<allCh.length; i++) {
			System.out.println(allCh[i].amunt);
		}
		
	}//main****************************************************
	
	public static char[] Read(String path) throws IOException {
		
		FileReader fr = new FileReader(path);
		
		char[] ch = new char[0];
		
		int i;
		while((i = fr.read()) != -1) { 
			
			ch = AddChar((char)i, ch);
		}
		return ch;
	}
	
	public static char[] AddChar(char chToAdd, char[] ch) {
		
		char[] newch = new char[ch.length + 1];
		
		for(int i = 0; i<ch.length; i++) {
			newch[i] = ch[i];
		}
		newch[newch.length -1] = chToAdd; 
		
		
		return newch;
		
		
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
	
	
	public static NewChar[] precentegculc(NewChar[] nch, char[] ch){
		
		double sum = ch.length;
		System.out.println(sum);
		for(int i = 0; i<nch.length; i++) {
			nch[i].amunt = nch[i].amunt/sum*100;
		}
		
		return nch;
		
	}
	
	

}






















