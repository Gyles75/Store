
Ce schéma décrit la cinématique complète d’authentification OpenID/OAuth entre l’utilisateur final, l’application source, un premier fournisseur OpenID de l’entreprise, éventuellement un second fournisseur, puis l’application métier qui consomme le jeton.   

Sur la ligne du haut, on voit les différentes colonnes : **End User**, **Application source**, **OpenID Provider 1**, **OpenID Provider 2** et la **Relying Party / Application** qui va utiliser le résultat de l’authentification.   
Le scénario commence quand l’application source envoie une **requête de lancement de l’IHM** vers la Relying Party, qui redirige ensuite le navigateur vers l’OpenID Provider 1 avec une **Authentication Request**.   

Le schéma précise que si l’utilisateur n’a pas encore de session ouverte, l’OP affiche l’**écran de login** et fait saisir l’identifiant/mot de passe ou le moyen d’authentification prévu.   
Si l’utilisateur n’a pas non plus de session d’identification valide côté entreprise, une étape de **consentement ou d’information** peut s’afficher, puis, une fois l’authentification réussie, l’OP renvoie une **Authentication Response** à l’application.   

Dans la partie centrale, on voit ensuite une ou deux étapes de **Token Request / Token Response** : la Relying Party appelle l’OpenID Provider pour échanger le code reçu contre un **ID Token** (et éventuellement un access token), avec vérification de l’ID Token (signature, audience, nonce, etc.).   
Le schéma montre aussi un second enchaînement “Token Request 2 / Token Response 2” vers un **OpenID Provider 2**, utilisé quand un second fournisseur doit être appelé (par exemple pour obtenir un jeton adapté à un autre domaine applicatif).   

En bas, les commentaires indiquent que si l’ID Token est **valide**, l’application peut créer ou mettre à jour la session utilisateur interne en se basant sur les claims (identité, rôles, contexte), puis retourner une **Authentication Response** finale à l’application source.   
Si au contraire l’ID Token est **invalidé** ou qu’une étape échoue (erreur, refus, session expirée), l’application doit renvoyer une erreur d’authentification à l’application source, qui décidera de l’affichage à l’utilisateur (message d’erreur, nouvelle tentative, etc.).
