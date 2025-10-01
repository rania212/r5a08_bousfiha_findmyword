Rania bousfiha groupe Hauméa

Question 9 :

    Pourquoi le test est-il fail ?
    Quel est le code de production qu'il faut modifier pour passer à l'étape verte ?

réponse: 

Le test `should_check_one_incorrect_letter` passe parce qu'il dépend uniquement de la structure de données, pas de la logique spécifique de la méthode `guess`. Tant que `guess` renvoie un `Score` (même si c'est un objet "vide" ou mal initialisé), le test peut réussir en comparant la valeur retournée. Le test pour la lettre correcte échoue parce que la méthode `guess` n'est pas encore correctement implémentée, et comme on etourne `null`.

Pour résoudre ce problème et faire en sorte que le test `should_check_one_correct_letter` passe, on doit implémenter correctement la méthode `guess` pour qu'elle renvoie un objet `Score` avec les bonnes valeurs (`Letter.CORRECT` ou `Letter.INCORRECT`)


# r5a8_junit_tests

## Dépôt pour les séances de tavail pratique pour la ressource R5A08 qualité de développement

