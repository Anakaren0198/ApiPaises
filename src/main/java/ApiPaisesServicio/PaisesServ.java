package ApiPaisesServicio;

import java.util.List;

import ApiPaisesDominio.Paises;



public interface PaisesServ {

	
	
	public List<Paises> listar();

	public String guardar(Paises pais); // Validar que el id y nombre no se repita; id_marca exista

	public Paises buscar(Long id);

	public String editar(Paises pais); // Validar que el id exista y edi_marca exista

	public boolean eliminar(Long id); // Validar que el id exista
}
