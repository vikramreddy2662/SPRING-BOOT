package inversion_control.myproject;

public class Iphone implements Mobiles {
	Color color;

	public Iphone(Color color)
	{
		this.color=color;
	}
	public void modelAndVersion() {
		System.out.println("iphone 15 pro max:9");
		color.getIphoneColor();
	}

	public void price() {

		System.out.println("it costs around $50");
	}

}
