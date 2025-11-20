

Ce schéma représente l’architecture technique globale entre CATS, Internet, l’extranet CACF et le réseau interne (CARMEN / VLAN Cloud), c’est‑à‑dire tous les “sauts” réseau que franchissent les flux de RenouvUtil entre les serveurs CACF et les utilisateurs.

### Vue générale des zones  
En haut du schéma, une légende rappelle les grandes zones : zone Users CACF, zone CACF, zone CA‑GIP et zone CATS, chacune étant colorée pour distinguer les périmètres réseau.
Le corps du schéma est découpé horizontalement en plusieurs blocs : à gauche les serveurs CATS, au centre la zone Internet et l’extranet CACF, à droite la zone CARMEN puis, en bas, le VLAN Cloud PROD / intranet avec les serveurs d’applications et les gateways.

### Zone CATS (gauche du schéma)  
Tout à gauche, le bloc **CATS** regroupe les serveurs applicatifs qui exposent les services de crédit, derrière un périmètre réseau dédié. [1]
Les flux sortants de CATS traversent un premier niveau de filtrage (pare‑feu / équipements réseau) pour rejoindre la zone Internet, ce qui permet de contrôler et sécuriser les appels vers l’extérieur.

### Traverse Internet et accès extranet CACF  
Au centre, la grande zone **INTERNET** montre que les flux CATS passent par des équipements de type routeurs/ADSL ou frontaux de sécurité avant d’atteindre la zone "CACF Internet – Zone extranet". [1]
Dans cette zone extranet CACF, on voit les équipements frontaux (par exemple un cluster d’accès sécurisé) qui hébergent les entrées HTTP(s) publiques de CACF et font le lien entre Internet et le cœur du SI via des règles de filtrage et de routage. [1]

### Colonne CARMEN (cœur réseau CACF)  
À droite de la zone extranet se trouve la colonne **CARMEN**, qui symbolise le backbone réseau interne du groupe, protégée par des pare‑feu à l’entrée et à la sortie.
Tous les flux applicatifs qui doivent atteindre le SI interne (bases de données, applications métier) traversent CARMEN, ce qui permet de centraliser le contrôle réseau entre les différentes zones (extranet, intranet, data centers, etc.).

### VLAN Cloud PROD – Intranet (serveurs applicatifs)  
Dans la partie basse/des captures zoomées, le bloc **VLAN Cloud – PROD – Intranet** contient les serveurs d’applications (par exemple plusieurs nœuds **WSO2 Gateway** et des gateways techniques supplémentaires) sur lesquels tournent les frontaux d’API et de routage.
Ces gateways reçoivent les appels en provenance d’Internet / extranet via CARMEN, appliquent les règles de sécurité (authentification, contrôle de headers, routage d’URL) puis redirigent les requêtes vers les bons services back‑end ou vers CATS selon la configuration.

### Accès aux données et aux utilisateurs internes  
On voit aussi, en bas à droite, un bloc de type **proxy / base de données / utilisateur CACF**, ce qui illustre que, depuis ce VLAN Cloud intranet, les flux peuvent soit aller vers des bases et proxys internes, soit être consommés directement par des utilisateurs CACF sur leur poste interne.
L’ensemble montre que la production repose sur une chaîne : CATS → Internet → extranet CACF → CARMEN → VLAN Cloud PROD (gateways et services) → données internes et utilisateurs, chaque maillon étant isolé dans sa zone avec des pare‑feu et équipements réseau dédiés.
