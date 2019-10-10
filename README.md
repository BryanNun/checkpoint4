# Wild Circus

Ce site web à été réalisé dans le cadre un checkpoint (bilan d'auto-évaluation), lors de la formation au sein de la wild code school

Elle permet à ses utilisateurs de consulter les évenements du wild circus.
Les utilisateurs peuvent : 
* se renseigner sur le cirque.
* voir les incontournables du cirque.
* savoir dans quelle ville passe le cirque.
* faire une demande de réservation.

## Installation

**Les logiciels à installer pour utiliser le projet :**
* JavaSpring
* Maven
* Mysql

**Création de la base de données**
-   Créer une base de données et un utilisateur avec les privilèges

Via MySql en ligne de commande :

```
CREATE USER 'newuser'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON * . * TO 'newuser'@'localhost';

```

Ou via un gestionnaire de bases de données (Workbench).

-   Créer un fichier application.properties avec les informations de la base, en suivant application.properties.example.

## Lancement du projet

Via le terminal de commandes :

```
mvn spring-boot:run

```

Ou via votre IDE si celui-ci le permet (Visual Studio Code par exemple).

Le projet sera disponible sur votre navigateur à l'adresse  **[http://localhost:8080/](http://localhost:8080/)**

## [](https://github.com/BryanNun/wildcircus)Tests

Pour lancer les tests :

```
mvn test
```
## Auteurs

-   **Bryan Nuninger**  -  _Développeur_ ([[https://github.com/BryanNun](https://github.com/BryanNun)])
