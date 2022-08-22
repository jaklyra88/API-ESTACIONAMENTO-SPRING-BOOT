package br.com.jaklyra.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jaklyra.parking.model.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
}
