package week6.day1;

public class Automation extends MultipleLangauge {

	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.Java();
		auto.Selenium();
		auto.python();
		auto.ruby();

	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium -Test tool");
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java- Language");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby - abstract");
	}

}
