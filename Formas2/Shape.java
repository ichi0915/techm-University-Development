package Formas2;

class Shape {
	private String color;

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getColorPublic() {
		return this.getColor();
	}
	protected String getColorProtected() {
		return this.getColor();
	}
}
class Shape2 extends Shape {
	public String getColorPublic() {
		return getColorProtected();
	}
}
