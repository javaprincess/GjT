package sls.graph.nodes;

import java.io.Serializable;

public class Offer implements Serializable {

	private static final long serialVersionUID = -2496962806107395893L;
	private Long offerId;
	private Long propertyId;
	private Long amount;

	public Long getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Long propertyId) {
		this.propertyId= propertyId;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}
}
