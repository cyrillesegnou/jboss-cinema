package fr.gtm.cinema.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import fr.gtm.cinema.dao.FilmDAO;



import fr.gtm.cinema.dao.FilmDAO;
import fr.gtm.cinema.entities.Film;

@Singleton
public class FilmService {
	@EJB private FilmDAO filmDao ;
	
	public List<Film> getAllFilm(){
		List<Film> films = filmDao.findAllFilms();
		List<Film> allfilms = new ArrayList<Film>();
		for(Film f: films) {
			allfilms.add(new Film(f));
		}
		return allfilms;		
	

}
