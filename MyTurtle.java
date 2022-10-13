public class MyTurtle extends BaseTurtle {



	public void draw() {
  	
  		this.pause(2); 	
		this.reset();
		
		this.setDelay(20);
		
		
		pen.setColor(45, 0, 0); 
		pen.up(); 
		this.moveTo(0,0);
		
		for (int i = 0, j = 1; i < 360; i = i + j, j++) {
		
			pen.up();
			this.moveTo(0,0); 
			face(i);
			pen.down(); 
			this.forward(20); 
		
		}
  	
  		this.pause(2); 	
		this.reset();
		
		this.setDelay(10);
		
		
		pen.setColor(45, 0, 0); 
		pen.up(); 
		this.moveTo(0,0);
		
		for (int i = 0; i < 360; i = i + 2) {
		
			pen.up();
			this.moveTo(0,0); 
			face(i);
			pen.down(); 
			this.forward(20); 
		
		}
		
		this.pause(2); 	
		this.reset();
		
		pen.setColor(0, 0, 45); 
		pen.up(); 
		
		this.turn(45);
		
		for (int i = -30; i < 15; i++) {
		
			pen.up(); 
			this.moveTo(-10,i);
			pen.down(); 
			this.forward(40); 
		
		}
		
		this.turn(90);
		
		for (int i = -30; i < 30; i++) {
		
			pen.up(); 
			this.moveTo(i,-10);
			pen.down(); 
			this.forward(40); 
		
		}
		
		this.turn(315);
		
		for (int i = -10; i < 30; i++) {
		
			pen.up(); 
			this.moveTo(i,-10);
			pen.down(); 
			this.forward(40); 
		
		}
		
		this.turn(90);
		
		for (int i = -10; i < 30; i++) {
		
			pen.up(); 
			this.moveTo(10,i);
			pen.down(); 
			this.forward(40); 
		
		}
		
		this.pause(2); 	
		this.reset();
		
	}

}
