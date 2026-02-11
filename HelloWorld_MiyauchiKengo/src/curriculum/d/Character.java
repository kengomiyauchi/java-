package curriculum.d;

public class Character {

	 protected String name;
	    protected int hp;
	    protected int at;
	    protected int sp;

	    public Character(String name, int hp, int at, int sp) {
	        this.name = name;
	        this.hp = hp;
	        this.at = at;
	        this.sp = sp;
	    }

	    public void attack(Character opponent) {
	        opponent.hp -= this.at;
	        System.out.println(this.name + " の攻撃！");
	        System.out.println(opponent.name + " のHPは " + opponent.hp + " になった！");
	    }

	    public boolean isAlive() {
	        return hp > 0;
	    }
}
