package week3.Day1;

public class subClassAbstract extends LearnAbstract{


	public void Abstract() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method fimplemented");
	}
	
	public static void main(String args[]) {
		
		subClassAbstract objabstract = new subClassAbstract();
		objabstract.makeCall();
		objabstract.Abstract();
		
		
	}

}
