package operators;

public class Different_operators {

	public static void main(String[] args) {
		//addition
		int i=90;
		int b= i+20;
		System.out.println(b);
		
		//subtraction
		int x= 30;
		int c= x-20;
		System.out.println(c);
		
		//increment
		int g= 80;
		int k=++g;
		System.out.println(k);
		
		//decrement
		int m= 80;
		int n=--m;
		System.out.println(n);
		
		//true or false
		int p= 30;
		int q= 20;
		System.out.println(p>q);
		System.out.println(p<q);
		
		//&& operator
		int s= 30;
		int t= 20;
		System.out.println(s>t && t<s );
		
		// || operator
		int e= 30;
		int f= 20;
		System.out.println(e>10 || e<30);
		
		//! && (not and)
		int u= 30;
		int v= 20;
		System.out.println(! (u>v && u<v ));
		
	}

}
