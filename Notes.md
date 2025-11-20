Ce tableau résume, pour LCL, les grands moments où DigiConso appelle des webservices CACF pendant le parcours client, et à quoi servent ces appels sur chaque écran.

### Principe général du tableau  
- La colonne **Fonctionnalité** liste les écrans clefs du parcours (univers de besoins, informations, choix des caractéristiques, réponse, signature).
- La colonne **Appels de WS** décrit, pour chaque écran, les webservices CATS/CAPFI/CEE utilisés pour récupérer ou mettre à jour les données côté CACF.
### Ligne 1 – Ouverture de l’écran DigiConso « univers des besoins »  
- Quand l’écran univers de besoins s’ouvre, DigiConso appelle des WS CACF pour **rechercher le client** et rapatrier ses informations de base.
- L’objectif est que, dès cette première étape, le front LCL dispose d’une vision à jour du client/groupe pour proposer le bon type de besoin.

### Ligne 2 – Souscription (ouverture écran « Mes informations »)  
- À l’ouverture de l’écran Mes informations, plusieurs WS sont invoqués pour **restituer les données client, co‑titulaire / titulaire** et éventuellement mettre à jour certaines infos.
- C’est là que le front vérifie que les informations d’état civil, coordonnées, etc. sont cohérentes avec le référentiel CACF avant de poursuivre la souscription.

### Ligne 3 – Ouverture de l’écran DigiConso « Choix des caractéristiques »  
- Sur cet écran, les appels WS servent à **journaliser l’action** (trace technique) et à récupérer les paramètres nécessaires pour le choix des caractéristiques (plages de montants, durées, options).
- Concrètement, DigiConso interroge CACF pour savoir quelles combinaisons sont autorisées afin de ne pas proposer au client des configurations interdites

### Ligne 4 – Ouverture de l’écran DigiConso « Réponse »  
- Cette ligne regroupe plusieurs WS : contrôle des **pièces justificatives**, consultation de la **décision** et des motifs, mise à jour de l’état du dossier et du client si besoin.
- C’est ici que DigiConso va chercher la **réponse métier CACF** (accord, refus, étude, etc.) et les informations associées pour afficher au conseiller ou au client un écran de réponse complet.

### Ligne 5 – Signature électronique du dossier  
- La dernière ligne indique qu’au moment de la **signature électronique**, un WS dédié est appelé pour enregistrer l’opération de signature et lier l’ID de signature au dossier CACF.
- Ce webservice assure la traçabilité juridique de la signature (preuve associée au contrat) et permet ensuite de retrouver l’état de signature dans les systèmes CACF/LCL.
