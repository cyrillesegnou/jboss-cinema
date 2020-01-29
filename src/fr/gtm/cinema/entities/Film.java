package fr.gtm.cinema.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "films")
@SecondaryTable(name="resume", pkJoinColumns = @PrimaryKeyJoinColumn(name = "fk_film"))
	@NamedQuery (name = "Film.getAll", 
				query = "SELECT f FROM Film f")
	@NamedQuery(name = "Film.findByYear",
				query = "SELECT f FROM Film WHERE YEAR(f.datesortie) = :year)")


public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pk_film")
	private long id ;
	private String titre ;
	@Column(name="date_sortie")
	private Date dateSortie ;
	private int duree;
	@Column(name = "prixht")
	private double prix;
	private String vignette ;
	@Column(table = "resumes", name = "resume")
	private String resume ;
	
	public Film () {
		
	}
	
	public Film(String titre, Date dateSortie, int duree, double prix, String vignette) {
		super();
		this.titre = titre;
		this.dateSortie = dateSortie;
		this.duree = duree;
		this.prix = prix;
		this.vignette = vignette;
		
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

	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", dateSortie=" + dateSortie + ", duree=" + duree + ", prix="
				+ prix + ", vignette=" + vignette + "]";
	}
	}
