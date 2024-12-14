package com.magazzino.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Articolo {
	
	@Id
	private int codice;
	
	private String descrizione;
	private int prezzo;

}
