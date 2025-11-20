

Ce schéma montre comment est organisée l’architecture MyCA côté **parcours client CA**, c’est‑à‑dire tout ce qui se passe entre l’écran vu par le client et les briques techniques qui gèrent réellement les crédits.

À gauche, on voit le **client CA** qui se connecte via son navigateur au portail MyCA, avec une authentification gérée par l’IdP/groupe (SSO du groupe Crédit Agricole).
Son navigateur consomme un **micro‑front‑end Vue.js** (partie "FRONT") qui affiche les écrans et envoie les actions de l’utilisateur, pendant qu’un **micro‑front‑end Node.js** côté serveur orchestre les appels vers les API, la sécurité et les tags de communication.

Au centre, MyCA ne parle pas directement aux applications de back‑office : il passe par un ensemble d’**API CACF** exposées derrière un niveau d’API management (**APIM ISKM**).
Ces API sont spécialisées par usage : API de **synthèse** pour récupérer la vue globale du crédit, API lisant la **liste des mouvements**, API d’**utilisation standard** du crédit, API de **changement de jour d’échéance**, API de **remboursement**, API de **rétarification**, etc., chacune correspondant à une fonctionnalité métier disponible dans le parcours client.

À droite, on trouve le **COM** (couche de communication / bus) qui relaie les appels des API vers les différents **systèmes métier** : outils de gestion des contrats, moteur de stratégie / tarification, outils d’assurance, applications de suivi et d’exploitation. [1]
Concrètement, lorsqu’un client fait une action dans MyCA (par exemple modifier sa mensualité ou utiliser son disponible), le micro‑front appelle l’API correspondante, l’API passe par le COM, puis le COM appelle la bonne application métier, avant de renvoyer la réponse jusqu’à l’écran du client.

Les flèches de couleurs représentent les différents **types de flux** : nouveaux flux créés pour la refonte MyCA, flux CARMEN existants réutilisés, flux internes entre briques CACF et flux externes entre MyCA et le reste du SI.
L’idée générale est que le parcours client CA dans MyCA repose sur une façade d’API claire et stable, ce qui permet de faire évoluer le front (micro‑front‑ends) sans impacter directement les applications de gestion de crédit en profondeur.
