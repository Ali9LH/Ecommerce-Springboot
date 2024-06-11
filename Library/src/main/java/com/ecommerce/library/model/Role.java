package library.model;

// Importation des annotations JPA pour la persistance des données en base de données
import jakarta.persistence.*;

// Importation des annotations Lombok pour réduire le code superflu
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data // Annotation Lombok pour générer les méthodes get, set...
@AllArgsConstructor // Annotation Lombok pour générer un constructeur avec tous les champs comme paramètre
@NoArgsConstructor // Annotation Lombok pour générer un constructeur sans paramètres
@Entity
@Table (name = "roles")
public class Role {

    // Identifiant unique du rôle (clé primaire)
    @Id // Annotation JPA pour identifier la propriété comme clé primaire

    @GeneratedValue(strategy = GenerationType.IDENTITY) // Annotation JPA pour la génération automatique de l'identifiant
    @Column(name = "role_id") // Annotation JPA pour spécifier le nom de la colonne associée à la propriété ("role_id" dans ce cas)
    private Long id;
    private String name;
}
