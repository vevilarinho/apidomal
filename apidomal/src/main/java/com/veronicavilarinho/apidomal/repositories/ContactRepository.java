package com.veronicavilarinho.apidomal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.veronicavilarinho.apidomal.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
