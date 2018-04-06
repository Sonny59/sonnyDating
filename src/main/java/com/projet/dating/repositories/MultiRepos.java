package com.projet.dating.repositories;

import com.projet.dating.entities.Multimedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MultiRepos extends JpaRepository<Multimedia,Long> {
}
