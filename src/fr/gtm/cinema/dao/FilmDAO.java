package fr.gtm.cinema.dao;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.gtm.cinema.dto.FilmDTO;
import fr.gtm.cinema.entities.Film;

@Singleton
public class FilmDAO extends AbstractDAO <Film, Long>{
	@PersistenceContext(name="cinema")private EntityManager em ;
		public FilmDAO() {
		super(Film.class);
			}
			public List<FilmDTO> findAllFilms(){

					return em.createNamedQuery("Film.getAll", FilmDTO.class)
				.getResultList(); 
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
}