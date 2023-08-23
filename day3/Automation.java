package week3.day3;

public class Automation extends MultipleLangauge implements Language,TestTool{

	
	public void Java() {
		System.out.println("Java language");
		
	}

	public void Selenium() {
		System.out.println("Selenium language");
		
	}
	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.python();
		obj.Ruby();
		obj.Selenium();
		obj.Java();

	}


}
