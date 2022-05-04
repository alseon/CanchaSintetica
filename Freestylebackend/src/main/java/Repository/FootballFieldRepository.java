/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import java.util.Optional;
import models.FootballField;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Repository 
public interface FootballFieldRepository extends CrudRepository<Service,Long> {

    @Override
    public void delete(Service entity);

    @Override
    public void deleteById(Long id);

    @Override
    public Iterable<Service> findAll();

    @Override
    public Iterable<Service> findAllById(Iterable<Long> ids);

    @Override
    public boolean existsById(Long id);

    @Override
    public Optional<Service> findById(Long id);

    @Override
    public <S extends Service> S save(S entity);
    
}
