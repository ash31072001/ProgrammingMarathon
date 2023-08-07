package com.Wrapper;

public class WrapperClassConversion {

	public static void main(String[] args) {
		// byte data type to Byte object
		byte a = 10;
		Byte byteobj = new Byte(a);
		
		// integer data type to Integer object
		
		int b = 10;
		 Integer intobj = new Integer(b);
		 
		
		// float data type
	        float c = 18.6f;
	 
	    // wrapping around Float object
	    Float floatobj = new Float(c);
		
	    // double data type
        double d = 250.5;
 
        // Wrapping around Double object
        Double doubleobj = new Double(d);
 
        // char data type
        char e = 'a';
 
        // wrapping around Character object
        Character charobj = e;
        
     // printing the values from objects
        System.out.println(
            "Values of Wrapper objects (printing as objects)");
        System.out.println("\nByte object byteobj: "
                           + byteobj);
        System.out.println("\nInteger object intobj: "
                           + intobj);
        System.out.println("\nFloat object floatobj: "
                           + floatobj);
        System.out.println("\nDouble object doubleobj: "
                           + doubleobj);
        System.out.println("\nCharacter object charobj: "
                           + charobj);

        
        byte bv = byteobj;
        int iv = intobj;
        float fv = floatobj;
        double dv = doubleobj;
        char cv = charobj;
 
        // printing the values from data types
        System.out.println("\nUnwrapped values (printing as data types)");
        System.out.println("\nbyte value, bv: " + bv);
        System.out.println("\nint value, iv: " + iv);
        System.out.println("\nfloat value, fv: " + fv);
        System.out.println("\ndouble value, dv: " + dv);
        System.out.println("\nchar value, cv: " + cv);
        
	}

}
