package ApiPaisesDominio;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "ESTADOS")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Estados {

	
	
	
	
	

		// Mapear los campos
		@Id
		@Column(name = "ID")
		private Long id;
		@Column(name = "NOMBRE")
		private String nombre;
		@Column(name = "CLIMA")
		private String clima;
		

		// FetchType --- Con esto le indicamos que la relacion debe ser cargada al
		// momento

		// Cardinalidad --- Muchos modelos pertenecen a un marca
		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "ID_PAISES")
		Estados estado;


		public Estados() {
			
		}


		public Estados(Long id, String nombre, String clima, Estados estado) {
		
			this.id = id;
			this.nombre = nombre;
			this.clima = clima;
			this.estado = estado;
		}


		@Override
		public String toString() {
			return "Estados [id=" + id + ", nombre=" + nombre + ", clima=" + clima + ", estado=" + estado + "]";
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getClima() {
			return clima;
		}


		public void setClima(String clima) {
			this.clima = clima;
		}


		public Estados getEstado() {
			return estado;
		}


		public void setEstado(Estados estado) {
			this.estado = estado;
		}
		
		
		
		
		
}






