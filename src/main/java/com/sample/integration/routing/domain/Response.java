package com.sample.integration.routing.domain;

/**
 * @author mugues.loc
 *
 */
public class Response {
	private String descrizione;

	public Response(String string) {
		this.descrizione = string;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return "Response [descrizione=" + descrizione + "]";
	}

	
}
