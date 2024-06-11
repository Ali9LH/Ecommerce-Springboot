package library.repository;

// Importation des classes nécessaires de Spring Data JPA et du modèle Role
import library.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository <Role, Long> {

    //Méthode pour trouver un rôle par son nom.
    Role findByName(String name);

}
