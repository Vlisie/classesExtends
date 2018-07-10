package bootjes;

public class Demo {
	public static void main(String args[]) {
		Schip schip1 = new Sleephopperzuiger();
		schip1.snelheid = 25;
		System.out.println("Snelheid sleephopperzuiger: " +schip1.snelheid + " knopen");
		Vrachtschip vrachtschip1 = new Sleephopperzuiger();
		Vrachtschip vrachtschip2 = new Containerschip();
		Containerschip vrachtschip3 = new Containerschip();
		System.out.println(vrachtschip3.aantalContainers);
	//	vrachtschip1.verschepen;
		System.out.println();	
	}
}
abstract class Schip{
	int snelheid;
	boolean drijft = true;
	boolean zeewaardig;
	abstract void varen();
}
class Zeilschip extends Schip{
	int aantalZeilen = 2;
	boolean buitenboordmotor;
	void varen() {
		System.out.println("Alleen als het waait");
	}
}
class Sloep extends Schip{
	int vermogen;
	void varen() {
		System.out.println("Op een plasje");
	}
}
abstract class Vrachtschip extends Schip{
	int massa;
	abstract void verschepen();
	void varen() {
		System.out.println("met vracht");
	}
}
class Containerschip extends Vrachtschip{
	int aantalContainers = 6000;
	void verschepen() {
		System.out.println("containers");
	}
}
class Sleephopperzuiger extends Vrachtschip{
	int kuubsZandpm = 100;
	void verschepen() {
		System.out.println("zand zuigen en dumpen");
	}
}