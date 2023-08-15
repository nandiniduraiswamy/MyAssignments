package week2.day1;

public class Car {
	public void driveCar() {
		System.out.println("driving");
	}
    private void applyBreak() {
        System.out.println("apply break");
    }
    boolean isPuncture(boolean var) {
		System.out.println(var);
		return var;
	}
    protected void soundHorn() {
		System.out.println("Sound Horn");
		
	}
    public static void main(String[] args) {
		Car obj=new Car();
		obj.applyBreak();
		obj.isPuncture(true);
		obj.soundHorn();
		obj.driveCar();
	}

}
