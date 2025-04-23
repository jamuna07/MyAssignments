package week3.day2;

public class CheckBoxButton extends Button{
	public void clickCheckButton() {
		System.out.println("Check Button");

	}
	public static void main(String[] args) {
		CheckBoxButton checkButton=new CheckBoxButton();
		checkButton.click();
		checkButton.setText("Inheritance1");
		checkButton.submit();
		checkButton.clickCheckButton();
		
	}

}
