package ApiPaisesDominio;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "PAISES")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Paises {

	
	
	
	
	

		// Mapear los campos de la tabla

		@Id
		@Column(name = "ID")
		private Long id;
		@Column(name = "NOMBRE")
		private String nombre;
		@Column(name = "IDIOMA")
		private String idioma;
		

		// mappedBy---con esto realizamos la relacion de las entidades
		// @JsonIgnore---con esto le decimos que vamos ignorar una lista de propiedades

		// Cardinalidad ---- 1 marca tiene muchos modelos
		@OneToMany(mappedBy = "paises", cascade = CascadeType.ALL)
		@JsonIgnore
		List<Paises> lista = new ArrayList<>();


		public Paises() {
			
		}


		public Paises(Long id, String nombre, String idioma, List<Paises> lista) {
			
			this.id = id;
			this.nombre = nombre;
			this.idioma = idioma;
			this.lista = lista;
		}


		@Override
		public String toString() {
			return "Paises [id=" + id + ", nombre=" + nombre + ", idioma=" + idioma + ", lista=" + lista + "]";
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


		public String getIdioma() {
			return idioma;
		}


		public void setIdioma(String idioma) {
			this.idioma = idioma;
		}


		public List<Paises> getLista() {
			return lista;
		}


		public void setLista(List<Paises> lista) {
			this.lista = lista;
		}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
