package co.grandcircus.WeatherApi.model;

import java.util.Arrays;

/**
 * 
 * @author >>RanaSiroosian<<
 *
 */

public class data {

	public String[] text;

	public String[] getText() {
		return text;
	}

	public void setText(String[] text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "data [text=" + Arrays.toString(text) + "]";
	}

}
