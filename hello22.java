 class DemoPerson  {
	 
	 
	 public static	void   main (String[] args){
		 System.out.println("第一步");
		//  System.out.println("第二步");
		 Person p = new Person();
		 p.eat(3,"women");
		  p.eat("women",3);
		 
	 }
	 

		
		
		
 }
 
 
 
 
 

	
	  class   Person  {

		Person(){
			 System.out.println(a);
			 System.out.println("调用person构造方法");
		}
		
		
	//	Person p1 = new Person();
		int a;
		{ System.out.println("第二步");
		System.out.println(a);
		}

		
		public void eat(String  a,int b){
			
			System.out.println("慢吃饭");
		}
		
		{ System.out.println("第三步");
		
		}
		public void eat( int a,String b){
			
			System.out.println("快吃饭");
		}
		
	}

	
	

	
	class Son extends Person {
		
		
		
		
		
	}
		
		