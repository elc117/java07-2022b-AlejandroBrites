public class MyTurtle extends BaseTurtle {



	public void draw() {

  	//----------- Example 1:  A triangle ---------------
  	
  		this.pause(2); 	
		this.reset();
		
		pen.up(); 
		this.back(4);
		this.turn(270);
		this.forward(8); 
		pen.down(); 
		this.forward(8); 
		this.turn(90);
		this.forward(8); 
		this.turn(90);
		this.forward(8); 
		this.turn(90);
		this.forward(8); 
		

		


	//------------ Example 2: Many squares ------------------

		

	//------------- Example 3: Many lines ---------------
		
	}

	
}
