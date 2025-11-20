Pour le parcours LCL, ces deux schémas montrent à quoi se connecte DigiConso quand un client ou un conseiller utilise le parcours, et comment les échanges techniques sont routés vers les briques CACF.

### Schéma 1 – Parcours DigiConso Client LCL  

Ce schéma représente l’architecture “vue de LCL” quand un client utilise le parcours DigiConso Client.
En haut, la “Partition maîtrisée pour le monde LCL” regroupe les briques internes LCL (BRMS, LO, ELOQUENCE) qui portent les règles, la logique d’offre et la génération de courriers/documents.

Au centre, la barre **CIM** fait office de bus d’intégration : elle relie ces briques LCL au **Parcours DigiConso Client** et à la brique **CEE**, qui gère les échanges crédit avec CACF.
Le parcours DigiConso Client s’appuie donc sur CEE pour envoyer les demandes vers CACF et récupérer les décisions ou informations nécessaires au traitement du dossier.

En bas, on voit la “Couche pour l’exposition des WS CAPFM et LCL”, ainsi que des composants comme **Bee** et **NotifyLead**.
Cette couche d’exposition permet de transformer les actions faites dans l’interface client en appels webservices, à la fois vers les systèmes CACF (via CAPFM) et vers les systèmes LCL (notification, stockage ou pilotage commercial via NotifyLead).

### Schéma 2 – Parcours DigiConso Conseiller LCL  

Le second schéma décrit la même architecture côté **Parcours DigiConso Conseiller** pour LCL.
La partie haute “Partition maîtrisée pour le monde LCL” est strictement la même : BRMS, LO et ELOQUENCE sont partagés entre le parcours client et le parcours conseiller.

Au centre, on trouve cette fois le **Parcours DigiConso Conseiller**, toujours connecté à **CEE** et à **CIM**, ce qui signifie que conseiller et client exploitent les mêmes moteurs de décision, de règles et de documents.
Les flux partent du front conseiller (Oxygène, CEC, ETAP) et remontent vers DigiConso, qui dialogue avec CEE et CIM pour piloter les traitements crédit.

En bas, la “Couche pour l’exposition des WS CAPFM et LCL” est de nouveau présente, mais cette fois orientée vers les outils LCL du conseiller (Oxygène, CEC, ETAP).
Concrètement, cela montre qu’un dossier initié et suivi par le conseiller à LCL traverse la même chaîne technique que le parcours client : seules les applications d’entrée/sortie changent, mais la logique de crédit centrale est commune.
