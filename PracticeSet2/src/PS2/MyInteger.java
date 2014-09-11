package PS2;

public class MyInteger {
	
	private int value;
	
	//This is the constructor
	public MyInteger (int value){
		this.value = value;
	}
	
	//This is the "Getter"
	public int getValue (){
		return value;
	}
	
	public boolean isEven(){
		return (value % 2 == 0);
	}
	
	public boolean isOdd(){
		return (value % 2 != 0);
	}
	
	public boolean isPrime(){
		boolean prime = Primetest(value);
		return (prime);
		
	}
	
	private static boolean Primetest(long value){
//i hope this is the right equation for prime testing, all other prime methods will call this		
		if(value <= 3)
		     return value > 1;
		if(value % 2 == 0 || value % 3 == 0){
			return false;
		}
		for(int i = 5; i < Math.sqrt(value) + 1;i +=6){
			if(value % i == 0 || value % (i+2) == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(int value){
		return (value % 2 == 0);
	}
	
	public static boolean isOdd(int value){
		return (value % 2 != 0);
	}
	
	public static boolean isPrime(int value){
		boolean primeS = Primetest(value);
		return primeS;
	}
	
	public static boolean isEven(MyInteger MyInt){
		return (MyInt.value % 2 == 0);
	}
	
	public static boolean isOdd(MyInteger MyInt){
		return (MyInt.value % 2 != 0); 
	}
	
	public static boolean isPrime(MyInteger MyInt){
//work on this, could not figure it out, remembered to put in .get
		return MyInteger.Primetest(MyInt.getValue());
	}
	
	public boolean equals(int value){
		return (this.value == value);
	}
	
	public boolean equals(MyInteger MyInt){
		return (this.value == MyInt.getValue());
//why is there an error here, i cannot figure this one out
	}
	
	public static void ParseInt(char[] value){
//not sure what exactly is getting passed in to this method
		int[] charArray = char.length();
		int sum = 0;
		for (int i = 0, i < char.lenght; i = i + 1);
				sum = sum + Integer.parseInt(char[]);
	}
	
//i am not sure how to start the string parsing, I am having trouble with
//char parsing, new to java, only know python so far, hopefully this week
//office hours will help me understand this stuff :/
	
	
	
	
	
	
	
	
	
	
	

}
