package ApiPaisesServicio;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import ApiPaisesDao.EstadosDao;
import ApiPaisesDao.PaisesDao;
import ApiPaisesDominio.Estados;



@Service
public class EstadosImp implements EstadosServ {

	
	@Autowired
	EstadosDao dao;

	@Transactional(readOnly = true)
	@Override
	public List<Estados> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Transactional
	@Override
	public String guardar(Estados estado) {
		// TODO Auto-generated method stub
		String respusta = "";
		boolean bandera = false;

		for (Estados m : dao.findAll()) {
			if (m.getId().equals(estado.getId())) {
				respusta = "idExiste";
				bandera = true;
				break;
			} else if (m.getNombre().equals(estado.getNombre())) {
				respusta = "nombreExiste";
				bandera = true;
				break;
			}
		}

		if (bandera == false)
			dao.save(estado);

		return respusta;
	}

	
	@Transactional
	@Override
	public Estados buscar(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}
	@Transactional
	@Override
	public boolean editar(Estados estado) {
		// TODO Auto-generated method stub
		for (Estados m : dao.findAll()) {
			if (m.getId().equals(estado.getId())) {
				dao.save(estado);
				return true;
			}
		}
		return false;
	}

	
	
	@Transactional
	@Override
	public boolean eliminar(Long id) {
		// TODO Auto-generated method stub
		for (Estados m : dao.findAll()) {
			if (m.getId().equals(id)) {
				dao.deleteById(id);
				// dao.delete(m);
				return true;
			}
		}

		return false;
	}

	}

	


