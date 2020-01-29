package fr.gtm.cinema.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import fr.gtm.cinema.dao.FilmDAO;
import fr.gtm.cinema.dto.FilmDTO;
import fr.gtm.cinema.entities.Film;

@Singleton
public class CinemaService {
	@EJB private FilmDAO filmDao ;
	
	public List<FilmDTO> getAllFilmDto(){
		List<Film> films = filmDao.findAllFilms();
		List<FilmDTO> allfilms = new ArrayList<FilmDTO>();
		for(Film f: films) {
			allfilms.add(new FilmDTO(f));
		}
		return allfilms;	
	}
}