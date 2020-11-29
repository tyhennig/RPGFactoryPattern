

public class WeaponFactory {

	public Weapon getWeapon(String name)
	{
		if(name.equalsIgnoreCase("Sword"))
		{
			return new Sword();
			
		} else if(name.equalsIgnoreCase("Club"))
		{
			return new Club();
		}
		
		return null;
	}
}
