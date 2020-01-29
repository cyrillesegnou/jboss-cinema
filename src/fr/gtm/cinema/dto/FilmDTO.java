package fr.gtm.cinema.dto;

import java.util.Date;
import fr.gtm.cinema.entities.Film;



public class FilmDTO {
	
	private long id ;
	private String titre ;
	private Date dateSortie ;
	private int duree;
	private double prix;
	private String vignette ;
	public FilmDTO(Film film) {
		
		
		this.id = film.getId();
		this.titre = film.getTitre();
		this.dateSortie = film.get.DateSortie();
		this.duree = film.getDuree();
		this.prix = film.getPrix();
		this.vignette = film.getVignette();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getVignette() {
		return vignette;
	}
	public void setVignette(String vignette) {
		this.vignette = vignette;
	}
	

}
