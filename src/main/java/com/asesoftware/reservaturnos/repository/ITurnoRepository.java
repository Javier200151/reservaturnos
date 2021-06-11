package com.asesoftware.reservaturnos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.asesoftware.reservaturnos.entity.Turno;

public interface ITurnoRepository extends JpaRepository<Turno, Integer>{
	
	@Query(value = "SELECT * FROM turnos WHERE turnos.id_servicio=:id_servicio", nativeQuery = true)
	List<Turno> findByIdServicio(@Param("id_servicio") Integer id_servicio);
		
}
