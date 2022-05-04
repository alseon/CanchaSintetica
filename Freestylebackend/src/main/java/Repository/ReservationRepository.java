/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import java.util.Optional;
import models.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Usuario
 */
@Repository 
public interface ReservationRepository extends CrudRepository<Reservation,Long> {

    @Override
    public void delete(Reservation entity);

    @Override
    public void deleteById(Long id);

    @Override
    public Iterable<Reservation> findAll();

    @Override
    public Iterable<Reservation> findAllById(Iterable<Long> ids);

    @Override
    public boolean existsById(Long id);

    @Override
    public Optional<Reservation> findById(Long id);

    @Override
    public <S extends Reservation> S save(S entity);
    
}
