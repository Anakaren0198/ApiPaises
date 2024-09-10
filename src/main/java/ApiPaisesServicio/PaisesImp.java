package ApiPaisesServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import ApiPaisesDao.EstadosDao;
import ApiPaisesDao.PaisesDao;
import ApiPaisesDominio.Paises;
@Service
public class PaisesImp implements PaisesServ {
	
	
	@Autowired
	PaisesDao paisesDao;

	@Autowired
	EstadosDao estadosDao;

	@Transactional(readOnly = true)


	@Override
	public List<Paises> listar() {
		// TODO Auto-generated method stub
		return paisesDao.findAll();
	}
	@Transactional
	@Override
	public String guardar(Paises pais) {
		// TODO Auto-generated method stub
		paisesDao.findAll();
		estadosDao.findAll();
		return null;
	}
	
	@Override
	public Paises buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String editar(Paises pais) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
