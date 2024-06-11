package library.model;

import jakarta.persistence.*; // Importation des annotations JPA pour la persistance des données.
import lombok.AllArgsConstructor; // Génère un constructeur avec tous les champs comme paramètres.
import lombok.Data; // Génère les méthodes getters, setters, equals, hashCode et toString.
import lombok.NoArgsConstructor; // Génère un constructeur sans paramètres.
import org.springframework.core.SpringVersion; // Importation de la classe SpringVersion (non utilisée ici).



import java.util.Collection;


@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "admins")

public class Admin {
    // Identifiant unique de l'administrateur (clé primaire)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")// Annotation JPA pour spécifier le nom de la colonne associée à la propriété ("admin_id" dans ce cas)
    private long id;
    private String firstName;
    private String username;
    private String lastName;

    private String password;

    // Image de l'administrateur stockée en tant que BLOB
    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")

    private String image;

    // Collection de rôles associés à l'administrateur (relation ManyToMany)
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "admins_roles", joinColumns = @JoinColumn(name = "admin_id", referencedColumnName = "admin_id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id"))
    private Collection<Role> roles;


}
