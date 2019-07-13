package week1.Day1;

public class Mobile {
	
	public String sms(String contacts){
		
	return contacts;
		
	}
	
	public int call(int number) {
		
		return number;
	}

	private void gmail() {
		
		System.out.println("am in gmail");
	}
	
	
	public static void main(String[] args) {
		
		Mobile ms = new Mobile();
		String sms = ms.sms("siva");
		System.out.println(sms);
		int call = ms.call(5);
		System.out.println(call);
		ms.gmail();
		
		

	}

}
