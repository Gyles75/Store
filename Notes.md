
### Schéma 1 – Parcours DigiConso Client dans l’architecture CACF

Ce schéma montre comment le **parcours DigiConso Client** s’insère dans l’architecture technique entre le monde LCL (front web client) et le monde CA/CACF.
L’idée est de visualiser que l’écran client DigiConso n’est qu’une “porte d’entrée” vers plusieurs briques back‑office qui gèrent les règles, les décisions, les documents et le stockage des dossiers.

En haut, la **“Partition maîtrisée pour le monde CA”** regroupe les briques centrales de CACF : BRMS (moteur de règles métier), LO, ELOQUENCE (gestion des courriers / documents), etc., toutes connectées à un bus ou une couche d’intégration appelée **CIM**.
CIM joue le rôle de chef d’orchestre : il reçoit les demandes venant de DigiConso et les route vers les bons moteurs (règles, décision, génération documentaire, stockage…).

Au centre, on voit le **Parcours DigiConso Client** qui discute principalement avec la brique **CEE** (cœur de la décision / des échanges crédit) et avec d’autres composants comme NPC ou NMB.
Les flèches en pointillés ou en continu montrent les flux entre le parcours client, CEE, CIM et les autres briques : selon l’étape (simulation, décision, génération d’offre…), CEE passe par CIM pour interroger BRMS, alimenter le quai de stockage ou déclencher de la gestion de documents.

En bas, sont représentés des **dispatchers B2B** qui font la jonction entre les flux NPC/NMB et les **webservices CATS / CAPFM** côté CACF. 
Concrètement, cela signifie que quand un client agit dans DigiConso (parcours self‑care), sa demande traverse ces dispatchers qui traduisent les appels front en appels WS techniques vers les systèmes CACF, tout en restant transparents pour l’utilisateur final.

***

### Schéma 2 – Parcours DigiConso Conseiller dans l’architecture CACF

Le deuxième schéma présente la même architecture vue du côté **Parcours DigiConso Conseiller**, c’est‑à‑dire quand le conseiller traite un dossier depuis ses outils (PUC, GED, etc.) plutôt que le client en direct.
On retrouve la même “Partition maîtrisée pour le monde CA” avec BRMS, LO, ELOQUENCE reliés à CIM, ce qui signifie que conseiller et client s’appuient sur les mêmes moteurs de décision et de documents.

Sur la gauche, sont ajoutées les briques propres au monde conseiller : **PUC** (poste utilisateur conseiller), **GED** (gestion électronique de documents) et d’autres outils du poste de travail.
Le **Parcours DigiConso Conseiller** se situe au centre et échange, comme pour le client, avec **CEE**, CIM et les autres briques CACF pour simuler, décider, générer les offres et stocker les dossiers.

En bas, on voit cette fois des **dispatchers B2B PUC** qui exposent des webservices **CATS** et **CAPFM** adaptés au monde conseiller. [2]
Cela illustre qu’un dossier lancé depuis PUC puis traité dans DigiConso suit un chemin technique très proche de celui d’un dossier client : les mêmes moteurs et les mêmes stockages sont utilisés, seule la “porte d’entrée” change (front conseiller au lieu de front client), via ces dispatchers spécifiques PUC.
