/**
 * 
 */
package exercise3;

import java.math.BigDecimal;

/**
 * @author Waynell Lovell
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Created default variables
		BigDecimal price=new BigDecimal(100.15);
		BigDecimal discount=new BigDecimal(10.00);
		BigDecimal coupon=new BigDecimal(20.00);
		
		System.out.println(createCar(price).toString());
		System.out.println(createCar(price,discount).toString());
		System.out.println(createCar(price,discount,coupon).toString());
	}
	public static Car createCar(BigDecimal price){
		Car car=new Car();
		car.setModel("Car1");
		car.setPrice(price);
		car.setType(Car.TypeOfCar.COMPACT);
		return car;
	}
	public static Car createCar(BigDecimal price,BigDecimal discount){
		Car car=new Car();
		car.setModel("Car2");
		car.setPrice(price,discount);
		car.setType(Car.TypeOfCar.FULLSIZE);
		return car;
	}
	public static Car createCar(BigDecimal price,BigDecimal discount,BigDecimal coupon){
		Car car=new Car();
		car.setModel("Car3");
		car.setPrice(price,discount,coupon);
		car.setType(Car.TypeOfCar.MIDSIZE);
		return car;
	}
}
