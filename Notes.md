# 🧩 **Fiche mémo – Point Teams migration Java 8 → 17**

## 🎯 Objectif du point

> Obtenir un **chiffrage révisé, ferme et réaliste**, sans passer par un spike.
> Faire **reconnaître** que la complexité du projet précédent **ne s’applique plus** ici.

---

## ⚙️ **Contexte clé à rappeler dès le départ**

* Le projet tourne sous **Spring + WAR + Tomcat**, sans changement d’architecture.
* Le framework **Havana est déjà compilé en Java 17**.
* La **chaîne CI/CD est stable** et déjà compatible Maven 3 / JDK 17.
* Le but est **une montée de version**, pas une refonte fonctionnelle.

🗣️ *Phrase d’ouverture possible :*

> “Notre besoin, c’est d’avoir un macro chiffrage réaliste et directement intégrable à la planif. On n’a pas de phase exploratoire prévue, donc il faut qu’on se base sur les éléments tangibles du projet.”

---

## 💡 **4 arguments clés à placer dans la discussion**

| #     | Argument                           | Phrase à utiliser                                                                                                   |
| ----- | ---------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| **1** | **Havana déjà migré**              | “La version Java 17 d’Havana existe déjà, donc la partie framework ne nécessite aucune adaptation spécifique.”      |
| **2** | **Même architecture et packaging** | “On reste en WAR sous Tomcat, donc le packaging et la livraison ne changent pas.”                                   |
| **3** | **Build et dépendances maîtrisés** | “La migration se limite à la mise à jour des `source/target` et des dépendances Maven — pas de refonte du build.”   |
| **4** | **Tests ciblés**                   | “On n’introduit aucun changement métier, donc une campagne de non-régression ciblée sur les flux critiques suffit.” |

🎯 → Ces quatre points forment **le socle de ton argumentaire**.
Si tu les tiens fermement, le chiffrage à 152 j/h devient **objectivement difficile à défendre**.

---

## 📊 **Estimation réaliste à défendre**

> 💬 “Sur des projets similaires (Spring + WAR + Havana + Tomcat), la montée Java 8 → 17 se chiffre plutôt autour de **20 à 30 j/h maximum**, en comptant les tests et la validation.”

Si on te demande *“d’où vient ce chiffre”* :

> “C’est basé sur le retour d’expérience des équipes qui ont déjà fait la migration avec la même version d’Havana. Le vrai travail réside surtout dans la recompilation et la vérification de compatibilité, pas dans la refonte.”

---

## 🧠 **Leviers de négociation**

| Situation                                          | Réplique stratégique                                                                                                                                                                                    |
| -------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| On te parle du projet précédent comme référence    | “Justement, il a servi de pilote. Aujourd’hui, on part sur une version stable d’Havana et on évite les mêmes écueils.”                                                                                  |
| Ils défendent la prudence du chiffrage             | “Je comprends, mais 152 j/h correspond à une refonte complète. Là, on est sur une montée technique maîtrisée.”                                                                                          |
| Ils évoquent des risques CI/CD                     | “Le pipeline reste inchangé, juste un ajustement du JDK dans les agents — c’est une opération standard.”                                                                                                |
| Ils bottent en touche ou veulent garder le chiffre | “OK, mais dans ce cas, j’ai besoin qu’on explicite ligne par ligne ce qui justifie 150 jours, pour qu’on le documente dans la macro.” (→ tu les forces à détailler = souvent ils revoient à la baisse). |

---

## 🧭 **Structure de ton discours**

1. **Rappel du contexte et de l’objectif** (on veut un chiffrage ferme, pas de spike).
2. **Revue rapide du chiffrage initial** (“vous aviez ventilé comment les 152 jours ?”).
3. **Challenger point par point avec les 4 arguments.**
4. **Convergence vers 20–30 j/h.**
5. **Clôture claire :**

   > “Ok parfait, je retiens ces éléments, je vais intégrer un chiffrage consolidé autour de 25 jours pour la macro.”

---

## 🗣️ **Phrase de clôture (forte mais diplomate)**

> “Merci à vous deux pour les échanges, c’est beaucoup plus clair.
>
> Au vu des éléments qu’on vient d’aligner, on va partir sur un chiffrage global autour de 25 jours, qui reflète la réalité du contexte et les simplifications liées à Havana 17.
>
> Si jamais on identifie un point bloquant pendant la phase d’intégration, on le documentera à part, mais pour le macro, on garde cette base.”
