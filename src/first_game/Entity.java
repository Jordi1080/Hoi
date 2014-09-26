package first_game;

public abstract class Entity {
	public double x,y;
	public double hspeed,vspeed;
	
	public void update() {
		x += hspeed;
		y += vspeed;
	}
	
	public abstract void step();
}
