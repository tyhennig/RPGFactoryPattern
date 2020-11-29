
public class Club implements Weapon {

	int damage = 2;
	
	@Override
	public void attack(Entity entity) {
		// TODO Auto-generated method stub
		entity.takeDamage(damage);
	}

	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return damage;
	}

	

}
