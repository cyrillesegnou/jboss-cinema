package fr.gtm.cinema.dao;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.gtm.cinema.entities.Film;

@Singleton
public class FilmDAO extends AbstractDAO <Film, Long>{
	@PersistenceContext(name="cinema")private EntityManager em ;
		public FilmDAO() {
		super(Film.class);
		
	}
		
	public List<Film>findAllFilms (long idFilm){
		List<Film> films = em.createNamedQuery("Film.getAll", Film.class)
				.getResultList();
			
		return films;
		
	}
	public List<Film>getFilmByTitre (String titre){
		
String sql = "SELECT c FROM cinema";
		
		List<Film> films = em.createQuery(sql, Film.class)
										.setParameter("f", titre)
										.getResultList();
		
		return films ;
		
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

	public List<Film> findAllFilms() {
		// TODO Auto-generated method stub
		return null;
	}
}