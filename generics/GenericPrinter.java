package generics;

public class GenericPrinter<T extends Material> {
	private T material; // T 자료형으로 선언함
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}

}
