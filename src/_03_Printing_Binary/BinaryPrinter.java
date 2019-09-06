package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printByteBinary(byte b) {
	int c = b;
		int z = 256;
		while(z != 1) {
	if(c>z) {
		z=z/2;
		System.out.println("1");
		c=c-z;
	}else {
	System.out.println(0);	
	}
	}
		
	
	
		
		
		
		
		
		
		
	}
	
	public void printShortBinary(short s) {
		
	}
	
	public void printIntBinary(int i) {
		
	}
	
	public void printLongBinary(long l) {
		
	}
	
	public static void main(String[] args) {
		
		BinaryPrinter bp = new BinaryPrinter();
		
	}
	
	
	BinaryPrinter(){
		Byte c = (byte) 01010101;
		System.out.println("correct is: "+c);
		printByteBinary(c);
	}
	
	
}
