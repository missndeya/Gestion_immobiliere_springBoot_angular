package com.projet.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Bien implements Serializable{
	@Id
	private int idbiens;
	private String nom;
	private String description;
	private double prix;
	private Date date;
	private Long nbpiece;
	private String categorie;
	private int idpers;
	@OneToMany(mappedBy = "bien",fetch = FetchType.LAZY)
	private Collection<Image> images;

	public Bien(int idbiens, String categorie, Date date, String description, Long nbpiece,  String nom, double prix, int idpers) {
		super();
		this.idbiens = idbiens;
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.date = date;
		this.nbpiece = nbpiece;
		this.categorie = categorie;
		this.idpers=idpers;
	}

	public Bien() {
		super();
	}

	public int getIdbiens() {
		return idbiens;
	}

	public void setIdbiens(int idbiens) {
		this.idbiens = idbiens;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getNbpiece() {
		return nbpiece;
	}

	public void setNbpiece(Long nbpiece) {
		this.nbpiece = nbpiece;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public int getIdpers() {
		return idpers;
	}

	public void setIdpers(int idpers) {
		this.idpers = idpers;
	}

	public Collection<Image> getImages() {
		return images;
	}

	public void setImages(Collection<Image> images) {
		this.images = images;
	}
}
