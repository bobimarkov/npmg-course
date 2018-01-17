package exam3;

public class Position {
	public static long id_c = 0;
	public long id = id_c++;
	public String prID; 
	public long quantity;
	public Unit unit;
	
	public Position() {}
	
	public Position(String prID, long quantity, Unit unit) {
		this.prID = prID;
		this.quantity = quantity;
		this.unit = unit;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nId: ").append(id);
		builder.append("\nProduct ID: ").append(prID);
		builder.append("\nQuantity: ").append(quantity);
		builder.append("\nUNIT: ").append(unit).append("\n");
		return builder.toString();
	}
	
}
