package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printByteBinary(byte b) {
	
		
		for (int i = 0; i < 8; i++) {
			
	if((b&1) == 1) {
		System.out.print(1);
	}else {
		System.out.print(0);
	}
	b = (byte) (b>>1);
	}
		
	System.out.println();
	System.out.println();
	
		
	}
	public void printShortBinary(short s) {
		for (int i = 0; i < 16; i++) {
			
			if((s&1) == 1) {
				System.out.print(1);
			}else {
				System.out.print(0);
			}
			s = (short) (s>>1);
			}
				
			System.out.println();
			System.out.println();
	}
	
	public void printIntBinary(int z) {
		for (int i = 0; i < 32; i++) {
			
			if((z&1) == 1) {
				System.out.print(1);
			}else {
				System.out.print(0);
			}
			z = z>>1;
			}
				
			System.out.println();
			System.out.println();
	}
	
	public void printLongBinary(long l) {
		for (int i = 0; i < 64; i++) {
			
			if((l&1) == 1) {
				System.out.print(1);
			}else {
				System.out.print(0);
			}
			l = l>>1;
			}
				
			System.out.println();
			System.out.println();
	}
	
	public static void main(String[] args) {
		
		BinaryPrinter bp = new BinaryPrinter();
		
	}
	
	
	BinaryPrinter(){
		Byte c = (byte) 01010101;
		Short s = 1000;
		int z= 20;
		long l = 17;
		System.out.println("correct is: "+c);
		printByteBinary(c);
		System.out.println("Correct is "+s);
		printShortBinary(s);
		System.out.println("correct is "+z);
		printIntBinary(z);
		System.out.println("correct is "+l);
		printLongBinary(l);
		
	}
	
	
}
