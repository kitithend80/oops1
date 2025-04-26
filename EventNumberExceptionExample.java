public class EventNumberExceptionExample {
	public static void checkNumber(int number)throws Exception{
		if(number %2==0){
			throw new Exception("Even Number is not allowed:"+number);
	}
		else{
		System.out.println("valid odd number:"+number);
	}
}
public static void main(String[]args){
	try{
		checkNumber(5);
	}catch(Exception e){
	System.out.println("Exception caught:"+e.getMessage());
    }
}
}