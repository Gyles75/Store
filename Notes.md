
Le schéma montre comment l’authentification et le contexte utilisateur sont transmis depuis le portail NPC CATS jusqu’à RenouvUtil (MyCA) et aux API métier, en utilisant l’IDP CACF et des jetons de type OAuth2/OpenID.

Sur la partie haute, on voit les différentes colonnes techniques : **NPC CATS** à gauche, puis **IDP CACF**, puis **Front MyCA (navigateur)**, ensuite **MyCA (serverside)** et enfin les **API Business** à droite. [2]
NPC CATS appelle d’abord un webservice (bloc vert "MWS") vers l’IDP CACF en lui transmettant des informations comme le `sub` (identifiant utilisateur), un `userId`, un éventuel identifiant d’authentification IdP et des références de contrat (`codeContrat`, `numContrat`).

Ensuite, le navigateur lance l’**authentification client** auprès de l’IDP CACF, qui renvoie un **code d’autorisation** ("AZ Code" sur le diagramme), puis un **ID Token** contenant de nouveau le `sub` et le `userId`, avec un scope de type `user` pour autoriser l’accès aux services.
Ces informations sont récupérées côté **Front MyCA**, puis remontées vers **MyCA serverside**, où elles sont enrichies et consolidées : on retrouve le `sub`, un contexte OIDC (`imp_Oidcp`), les contextes applicatifs, l’IdP d’authentification et les références de contrat.

La zone rouge décrit trois **options de stockage** de ce contexte utilisateur pour la suite du parcours RenouvUtil :  
- **Option 1** : stocker les données dans des **cookies sécurisés**, afin que le navigateur les renvoie automatiquement à chaque appel.
- **Option 2** : stocker les données directement dans le **token** (par exemple un jeton JWT enrichi), que l’on transmet ensuite aux services aval.
- **Option 3** : utiliser un mécanisme de **bearerDataTransfer**, c’est‑à‑dire un portage explicite du jeton/porteur dans les appels vers les API Business.

En bas du diagramme, on voit que ce contexte (IDToken avec `sub`, `userId`, etc.) est finalement utilisé pour appeler les **API Business** en apportant la preuve d’authentification et l’identité de l’utilisateur, après un contrôle de type "scope" et de validité du jeton côté backend.
