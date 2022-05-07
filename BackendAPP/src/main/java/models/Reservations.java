package models;

import javax.persistence.*;

@Entity
@Table(name = "Reservations")
public class Reservations {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "published")
	private boolean published;
	
	@Column(name = "cancha")
	private String cancha;
	
	@Column(name = "hora")
	private String hora;

	public Reservations() {

	}

	public Reservations( String title, String description, String cancha, String hora, boolean published) {
		this.title = title;
		this.description = description;
		this.cancha = cancha;
		this.hora = hora;
		this.published = published;
		
		
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getCancha() {
		return cancha;
	}

	public void setCancha(String cancha) {
		this.cancha = cancha;
	}
	
	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean isPublished) {
		this.published = isPublished;
	}
	


	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description +", cancha=" + cancha+ ", hora=" + hora +", published=" + published +"]";
	}

}
