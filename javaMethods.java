public class javaMethods {
    public static void main(String[] args){
        // method = a block of code that is executed whenever it is called upon
		
		int x = 3;
		int y = 4;
		
		int z = addition(x,y);

		System.out.println(z);
        System.out.println(printmyname("Karl","Venlix"));
	
    }
    static int addition(int a, int b) {
            
        int z = a + b;
        return z;
        
    }
    static String printmyname(String a, String b){
        System.out.println(a +" "+ b);
        return (a +" "+ b);

    }

    
    
}
