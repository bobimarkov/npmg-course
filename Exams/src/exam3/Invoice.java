package exam3;

import java.time.Instant;
import java.util.Date;

public class Invoice {
	private String id;
	private Date createDate;
	private Date payDate;
	private Contragent createdby;
	private Contragent receivedby;
	private Position[] positions;
	
	public Invoice() {}
	
	public Invoice(String id, Date createDate, Contragent receivedby, Position[] positions ) {
		this.id = id;
		this.createDate = createDate;
		this.receivedby = receivedby;
		this.positions = positions;
	}
	
	public Invoice(String id,Date createDate, Date payDate, Contragent createdby, Contragent receivedby, Position[] positions) {
		this(id,createDate,receivedby,positions);
		this.payDate = payDate;
		this.createdby = createdby;
	}
	
	public static void main(String[] args) {
		Contragent contragents[] = {
				new Contragent("9823802323","Alex Alexiev","Planet Mars",false,"0123456789"),
				new Contragent("4343452335","Jupiter Computers LTD","Planet Jupiter",true,"9876543210")
		};
		
		Product products[] = {
				new Product("1dasd74s","Wireless Keyboard",32.34),
				new Product("42dkaddk","Playstation 4",424.32)
		};
		
		Position positions[] = {
				new Position(products[0].getCode(),12,Unit.UNIT),
				new Position(products[1].getCode(),2,Unit.UNIT)
		};
		
		Invoice i1 = new Invoice("001",Date.from(Instant.now()),Date.from(Instant.now()),contragents[0],contragents[1],positions);
		System.out.println(i1);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nId: ").append(id);
		builder.append("\nCreate Date: ").append(createDate);
		builder.append("\nPay Date: ").append(payDate);
		builder.append("\nCreated By: ").append(createdby);
		builder.append("\nReceived By: ").append(receivedby);
		builder.append("\nPositions:\n");
		for(int i=0;i<positions.length;i++) {
			builder.append(positions[i]);
		}
		return builder.toString();
	}
	
}
