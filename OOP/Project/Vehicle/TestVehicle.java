public class TestVehicle{
	public static void main(String args[]){
		Vehicle[] vehicles={new Car("a","b",100),new Bike("c","d",1000)};
		for(Vehicle v:vehicles){	
			v.move();
		}
	}
}

/*
	Shape[] shapes={new Circle(),new Rectangle()};
	((colourable) shapes[0]).setColour("Blue");
	((colourable) shapes[1]).setColour("orange");
	for(Shape s:shapes){	
		s.draw();
	}
		
*/