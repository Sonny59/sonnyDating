package com.projet.dating.repositories;

import com.projet.dating.entities.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepos extends JpaRepository<Picture,Long> {
}
