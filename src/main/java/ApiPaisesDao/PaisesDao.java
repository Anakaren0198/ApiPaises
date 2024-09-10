package ApiPaisesDao;
import org.springframework.data.jpa.repository.JpaRepository;



import ApiPaisesDominio.Paises;

public interface PaisesDao extends JpaRepository<Paises, Long> {

}
