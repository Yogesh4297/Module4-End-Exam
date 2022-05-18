class Car{

	private int year;
	private String make;
	private double speed;
	
	Car(int year, String make, double max_speed){
		this.year=year;
		this.make=make;
		this.speed=max_speed;
	}
	public int getyear(){
		return this.year;
	}
	public string getmake(){
		return this.make;
	}
	public double getspeed(){
		return this.speed;
	}
	public void accelerate(){
		this.speed++;
	}
}

class Racetrack{
	public static void main(String... args){
		
		Car C1= new Car(2022,"TOYOTA_Legender",180.0);
		Car C2= new Car(2021,"TOYOTA_Fortuner",160.0);
		Car C3= new Car(2020,"TOYOTA_INNOVA",140.0);
		System.out.println(c1.getyear()+""+c1.getspeed()+""+c1.getmake());
		System.out.println(c2.getyear()+""+c2.getspeed()+""+c2.getmake());
		System.out.println(c3.getyear()+""+c3.getspeed()+""+c3.getmake());
		
		c1.Accelerate();
		c2.Accelerate();
		c3.Accelerate();
		
		System.out.println(c1.getspeed());
		System.out.println(c2.getspeed());
		System.out.println(c3.getspeed());
	}	
}