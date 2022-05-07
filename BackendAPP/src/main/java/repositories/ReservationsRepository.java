package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Reservations;

public interface ReservationsRepository extends JpaRepository<Reservations, Long> {
	List<Reservations> findByPublished(boolean published);
	List<Reservations> findByTitleContaining(String title);
	List<Reservations> findByCanchaContaining(String cancha);
	List<Reservations> findByHoraContainingOrderByHoraAsc(String hora);
	
}
