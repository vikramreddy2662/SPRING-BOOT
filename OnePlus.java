package inversion_control.myproject;

public class OnePlus implements Mobiles {

	Color color;
	
	public OnePlus() {
		System.out.println("it's my new constructor");
	}
	
	public OnePlus(Color color) {
		this.color=color;
	}

	public void modelAndVersion() {
		System.out.println("Oneplus nord 9:12");
		color.getOnePlusColor();

	}

	public void price() {
		System.out.println("it costs around $20");

	}

}
