package com.mpaiement.mpaiement.dao;


import com.mpaiement.mpaiement.model.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementDao extends JpaRepository<Paiement, Integer>{

    Paiement findByidCommande(int idCommande);
}
