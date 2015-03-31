package main.domain;

public class Apple {
	private String color;
	private String volume;
	private String species;
	private String price;
	public Apple(String color, String volume, String species, String price) {
		super();
		this.color = color;
		this.volume = volume;
		this.species = species;
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Apple [color=" + color + ", volume=" + volume + ", species="
				+ species + ", price=" + price + "]";
	}
}
