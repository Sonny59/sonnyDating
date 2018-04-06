package com.projet.dating.repositories;

import com.projet.dating.entities.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbyRepos extends JpaRepository<Hobby,Long> {
}
