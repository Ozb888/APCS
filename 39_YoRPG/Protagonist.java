
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
	public void specialize() {}      // confused about what this does
	public void normalize() {}       // also confused about what this does
	public int attack(Monster m) {
		hit = (int) (Math.random() * 6); // random hp damage range [0, 5)
		m.damage(hit);
		return hit;
	}
	public String getName() {
		return name;
	}
}
