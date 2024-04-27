
@login
Feature: Test de la fonctionalite de lauthetification de lapplication SWAGLABS
  En tant que utilisateur je souhaite tester la page de connexion de lapplication SWAGLABS
Background:
Given je me connecte sur lapplication SWAGLABS
  @connexion-cas-passant
  Scenario: Je souhaite tester la connexion avec un cas passant
   
    When je saisis le username "standard_user"
    And je saisis le mot de passe "secret_sauce"
    And je clique sur le bouton login
    Then je me dirige vers la page daccueil "Products"
    
    @connexion-cas-non-passant
  Scenario: Je souhaite tester la connexion avec un cas passant
  
    When je saisis le username "amine"
    And je saisis le mot de passe "amine123"
    And je clique sur le bouton login
    Then un message derreur saffiche "Epic sadface: Username and password do not match any user in this service"
    
    @login-config-file
    Scenario: Je souhaite tester la connexion avec un cas passant
   
    When je saisis le username
    And je saisis le mot de passe
    And je clique sur le bouton login
    Then je me dirige vers la page daccueil "Products"