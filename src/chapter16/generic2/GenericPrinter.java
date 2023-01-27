package chapter16.generic2;

public class GenericPrinter<G extends Material> {
	
	
	private G material;
	
	public G getMaterial() {
		return material;
	}

	public void setMaterial(G material) {
		this.material = material;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material.toString();
	}
	
	
	
	

}
