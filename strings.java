public class strings {
    

        public static void main(String[] args) {
         
        // String = a reference data type that can store one or more characters
        //   reference data types have access to useful methods
         
         String name = "Broo";
         
        //  boolean result = name.equalsIgnoreCase("bro"); //compares
        //int result = name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf("o");
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim(); //empty space before and after is removed
         String result = name.replace('o', 'a');
          
         System.out.println(result);
        
        
       }
    
}
