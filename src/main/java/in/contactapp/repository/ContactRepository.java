package in.contactapp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.contactapp.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Serializable> {

}
