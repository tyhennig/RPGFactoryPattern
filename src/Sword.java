
public class Sword implements Weapon {

	int damage;
	
	public Sword() {
		damage = 5;
	}
	
	@Override
	public void attack(Entity entity) {
		entity.takeDamage(damage);
	}

	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return damage;
	}

	

}
