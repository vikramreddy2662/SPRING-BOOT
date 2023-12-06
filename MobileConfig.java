package inversion_control.myproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration /* states that this class belongs to @configuration annotation */
public class MobileConfig {

	@Bean // bean=>simple object

	public Color getColor() {
		return new Color();
	}
    @Bean
	public Mobiles getOnePlusObject(Color getColor) {
		return new OnePlus(getColor);
	}

	@Bean
	public Mobiles getIphoneObject(Color getColor) {
		return new Iphone(getColor);
	}

}
