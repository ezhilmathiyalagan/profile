package com.personal;

public abstract class Vehicle implements Travel {

}
class Bus extends Vehicle{

	@Override
	public int getSpeed() {
		return 0;
	}
}
	class Cycle extends Vehicle{

		@Override
		public int getSpeed() {
			return 0;
		}
	}
class Truck extends Vehicle{

	@Override
	public int getSpeed() {
		return 0;
	}
	
}