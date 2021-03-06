import java.util.*;
public class Character extends GameObject
{
	Random generator = new Random();
	protected String description;
	protected HashMap<> responses;
	protected HashMap<> bodyParts;
	protected HashMap<> weapons;
	protected HashMap<> armors;
	protected HashMap<> attributes;
	protected HashMap<Skill> skills;
	protected HashMap<Effect> effects;
	protected HashMap<Ability> abilities;
	protected HashMap<Quest> quests;
	protected HashMap<Item> inventory;
	protected int level, coins, inventoryCapacity;
	
	public Character()
	{
		name = "Greg";
		description = "Just a regular guy living in a binary world";
		responses = new Dialogue;
		bodyParts = buildBody();
		attributes = buildAttributes();
		weapons = buildWeapons();
		armors = buildArmors();
		skills = buildSkills();
		effects = new ArrayList<Effect>;
		abilities = new ArrayList<Ability>;
		quests = new ArrayList<Quest>;
		inventory = new ArrayList<Item>();
		inventoryCapacity = 10;
		level = 1;
		coins = 100;
	}
	public BodyPart[] buildBody()
	{
		BodyPart[] body = new BodyPart[15];
		body[0] = new BodyPart("Head");
		body[1] = new BodyPart("Chest");
		body[2] = new BodyPart("Legs");
		body[3] = new BodyPart("Feet");
		body[4] = new BodyPart("Arms");
		body[5] = new BodyPart("Waist");
		body[6] = new BodyPart("Left Finger");
		body[7] = new BodyPart("Right Finger");
		body[8] = new BodyPart("Hands");
		body[9] = new BodyPart("Back");
		body[10] = new BodyPart("Shoulders");
		body[11] = new BodyPart("Neck");
		body[12] = new BodyPart("Accessory");
		body[13] = new BodyPart("Left Hand");
		body[14] = new BodyPart("Right Hand");
		return body;
	}
	public Attribute[] buildAttributes()
	{
		Attribute[] attribute = new Attribute[11];
		attribute[0] = new Attribute("Health","Your hit points",1,10);
		attribute[1] = new Attribute("Mana","Magic casting resource",1,10);
		attribute[2] = new Attribute("Energy","Physical ability resource",1,10);
		attribute[3] = new Attribute("Power","Damage with attacks",1,1);
		attribute[4] = new Attribute("Accuracy","Chance to hit",1,1);
		attribute[5] = new Attribute("Toughness","Health regeneration / Physical damage reduction",1,1);
		attribute[6] = new Attribute("Dexterity","Energy regeneration / Dodge chance",1,1);
		attribute[7] = new Attribute("Speed","Global cooldowns",1,1);
		attribute[8] = new Attribute("Stealth","Ability to remain hidden",1,1);
		attribute[9] = new Attribute("Concentration","Mana regeneration / magical resistance",1,1);
		attribute[10] = new Attribute("Crit","Chance to hit criticals",1,1);
		return attribute;
	}
	public Weapon[] buildWeapons()
	{
		Weapon[] weaponList = new Weapon[2];
		return weapon;
	}
	public Armors[] buildArmor()
	{
		Armor[] armor = new Armor[13];
		return armorList;
	}
	public Skill[] buildSkills()
	{
		Skill[] skill = new Skill[14];
		skill[0] = new Skill("Mining","Allows you to mine raw minerals from the world for smithing",1,1);
		skill[1] = new Skill("Herbalism","Allows you to locate and identify herbs for alchemy",1,1);
		skill[2] = new Skill("Fishing","Allows you to catch fish for cooking",1,1);
		skill[3] = new Skill("Skinning","Allows you to scavenge hides off of fallen animals",1,1);
		skill[4] = new Skill("Woodcutting","Allows you to gather wood for fletching",1,1);
		skill[5] = new Skill("Thieving","Your ability to successfully pick pockets and locks",1,1);
		skill[6] = new Skill("Smithing","Allows you to craft armor and weapons",1,1);
		skill[7] = new Skill("Alchemy","Allows you to mix herbs to create powerful potions",1,1);
		skill[8] = new Skill("Cooking","Allows you to cook and prepare food for various benefits",1,1);
		skill[9] = new Skill("Leatherworking","Allows you to craft armor and accessories",1,1);
		skill[10] = new Skill("Medicine","Allows you to craft healing potions and foods",1,1);
		skill[11] = new Skill("Fletching","Allows you to craft items out of wood",1,1);
		skill[12] = new Skill("Jewelcrafting","Allows you to create rings and necklaces",1,1);
		skill[13] = new Skill("Enchanting","Allows you to enchant armor and weapons",1,1);
		return skill;
	}
	public int getInventoryCapacity()
	{
		return inventoryCapacity;
	}
	public void setInventoryCapacity(int newInventoryCapacity)
	{
		inventoryCapacity = newInventoryCapacity;
	}
	public Item getItem(Item theItem)
	{
		return inventory.get(indexOf(theItem));
	}
	public void addItem(Item theItem)
	{
		if(inventory.size() < inventoryCapacity)
			inventory.add(theItem);
	}
	public void removeItem(Item theItem)
	{
		inventory.remove(theItem);
	}
	public Quest getQuest(Quest theQuest)
	{
		return quests.get(indexOf(theQuest));
	}
	public void addQuest(Quest theQuest)
	{
		quests.add(theQuest);
	}
	public void removeQuest(Quest theQuest)
	
		quests.remove(theQuest);
	}
	public void addEffect(Effect theEffect)
	{
		effects.add(theEffect);
	}
	public void removeEffect(Effect theEffect)
	{
		effects.remove(theEffect);
	}
	public void getEffect(Effect theEffect)
	{
		return effects.get(indexOf(theEffect));
	}
	public void addAbility(Ability theAbility)
	{
		abilities.add(theAbility);
	}
	public void removeAbility(Ability theAbility)
	{
		abilities.remove(theAbility);
	}
	public void getAbility(Ability theAbility)
	{
		abilities.get(indexOf(theAbility));
	}
	public Skill getSkill(String skillName)
	{
		for(int i = 0; i<skills.length; i++)
			if(skills[i].getName() == skillName)
				return skills[i];
		return null;
	}
	public Attribute getAttribute(String attributeName)
	{
		for(int i = 0; i < attributes.length; i++)
			if(attributes[i].getName() == attributeName)
				return attributes[i];
		return null;
	}
	public BodyPart getBodyPart(String bodyPartName)	
	{
		for(int i = 0; i < bodyParts.length; i++)
			if(bodyParts[i].getName() == bodyPartName)
				return bodyParts[i];
		return null;
	}
	public Weapon getWeapon(String weaponName)
	{
		for(
	}
	
	/**
	 * Gets the description of this character
	 * @return description the description for this character
	 */
	public String getDescription()
	{
		return description;
	}
	/**
	 * Sets the description of this character
	 * @param description the description for this character
	 */
	public void setDescription(String newDescription)
	{
		description = newDescription;
	}  
	/**
	 * Gets the dialogue for this character
	 * @return the first available unheard dialogue, or the default response
	 */
	public String getResponse()
	{
		return responses.getResponse();	
	}	
	/**
	* Allows you to set the speed the player has
	* @param newSpeed the new speed for the player
	*/
	public int getLevel()
	{
		return level;
	}
	/**
	* Allows you to set the level of the player
	* @param newLevel the level of the player
	*/
	public void setLevel(int newLevel)
	{
		level = newLevel;
	}
	public void addCoins(int coinsToAdd)
	{
		coins += coinsToAdd;
	}
	public void removeCoins(int coinsToRemove)
	{
		coins -= coinsToRemove;
	}
	public int getCoins()
	{
		return coins;
	}
	
	
	
}