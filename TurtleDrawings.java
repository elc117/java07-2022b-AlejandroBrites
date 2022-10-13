public class TurtleDrawings {

	public static void main(String[] args) {
		
		MyTurtle a = new MyTurtle();
		
		Pen b = new Pen();
		a.setPen(b);
		
		TurtleView v = new SwingTurtleView();
		a.setView(v);
		
		v.initialize();
		a.draw();

	} 
	
} 
