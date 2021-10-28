/*
package com.springsimplespasos.universidad.universidadbackend.repositorios;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Aula;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Pabellon;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.enumeradores.Pizarron;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorioAula")
public interface AulaRepository extends CrudRepository {

    @Query("select A from Aula a where a.pizarron = ?1")
    Iterable<Aula>buscarAulasPizarron(Pizarron pizarron);

    @Query("select A from Aula a join a.pabellon where a.pabellon = ?1")
    Iterable<Aula>buscarAulasPabellon(String nombre_pabellon);

}
*/
