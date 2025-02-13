package cartes;

public enum Type {
	FEU("feu"),
	ESSENCE("essence"),
	CREVAISON("crevaison"),
	ACCIDENT("accident");
	
	private String type;
	
	private Type(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}

}
