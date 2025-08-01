package Facadedesignpattern;

public class Theater {

	private Dvdplayer dvd;
	private Lights light;
	private Projector proj;
	private Sound sound;
	
	public Theater(Dvdplayer dvd, Lights light, Projector proj, Sound sound) {
		this.dvd=dvd;
		this.light=light;
		this.proj=proj;
		this.sound=sound;
	}
	
	public void watchmaovie(String movie) {
		System.out.println("movie getting started_____");
		light.setdim(70);
		proj.seton();
		proj.widescreen();
		sound.seton();
		sound.setvolume(100);
		dvd.seton();
		dvd.play(movie);
	}
	
	public void endmovie() {
		System.out.println("movie ended and shutting down the Theater");
		dvd.setoff();
		sound.setoff();
		proj.setoff();
		light.seton();
	}
	
}
