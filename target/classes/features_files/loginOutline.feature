@loginOutline
Feature: Je souhaite me connecter avec plusieurs comptes a lapplication

  Scenario Outline: Je souhaite me connecter avec plusieurs comptes a lapplication SWAGLABS
    Given je me connecte sur lapplication SWAGLABS
    When je saisis le username "<username>"
    When je saisis le mot de passe "<password>"
    When je clique sur le bouton login

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |
