package com.projet.dating.repositories;

import com.projet.dating.entities.Appearence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepos extends JpaRepository<Appearence,Long> {
}
