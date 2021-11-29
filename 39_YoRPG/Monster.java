public class Monster {
	public int health = 20;
	public boolean alive = true;
	public int damage;
	public Monster() {
	}
	


          
        public void damage(int hurtPoints) {
                health = (health - hurtPoints);
                if (health <= 0)
                        alive = false;
        }


	public boolean isAlive() {
		return alive;
	}

        public int attack(Protagonist he) {
		damage = (int) (Math.random() * 6); // random int in random [0, 5)
		he.health -= damage;
		if (he.health < 0)
		      he.alive = false;
		return damage;
	}

}
