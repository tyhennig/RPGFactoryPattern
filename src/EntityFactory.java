
public class EntityFactory {

	Entity getEntity(String name)
	{
		if(name.equalsIgnoreCase("Zombie"))
		{
			return new Zombie();
			
		} else if(name.equalsIgnoreCase("Skeleton"))
		{
			return new Skeleton();
		}
		
		return null;
	}
}
