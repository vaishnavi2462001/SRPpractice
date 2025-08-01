package Facadedesignpattern;

public class Theaterparameter {

	public static void main(String[] args) {
		Dvdplayer dvd=new Dvdplayer();
		Projector proj=new Projector();
		Lights light=new Lights();
		Sound sound=new Sound();
		
		Theater thear=new Theater(dvd,light,proj,sound);
		
		System.out.println("Movie getting started_______");
		thear.watchmaovie("THE SUITS");
		

		thear.endmovie();
		System.out.println("Movie ended_______");

	}

}
