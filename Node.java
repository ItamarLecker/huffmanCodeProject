package huffmanCodeProject;

import java.util.Arrays;

public class Node {
	
	char data;
	double datai;
	Node R;
	Node L;
	char[] path;
	
	
	public Node(char data) {
		
		this.data = data;
	}
	
	public Node(double data) {
		
		this.datai = data;
	}
	
	//insert 
	public void insert(NewChar[] nch, char[] p) {
		if(nch.length > 1) {
			boolean isItBig = true;
			int toS =0,toE =1;
			if(nch.length <=1) {
				
			}
			while(isItBig){
				if(sumToStart(nch,toS) > sumToEnd(nch,toE)) {
					NewChar[][] aa = new NewChar[2][];
					aa = brake(nch, toE);
					R.insert(aa[0], p);
					L.insert(aa[1], p);
				}else {
					toS++;
					toE++;
				}
				
			}
			
			
		}
		
	}
	
	public double sumToEnd(NewChar[] nch, int n) {
		double sum = 0;
		for(int i = n; i<nch.length; i++) {
			sum = nch[i].amunt + sum;
		}
		return sum;
		
	}
	
	public double sumToStart(NewChar[] nch, int n) {
		double sum = 0;
		for(int i = 0; i<=n; i++) {
			sum = nch[i].amunt + sum;
		}
		return sum;
		
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
	
	
	
	public NewChar[] remove(NewChar[] ch) {
		
		NewChar[] nch = new NewChar[ch.length -1];
		
		for (int i = 0; i<nch.length; i++) {
			nch[i] = ch[i+1];
		}
		
		
		return nch;
	}
	
	public void print() {
        print("", this, false);
    }

    public void print(String prefix, Node n, boolean isLeft) {
        if (n != null) {
            System.out.println (prefix + (isLeft ? "|-> " : "\\-> ") + n.data+" "+ Arrays.toString( n.path ));
            print(prefix + (isLeft ? "|   " : "    "), n.L, true);
            print(prefix + (isLeft ? "|   " : "    "), n.R, false);
        }
    }
    
    
    public char[] add(char[] ch, char cta) {
    	char[] nch = new char[ch.length + 1];
    	
    	for(int i =0; i<ch.length; i++) {
    		nch[i] = ch[i];
    	}
    	nch[nch.length -1] = cta;
		return nch;
    }
	
	

}
