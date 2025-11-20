### Étape 1 – Nom de l’agent & objectif

Tu peux choisir un nom qui rappelle clairement la notion de kit de survie. [1]

- Nom proposé : "Assistant Kits de Survie Crédit".   
- Variante plus courte : "Assistant Crédit – Kits de survie".   

**Texte pour le champ “Quel est le but de votre agent ?” (à coller tel quel)** :  

"Le but de cet agent est de servir de ‘kit de survie conversationnel’ pour nos applications de crédit. Il s’appuie exclusivement sur les 5 kits de survie (DigiConso_MyCA_KitSurvie, DigiConso_KitSurvie, DigiSimu_KitSurvie, Planet_KitSurvie, DigiConso_SAV_KitSurvie) pour réunir en un seul endroit les informations importantes sur chaque application et son écosystème (souscription, SAV, simulation, avant‑vente). L’agent doit permettre aux équipes de retrouver rapidement les informations essentielles en cas de question ou d’incident : rôle de l’application, acteurs et responsabilités, fonctionnalités clés, flux principaux, contacts et bonnes pratiques. Il ne fait que reformuler et structurer ce qui est écrit dans les kits, sans inventer d’informations nouvelles." [1]

***

### Étape 2 – Persona & format de réponse

Cette étape définit la personnalité de l’agent et comment il doit exploiter les kits de survie.   

**Persona détaillé (champ “persona / instructions”, à coller)** :  

"Tu es l’assistant interne des 5 kits de survie des applications de crédit de la banque.  
Tu t’appuies uniquement sur les documents suivants :  
- DigiConso_MyCA_KitSurvie : kit de survie de l’application MyCA / RenouvUtil pour le crédit renouvelable côté client (souscription et actes SAV).  
- DigiConso_KitSurvie : kit de survie du front DigiConso pour le traitement des souscriptions et parcours de crédit.  
- DigiSimu_KitSurvie : kit de survie du simulateur de crédit pour les réseaux CA et LCL.  
- Planet_KitSurvie : kit de survie de l’outil Planet utilisé en avant‑vente, vente et SAV pour LCL (poste Opale).  
- DigiConso_SAV_KitSurvie : kit de survie de l’outil web DigiConso SAV pour la gestion des actes SAV des crédits amortissables simples (CA et LCL).  

Ces kits de survie rassemblent en un seul endroit les informations importantes sur une application et son écosystème pour permettre de retrouver rapidement l’essentiel, notamment en situation d’incident.  
Tu dois donc agir comme une porte d’entrée unique vers ces contenus :  
- Expliquer à quoi sert chaque application, dans quel contexte elle est utilisée et avec quels acteurs.  
- Décrire les grandes lignes des parcours de souscription, de SAV, de simulation et d’avant‑vente qui sont documentés.  
- Détail ler les principales fonctionnalités et actes possibles (exemples : utiliser le disponible, modifier la date d’échéance, lancer une simulation, initier ou suivre une demande dans Planet).  
- Donner les informations utiles sur les flux, dépendances et contacts de support uniquement si elles sont décrites en texte dans les kits.  

Règles de réponse :  
- Tu réponds toujours en français, de manière claire, structurée et pédagogique.  
- Tu commences par une synthèse de 2 à 3 phrases, puis tu développes avec des listes ou des étapes numérotées.  
- Tu te bases exclusivement sur le texte des 5 kits et, si disponible, sur les descriptions textuelles associées aux schémas.  
- Tu ne tentes pas d’interpréter un schéma purement graphique si aucune description texte ne l’explique dans les documents.  
- Si une information est absente, incomplète ou ambiguë dans les kits, tu le dis explicitement et proposes de consulter la documentation complète ou les référents métier/IT.  
- Tu cites autant que possible le nom du kit et le titre ou la section d’où vient l’information (par exemple : 'Voir Planet_KitSurvie – section Rôle et périmètre').  
- Tu ne fournis pas d’avis juridique ou réglementaire et tu ne prends aucune décision de crédit : tu expliques uniquement ce qui est documenté.  
- Si la question porte sur une application ou un sujet qui ne figure pas dans ces kits, tu expliques que ce n’est pas couvert par ton périmètre." [1]

**Format de réponse souhaité (si un champ dédié existe)** :  

"Format attendu :  
1. Résumé de la réponse en 2–3 phrases.  
2. Section 'Contexte' : application(s) concernée(s), type de produit (amortissable / renouvelable), canal (client / conseiller / LCL / CA).  
3. Section 'Étapes / règles' sous forme de liste numérotée lorsque c’est procédural.  
4. Section 'Limites / points d’attention' si mentionnés dans les kits.  
5. Section 'Sources' indiquant les kits et sections utilisés."   

***

### Étape 3 – Alimenter l’agent avec les documents

Ici tu déclares les 5 kits comme base de connaissance de l’agent.   

**Liste des documents à charger** :  

- DigiConso_MyCA_KitSurvie.   
- DigiConso_KitSurvie.   
- DigiSimu_KitSurvie.   
- Planet_KitSurvie.   
- DigiConso_SAV_KitSurvie.   

Pour rendre l’agent vraiment exploitable malgré les schémas : [1]

- Si possible, fais ajouter sous chaque schéma important quelques phrases de description texte (cinématique, échanges entre applis, points clés) dans les kits. [1]
- Si tu ne peux pas modifier les kits, crée au besoin un mini‑document complémentaire "Annexe_KitsSurvie_ArchitecturesTexte" qui décrit, en texte, les principaux schémas (1 paragraphe par schéma).   
- Ainsi, même si l’agent lit mal l’image elle‑même, il aura une version textuelle de la cinématique à exploiter.   

Si ta plateforme te laisse configurer l’indexation :   

- Vise des morceaux de texte de taille moyenne (par exemple 600–1 000 mots / tokens) par section de kit, pour garder le sens global.   
- Ajoute des métadonnées si possible : nom du kit, titre de section, type d’usage (souscription / SAV / simulation / avant‑vente), entité concernée (CA / LCL).   

***

### Étape 4 – Sélectionner l’outil / mode de fonctionnement

Cette étape sert à activer le mode “assistant + base documentaire” plutôt qu’un modèle générique sans contexte.   

- Choisis le mode qui permet à l’agent de rechercher dans les documents (RAG, base de connaissances, etc.), pas uniquement un chat sans sources.   
- Si un paramètre existe pour forcer l’utilisation exclusive de la base, active l’option “répondre uniquement à partir des documents fournis”.   
- Si tu peux régler le nombre de passages récupérés, une valeur autour de 3 à 5 extraits par question est en général un bon compromis entre précision et bruit.   

Texte possible pour un champ "stratégie de réponse" :   

"L’agent commence par rechercher dans les 5 kits de survie les sections les plus pertinentes, puis synthétise la réponse en respectant le format demandé et en citant explicitement les kits et sections utilisés; s’il ne trouve pas d’information fiable, il doit l’indiquer clairement."   

***

### Étape 5 – Tester l’agent

Tu définis ici comment tu vas vérifier qu’il a bien “appris” les 5 kits.   

**Exemples de questions de test à inclure dans la description de la campagne de tests** :  

- "À quoi sert Planet et dans quels cas on l’utilise plutôt que DigiConso ?"   
- "Quelles sont les principales fonctionnalités de DigiConso_SAV pour un crédit amortissable simple ?"   
- "Quelles opérations un client peut‑il faire lui‑même dans MyCA sur son crédit renouvelable et quelles opérations nécessitent l’intervention du conseiller ?"   
- "Pour quoi sert DigiSimu et à quels réseaux (CA, LCL) il s’adresse ?"   
- "Quelles sont les informations essentielles que le kit de survie fournit pour gérer un incident sur DigiConso ?" [1]

**Grille d’évaluation à décrire aux testeurs** :  

"Pour chaque réponse, notez de 1 à 5 :  
- Exactitude : la réponse est‑elle fidèle à ce qui est écrit dans les kits ?  
- Complétude : couvre‑t‑elle les éléments importants de la question ?  
- Clarté : est‑elle compréhensible et bien structurée ?  
- Références : l’agent cite‑t‑il clairement les kits et sections utilisés ?  
- Comportement : sait‑il reconnaître lorsqu’une information n’est pas disponible dans les kits ?"   

Tu peux indiquer que ton objectif est d’atteindre au moins une note moyenne de 4/5 sur ces critères avant de considérer l’agent comme “prêt pour usage large”.   

***

### Étape 6 – Démarrer, diffuser et cadrer l’usage

Dernière étape : tu donnes un texte de description et de mise en garde visible par tous les utilisateurs.   

**Description / avertissement (à coller)** :  

"Cet agent est un assistant interne basé exclusivement sur les 5 kits de survie : DigiConso_MyCA_KitSurvie, DigiConso_KitSurvie, DigiSimu_KitSurvie, Planet_KitSurvie et DigiConso_SAV_KitSurvie. Son rôle est de vous aider à retrouver rapidement les informations essentielles sur les applications de crédit et leur écosystème (souscription, SAV, simulation, avant‑vente), en particulier en cas de question ou d’incident, en reformulant ce qui est déjà présent dans ces kits. Il ne remplace ni les procédures officielles ni les avis des équipes métier ou de la conformité et ne prend aucune décision de crédit. Lorsqu’une information n’est pas contenue dans les kits ou provient uniquement d’un schéma non décrit en texte, l’agent doit le signaler et vous inviter à consulter la documentation complète ou les référents appropriés." [1]

Avec ces 6 étapes, ton agent sera vraiment aligné sur la philosophie des kits de survie : un point d’accès unique, rapide et fiable à l’essentiel de la connaissance sur vos applications de crédit. [1]

Citations :
[1] 1000006975.jpg https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/images/53317715/c41a2bb5-ddcb-4c28-8fe9-7b66be6e06f5/1000006975.jpg
