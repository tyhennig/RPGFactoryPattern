
public abstract class DamageableEntity implements Entity {

	int health;
	int damage;
	
	public void takeDamage(int damage)
	{
		health -= damage;
	}
}
