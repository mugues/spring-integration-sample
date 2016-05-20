package com.sample.integration.routing.domain;

import java.io.Serializable;

/**
 * @author Massimo Ugues
 * 
 */
public class GirocontoRequest implements Serializable{

	private static final long serialVersionUID = 384219951861984786L;
	
	private String rapportoAddebito;
	private String rapportoAccredito;
	private Double amount;
	
	public GirocontoRequest() {
		super();
	}
	public GirocontoRequest(String rapportoAddebito, String rapportoAccredito, double amount) {
		this.rapportoAddebito = rapportoAddebito;
		this.rapportoAccredito = rapportoAccredito;
		this.amount = amount;
	}
	public String getRapportoAddebito() {
		return rapportoAddebito;
	}
	public void setRapportoAddebito(String rapportoAddebito) {
		this.rapportoAddebito = rapportoAddebito;
	}
	public String getRapportoAccredito() {
		return rapportoAccredito;
	}
	public void setRapportoAccredito(String rapportoAccredito) {
		this.rapportoAccredito = rapportoAccredito;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "GirocontoRequest [rapportoAddebito=" + rapportoAddebito + ", rapportoAccredito=" + rapportoAccredito + ", amount=" + amount + "]";
	}
	
	

}
