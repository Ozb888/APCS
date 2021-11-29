
public class Protagonist {
	public boolean alive = true;
	public String name;
	public int hit;
	public int health;
	
	public Protagonist(String newName) {
		name = newName;
	}

	public boolean isAlive() {
		return alive;
	}
	public void damage(int hurtPoints) {
		health -= hurtPoints;
		if (health <= 0)
			alive = false;
	}
	  
	public int attack(Monster dam) {
		hit = (int) (Math.random() * 10);
		dam.damage(hit);
		return hit;
	}
	public String getName() {
		return name;
	}
}
