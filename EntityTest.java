class Entity {
	private String name;
	public Entity(String name) { this.name = name; }
	public String getName() { return name; }
	public void move() {
		System.out.println("I am " + name + ". Here I go!");
	}
}

class Playable extends Entity {
	public Playable(String name) {super(name); }
	public void move() {
		System.out.println("I am Playable " + getName() + ". Here we go!");
	}
}

class Ogre extends Entity {
	public Ogre(String name) { super(name); }
}

class Troll extends Entity {
	public Troll(String name) { super(name); }
}

class Prince extends Playable {
	public Prince(String name) { super(name); }
	//does not override public void move()
}

class Princess extends Playable {
	public Princess(String name) {super(name); }
	public void move() {
		System.out.println("I am Princess " + getName()
		+ ". Watch as I and my court move!");
	}
}

class Wizard extends Playable {
	public Wizard(String name) {super(name); }
	public void move() {
		System.out.println("I am Wizard " + getName()
		+ ". Watch me translocate!");
	}
}

public class EntityTest {
	public static void main(String[] args) {
		String[] names = { "Glogg", "Blort", "Gruff", 
				"Gwendolyne", "Snow White", "Diana", 
				"Merlin", "Houdini", "Charles", "George" };
		for (int i = 0; i < 10; i++) {
			int r = (int) (Math.random() * 5);
			Entity e = null;
			switch (r) {
			case 0: e = new Ogre(names[i]); break;
			case 1: e = new Troll(names[i]); break;
			case 2: e = new Wizard(names[i]); break;
			case 3: e = new Prince(names[i]); break;
			case 4: e = new Princess(names[i]); break;
			}
			e.move();
		}
	}
}