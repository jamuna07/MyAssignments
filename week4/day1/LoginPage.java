package week4.day1;

public class LoginPage extends BasePage {
	
	@Override
	public void performCommonTasks() {
		super.performCommonTasks();
	}
	
	public static void main(String[] args) {
		LoginPage methodOverride=new LoginPage();
		methodOverride.findElement();
		methodOverride.clickElement();
		methodOverride.enterText();
		methodOverride.performCommonTasks();

	}

}
