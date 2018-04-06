package com.projet.dating.repositories;

import com.projet.dating.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepos extends JpaRepository<Address,Long> {
}
