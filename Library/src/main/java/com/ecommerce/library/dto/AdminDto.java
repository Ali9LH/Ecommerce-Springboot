package library.dto;

// Importation des annotations de validation de Jakarta pour les contraintes de taille
import jakarta.validation.constraints.Size;

// Importation des annotations de Lombok pour réduire le code boilerplate
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// Génère automatiquement les getters, setters, toString, equals, et hashCode methods @Data
@Data @NoArgsConstructor @AllArgsConstructor

// Génère un constructeur avec tous les arguments
public class AdminDto {
    // Size : Annotation pour spécifier la taille minimale et maximale du champ firstName
    @Size(min = 3, max = 10, message = "Invalid first name! (3-10 characters)")
    private String firstName;

    @Size(min = 3, max = 10, message = "Invalid last name! (3-10 characters)")
    private String lastName;

    private String userName;

    @Size(min = 5, max = 15, message = "Invalid password! (5-15 characters)")
    private String password;

    private String repeatPassword;
}