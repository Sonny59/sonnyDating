package com.projet.dating.services;

import com.projet.dating.entities.Address;
import com.projet.dating.repositories.AddressRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    private final AddressRepos ar;

    @Autowired
    public AddressService(AddressRepos ar) {
        this.ar = ar;
    }

    public List<Address> getAllAddress(){
        return ar.findAll();
    }
    public Address saveAddress(Address adr){ return ar.save(adr); }


    //CRUD
    public Optional<Address> findById(Long idAdr){
        return ar.findById(idAdr);
    }

    public void delete(Address adr){
        ar.delete(adr);
    }

    public void create(Address adr){
        ar.save(adr);
    }

    public void update(Address adr) { ar.save(adr);}
}
