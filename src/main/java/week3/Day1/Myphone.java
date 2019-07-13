package week3.Day1;

//Main Class to call as Super Class,Base Class & Sub class(1 &2)
public class Myphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Android objAndroid = new Android();
        Apple objApple = new Apple();
        objAndroid.messageSend();
        objApple.messageReceive();
        objApple.messageSend();
        
        objAndroid.OS();
        objAndroid.dialCall();
        objAndroid.receiveCall();
        
        objApple.mac();
        objApple.dialCall();
        objApple.receiveCall();
		
        objAndroid.messageReceive();
       

	}

}
