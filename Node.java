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
	
	
	public void insert(NewChar[] nch, char[] p) {
		if(nch.length > 1) {
			
			System.out.println("insert");
			R = new Node(nch[0].ch);
			R.path = add(p,'1');
			L = new Node(sum(nch, 1));
			nch = remove(nch);
			p = add(p,'0');
			L.insert(nch,p);
		}
		
	}
	
	public double sum(NewChar[] nch, int n) {
		double sum = 0;
		for(int i = n; i<nch.length; i++) {
			sum = nch[i].amunt + sum;
		}
		return sum;
		
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
