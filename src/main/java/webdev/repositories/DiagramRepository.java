package webdev.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import webdev.models.Diagram;

public interface DiagramRepository
	extends CrudRepository<Diagram, Integer> {

	@Query("SELECT title FROM Diagram d where d.title<>'input'")
	Optional<List<String>> findAllTitles();
	
	@Query("SELECT d FROM Diagram d WHERE d.title=:title")
	Optional<Diagram> findDiagramByTitle(
		@Param("title") String title);
}