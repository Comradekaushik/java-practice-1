public class wrapperClasses {
    public static void main(String[] args){

        //In Java, wrapper classes are used to wrap primitive data types and convert them into objects. Here’s why they’re useful:

		
        // 1. Conversion: Wrapper classes allow you to convert primitive data types (like int, double, etc.) into objects.
        // 2. Method Support: You can call methods on wrapper objects (e.g., compareTo(), equals(), toString()).
        // 3. Collections: Collections (e.g., ArrayList, Vector) store only objects, so wrapper classes help when working with data structures.
        // wrapper class = 	provides a way to use primitive data types as reference data types
		//					reference data types contain useful methods
		//					can be used with collections (ex.ArrayList)
		
		//primitive		//wrapper
		//---------		        //-------
		// boolean		Boolean
		// char			Character
		// int			Integer
		// double		Double
		
		// autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
		// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
		
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
        

    }
    
}
