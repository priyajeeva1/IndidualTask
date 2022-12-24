package interviewbasedquestion;

public class CubicalBox {

	public static void main(String[] args) {
		//all dimensions in centimeter
		double cubesize=20;
		double length=200;
		double breath=150;
		double width=100;
double cube=(cubesize*cubesize*cubesize);
double AreaofRectangle=length*breath*width;
System.out.println(cube);
System.out.println(AreaofRectangle);
System.out.println("number of cubes contain in a container is"+ ""+(AreaofRectangle)/(cube));


	}

}
