/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import Repository.ReservationRepository;
import java.util.Optional;
import models.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
public class ReservationController {
    @Autowired                                                            //inicializar repositorio
    ReservationRepository repository;
    
    @GetMapping("/reservacion")
    public Iterable<Reservation> findAll(){
         return repository.findAll();
    }
    @PostMapping("/reservacion")
    public void saveId(@RequestBody Reservation res){
       repository.save(res);
       //return "ok"; 
    } 
    @GetMapping("/reservacion/{documento}")
    public Optional<Reservation> getDocumento (@PathVariable Long documento){
        //return repository.findByDocumento(documento);
        return repository.findById(documento);
    }
    //6832918 
    @PutMapping("/reservacion")
    public String UpdateID (@RequestBody Reservation r){
        Long id = r.getId();
        if(repository.existsById(id)){
            Reservation actualizacion = repository.findById(id).get();
            //actualizacion.setId(r.getId());
            actualizacion.setFecha(r.getFecha());
            repository.save(actualizacion);
        } 
        else{
            repository.save(r);
        }
        return "ok";
    }
    @DeleteMapping("/reservacion/{id}")
    public String deleteId(@PathVariable Long id){
        repository.deleteById(id);
        return "ok";
    } 
}