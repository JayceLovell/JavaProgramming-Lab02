package exercise3;

import java.math.BigDecimal;

public class Car {
	
	private String model;
	private BigDecimal price;
	private TypeOfCar type;
	
	public static enum TypeOfCar{
		SUBCOMPACT,
		COMPACT,
		MIDSIZE,
		FULLSIZE
	}
	
public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public void setPrice(BigDecimal price,BigDecimal discount)
	{
		BigDecimal total = price.subtract(discount);
		this.price=total;
	}
	public void setPrice(BigDecimal price,BigDecimal discount,BigDecimal coupon)
	{
		price=price.subtract(discount);
		BigDecimal total=price.subtract(coupon);
		this.price=total;
	}

	public TypeOfCar getType() {
		return type;
	}

	public void setType(TypeOfCar type) {
		this.type = type;
	}
	public Car() {
	}

	
	public String toString() {;
		return "Car [model=" + model + ", price=" + price + ", Type="+ type+"]";
	}
	
}
