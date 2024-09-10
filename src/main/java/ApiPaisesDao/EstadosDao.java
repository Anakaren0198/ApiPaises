package ApiPaisesDao;


import org.springframework.data.jpa.repository.JpaRepository;

import ApiPaisesDominio.Estados;



public interface EstadosDao extends JpaRepository<Estados, Long> {

}
