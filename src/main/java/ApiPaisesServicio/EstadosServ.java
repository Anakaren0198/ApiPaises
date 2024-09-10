package ApiPaisesServicio;

import java.util.List;

import ApiPaisesDominio.Estados;


public interface EstadosServ {

	

		
		public List<Estados> listar();

		public String guardar(Estados estado); // Validar que el id y nombre no se repita

		public Estados buscar(Long id);

		public boolean editar(Estados estado); // Validar que el id exista

		public boolean eliminar(Long id); // Validar que el id exista
}
