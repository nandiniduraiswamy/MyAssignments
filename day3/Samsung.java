package week3.day3;

public class Samsung extends AndroidTV{

	public void playVideo() {
		System.out.println("video played");
		
	}
	public static void main(String[] args) {
		Samsung obj=new Samsung();
		obj.openApp();
		obj.playVideo();
	}

}
