package huffmanCodeProject;

public class Node {
	
	NewChar data;
	Node R;
	Node L;
	
	
	public Node(NewChar data) {
		
		this.data = data;
	}
	
	public void insert(NewChar[] nch) {
		boolean 
		
		if(nch[0].amunt >= sum(nch,1)) {
			
		}
		
	}
	
	public double sum(NewChar[] nch, int n) {
		double sum = 0;
		for(int i = n; i<nch.length; i++) {
			sum = nch[i].amunt + sum;
		}
		return sum;
		
	}
	

}
