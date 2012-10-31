package bo.model;

public class Weapon {
	
	public enum Type {
		NORMAL,
		MARTIAL,
		EXOTIC
	}
	
	public enum WeightClass {
		LIGHT,
		HEAVY
	}
	
	public enum Weight {
		ONE_HANDED,
		TWO_HANDED
	}
	
	public class Range {
		public final int min;
		public final int max;
		
		public Range(int min, int max) {
			this.min = min;
			this.max = max;
		}
	}
	
	public final String name;
	public final Type type;
	public final WeightClass weightClass;
	public final Weight weight;
	
	public final Damage damage;
	public final Damage extraDamage; // do dual weapons
	public final Range critRange;
	public final int critMultiplier;
	public final int price;
	
	
	public Weapon(String name, Type type, WeightClass weightClass,
			Weight weight, Damage damage, Damage extraDamage, Range critRange,
			int critMultiplier, int price) {
		this.name = name;
		this.type = type;
		this.weightClass = weightClass;
		this.weight = weight;
		this.damage = damage;
		this.extraDamage = extraDamage;
		this.critRange = critRange;
		this.critMultiplier = critMultiplier;
		this.price = price;
	}
	
}
