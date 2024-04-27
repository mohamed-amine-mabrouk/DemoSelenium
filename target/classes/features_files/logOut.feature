 @logout
 Feature: je souhaite me déconnecter de lapplication
 
  Scenario: je souhaite me déconnecter de lapplication
    Given je me connecte sur lapplication SWAGLABS
    When je saisis le username {string}
    And je saisis le mot de passe {string}
    And je clique sur le bouton login
    And je clique sur le menu
    And je clique sur logout
    Then je me dirige vers la page login
    

 