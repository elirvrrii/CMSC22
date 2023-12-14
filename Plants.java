package plantitspackage;

public abstract class Plants{
	String plantName;
	int waterReq;
	int sunReq;
	int buyPrice;
	int sellPrice;
	int diseaseLevel;

	public Plant(String plantName,
				int waterReq,
				int sunReq,
				int buyPrice,
				int sellPrice,
				int diseaseLevel) {
		this.plantName = plantName;
		this.waterReq = waterReq;
		this.sunReq = sunReq;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
		this.diseaseLevel = diseaseLevel;
	}

	public String getName() {
		return plantName;
	}

	public int getWaterReq() {
		return waterReq;
	}

	public int getSunReq() {
		return sunReq;
	}

	public int getBuyPrice() {
		return buyPrice;
	} 

	public int getSellPrice() {
		return sellPrice;
	}

	public int getDiseaseLevel() {
		return diseaseLevel;
	}
}

class Begonia extents Plant() {
	public Begonia() {
		super("Begonia", 100, 100, 100, 150, 20);
	}
}

class Hydrangea extents Plant() {
	public Hydrangea() {
		super("Hydrangea", 100, 20, 80, 130, 20);
	}
}

class Cactus extents Plant() {
	public Cactus() {
		super("Cactus", 20, 100, 50, 100, 20);
	}
}

class Lavender extents Plant() {
	public Lavender() {
		super("Lavender", 40, 60, 200, 250, 20);
	}
}

class Sunflower extents Plant() {
	public Sunflower() {
		super("Sunflower", 60, 80, 250, 300, 10);
	}
}
