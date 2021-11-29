public class Monster {
	public int health = 20;
	public boolean alive = true;
	public int damage;

	// we will probably not need this
	public Monster() {
	}
	public void damage(int hurtPoints) {
                health -= hurtPoints;
                if (health <= 0)
                        alive = false;
        }
	public int attack(Protagonist a) {
		damage = (int) (Math.random() * 6); // random int in random [0, 5)
		a.health -= damage;
		if (a.health < 0)
			a.alive = false;
		return damage;
	}
	public boolean isAlive() {
		return alive;
	}
}
