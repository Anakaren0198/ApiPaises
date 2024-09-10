package ApiPaisesControlador;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import ApiPaisesDominio.Estados;
import ApiPaisesServicio.EstadosImp;

@RestController
@RequestMapping(path = "EstadosWs")
@CrossOrigin

public class EstadosWs {
	@Autowired
	EstadosImp imp;

	// http://localhost:9000/EstadosWs/listar
	@GetMapping(path = "listar")
	public List<Estados> listar() {
		return imp.listar();
	}

	// http://localhost:9000/EstadosWs/guardar
	@PostMapping(path = "guardar")
	public ResponseEntity<?> guardar(@RequestBody Estados estados) {
		String response = imp.guardar(estados);

		if (response.equals("idExiste"))
			return new ResponseEntity<>("Ese id ya existe", HttpStatus.OK);
		else if (response.equals("nombreExiste"))
			return new ResponseEntity<>("Ese nombre ya existe", HttpStatus.OK);
		else {
			return new ResponseEntity<>(estados, HttpStatus.CREATED);
		}

	}

	// http://localhost:9000/EstadosWs/buscar
	@PostMapping("buscar")
	public Estados buscar(@RequestBody Estados estados) {
		return imp.buscar(estados.getId());
	}

	// http://localhost:9000/EstadosWs/editar
	@PostMapping("editar")
	public ResponseEntity<?> editar(@RequestBody Estados estados) {
		boolean response = imp.editar(estados);

		if (response == false)
			return new ResponseEntity<>("Ese id no existe", HttpStatus.OK);
		else {
			return new ResponseEntity<>(estados, HttpStatus.CREATED);
		}
	}

	// http://localhost:9000/EstadosWs/eliminar
	@PostMapping("eliminar")
	public ResponseEntity<String> eliminar(@RequestBody Estados estados) {
		boolean response = imp.eliminar(estados.getId());
		if (response == false)
			return new ResponseEntity<String>("Ese id no existe", HttpStatus.OK);
		else {
			return new ResponseEntity<String>("Registro eliminado con exito", HttpStatus.OK);
		}
	}

}
