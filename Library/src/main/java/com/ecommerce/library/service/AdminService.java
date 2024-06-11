package library.service;


// Importation des classes nécessaires pour le DTO et le modèle Admin
import library.dto.AdminDto;
import library.model.Admin;

public interface AdminService {
    //Méthode pour trouver un administrateur par son nom d'utilisateur.
    Admin findByUsername(String username);

    //Méthode pour sauvegarder un nouvel administrateur.
    Admin save(AdminDto adminDto);

}
