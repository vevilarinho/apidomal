package com.veronicavilarinho.apidomal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veronicavilarinho.apidomal.models.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
