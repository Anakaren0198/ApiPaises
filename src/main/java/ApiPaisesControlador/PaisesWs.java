package ApiPaisesControlador;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ApiPaisesDominio.Paises;
import ApiPaisesServicio.PaisesImp;





@RestController
@RequestMapping(path = "PaisesWs")
@CrossOrigin
public class PaisesWs {

	
	@Autowired
	PaisesImp imp;
	
	@GetMapping("listar")
	public List<Paises> listar(){
		return imp.listar();
}
}