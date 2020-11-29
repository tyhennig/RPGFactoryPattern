import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameDemo {

	
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		WeaponFactory weapFactory = new WeaponFactory();
		EntityFactory entFactory = new EntityFactory();
		List<Weapon> weapons = new ArrayList<>();
		List<Entity> entities = new ArrayList<>();
		
		
		Weapon weapon1 = weapFactory.getWeapon("sword");
		Weapon weapon2 = weapFactory.getWeapon("club");
		weapons.add(weapon1);
		weapons.add(weapon2);
		
		Entity ent1 = entFactory.getEntity("zombie");
		Entity ent2 = entFactory.getEntity("skeleton");
		entities.add(ent1);
		entities.add(ent2);
		
		Weapon selectedWeapon;
		int selection;
		
		while(true)
		{
			System.out.println("Current Living Entities: \n");
			for (Entity entity : entities) {
				
					System.out.println(entity.toString() + "  HP: " + entity.getHealth()); 

				}
			
			
			System.out.println("\nSelect Weapon:");
			
			int j = 0;
			for (Weapon weapon : weapons) {
				j++;
				System.out.println(j + ". " + weapon.toString() + "  DMG: " + weapon.getDamage());
				
			}
			
			
			do {
				selection = in.nextInt();
				
			} while (selection > j || selection < 1);
			
			selectedWeapon = weapons.get(selection - 1);
			
			System.out.println("Select Entity to Attack: \n");
			int i = 0;
			for (Entity entity : entities) {
				
				i++;
				System.out.println(i + ". " + entity.toString() + "  HP: " + entity.getHealth()); 
			}
			
			do {
				selection = in.nextInt();
			} while (selection > i || selection < 1);
			
			selectedWeapon.attack(entities.get(selection - 1));
			entities.removeIf(e -> (e.getHealth() < 1));
			
		}
		
		//in.close();
	}
}

