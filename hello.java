 class Zi {
	 
	 
	 public static	void main (String[] args){
		 
		 
		// new    B();
		 
		 System.out.println("ยÞบบ");
	 B.method1(3);
		 new B(4).method(5);
		method(4);
		
		 
	 }
	 
	public	static  void  method (int a ){
			
			 System.out.println("method");
		}
		
		
		
 }
 
 
 
 
 interface  A{
	
 void  method (int a );
}

	
	    class B implements A {
			B(int a ){
				
			}
			 B a1= new B(3);
		
	public	 void  method (int a ){
			
			 System.out.println("method--BB");
			  System.out.println(a1);
			// a1.method(3);
		}
		
		 static	 void  method1 (int a ){
			
			 System.out.println("method1");
			 
		}
		
	}
