package webdev.services;

import java.sql.Clob;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import javax.sql.rowset.serial.SerialException;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import webdev.models.Diagram;
import webdev.repositories.DiagramRepository;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials="true")
public class DiagramService {
	@Autowired
	DiagramRepository diagramRepository;

	@GetMapping("/api/title/{title}")
	public Diagram getDiagramByTitle(@PathVariable("title") String title) {
		Optional<Diagram> optionalDiagram = diagramRepository.findDiagramByTitle(title);
		if(optionalDiagram.isPresent()) {
			Diagram diagram = optionalDiagram.get();
			return diagram;
		}
		return null;
	}
	
	@GetMapping("/api/titles")
	public List<String> getAllTitles() {
		Optional<List<String>> option = diagramRepository.findAllTitles();
		if(option.isPresent()) {
			List<String> titles = option.get();
			return titles;
		}
		return null;
	}
	
	@GetMapping("/api/input")
	public Diagram getInput() {
		Optional<Diagram> optionalInput = diagramRepository.findDiagramByTitle("input");
		if(optionalInput.isPresent()) {
			Diagram diagram = optionalInput.get();
			String input = diagram.getFlow();
			JSONObject inputObject = new JSONObject(input);
			input = inputObject.toString();
			diagram.setFlow(input);
			System.out.println(input);
			return diagram;
		}
		return null;
	}
	
	@PostMapping("/api/title")
	public Diagram addDiagram(@RequestBody String flow) throws SerialException, SQLException {
		System.out.println(flow);
		JSONObject bodyObject = new JSONObject(flow);
		Diagram diagram = new Diagram();
		diagram.setTitle(bodyObject.getString("title"));
		Optional<Diagram> oldDiagramOptional= diagramRepository.findDiagramByTitle(bodyObject.getString("title"));
		if (oldDiagramOptional != null) {
			diagram.setId(oldDiagramOptional.get().getId());
		}
		// Clob flowClob = new javax.sql.rowset.serial.SerialClob(flow.toCharArray());
		diagram.setFlow(flow);
		return diagramRepository.save(diagram);
	}
}