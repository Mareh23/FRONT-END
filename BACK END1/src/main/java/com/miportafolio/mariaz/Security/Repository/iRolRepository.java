package com.miportafolio.mariaz.Security.Repository;

import com.miportafolio.mariaz.Security.Entity.Rol;
import com.miportafolio.mariaz.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
