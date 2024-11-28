package org.example;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Initialiser le scanner
            int random_number = generateRandomNumber(1, 100); // Générer un nombre aléatoire

            System.out.println("Devinez le nombre aléatoire (entre 1 et 100) :");

            int user_number = 0; // Initialiser la variable pour stocker le choix du joueur

            // Boucle jusqu'à ce que l'utilisateur trouve le bon nombre
            while (user_number != random_number) {
                System.out.print("Entrez un nombre : ");
                user_number = scanner.nextInt(); // Lire l'entrée utilisateur

                // Vérifier si l'entrée est valide
                if (user_number < 1 || user_number > 100) {
                    System.out.println("Le nombre n'est pas valide. Veuillez entrer un nombre entre 1 et 100.");
                    continue; // Recommence la boucle
                }

                // Vérifier si le joueur a trouvé le bon nombre
                if (user_number == random_number) {
                    System.out.println("Félicitations ! Vous avez trouvé le bon nombre !");
                } else if (user_number < random_number) {
                    System.out.println("Trop bas ! Essayez encore.");
                } else {
                    System.out.println("Trop haut ! Essayez encore.");
                }
            }


            scanner.close(); // Fermer le scanner pour libérer les ressources
        }

        // Méthode pour générer un nombre aléatoire entre min (inclus) et max (inclus)
        public static int generateRandomNumber(int min, int max) {
            return (int) (Math.random() * (max - min + 1)) + min;
        }
    }
