package com.projet.dating.repositories;

import com.projet.dating.entities.Situation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SituationRepos extends JpaRepository<Situation,Long> {
}
