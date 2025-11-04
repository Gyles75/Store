# 🎯 Objectif de ton point Teams

* Comprendre sur quoi repose le chiffrage de **152 j/h**.
* Identifier les hypothèses issues du **projet précédent**.
* Distinguer les **vrais risques techniques** de ceux déjà levés.
* Orienter la discussion vers une **démarche progressive (spike + ajustement)**.

---

## 🕐 **Déroulé complet du point (avec phrases prêtes à l’emploi)**

---

### 🗣️ **1. Ouverture – 1 à 2 minutes**

> “Salut [Prénoms], merci d’avoir pris un peu de temps.
>
> Je voulais qu’on prenne un moment pour discuter du chiffrage de 152 j/h pour la migration Java 8 → 17.
>
> J’ai vu que vous aviez déjà travaillé sur la migration d’un autre projet, [nom du projet similaire], donc je voulais justement profiter de votre retour d’expérience pour bien comprendre :
>
> * d’où viennent les principales difficultés que vous aviez rencontrées,
> * et voir ce qui est comparable ou différent dans notre contexte.”

🎯 Objectif : tu **valorises leur expérience**, tu mets la discussion sur **un terrain collaboratif et technique**.

---

### 🔍 **2. Compréhension du chiffrage – 3 minutes**

> “Pour bien qu’on parle du même périmètre, est-ce que vous pouvez me rappeler comment vous êtes arrivés à 152 jours ?
> Qu’est-ce qui a le plus pesé dans le chiffrage — la partie adaptation du code, la CI/CD, ou les tests ?”

🧠 Pendant qu’ils répondent :

* Note les points “lourds” (Havana, dépendances, build, tests…).
* Prépare tes relances pour chaque élément gonflé.

---

### ⚙️ **3. Focus sur le projet précédent – 4 minutes**

> “J’ai échangé un peu avec [nom du collègue] sur le projet [X], il m’a dit qu’il y avait eu pas mal de difficultés.
> Vous vous souvenez de ce qui avait posé le plus de problèmes ?”

*(Laisse-les parler.)*
Ensuite, enchaîne :

> “Et selon vous, ces problèmes étaient spécifiques à leur environnement ou on risque de retrouver les mêmes ici ?”

*(S’ils disent “oui, c’était spécifique”, tu enchaînes :)*

> “OK, donc on pourrait déjà éviter une bonne partie des galères qu’ils ont eues.”

*(S’ils disent “non, on risque de les retrouver”, tu demandes :)*

> “D’accord, mais la version de Havana qu’ils utilisaient, c’était déjà celle compilée en Java 17 ou une version antérieure ? Parce que dans notre cas, on part directement sur la 17, ce qui simplifie un peu.”

🎯 Objectif : **identifier et relativiser les écarts**.
Tu veux qu’ils reconnaissent que :

* les problèmes du projet précédent venaient d’un autre contexte (anciennes libs, CI instable, etc.),
* ton projet est dans un environnement plus stable.

---

### 💬 **4. Challenger calmement les points “gonflés” – 3 minutes**

#### a) S’ils évoquent Havana :

> “D’accord, mais comme la version Java 17 est déjà fournie et utilisée ailleurs, on n’aura pas à faire de portage interne, non ? Donc cette partie peut être réduite.”

#### b) S’ils parlent de CI/CD :

> “Ok, et sur la CI/CD, on garde la même chaîne, les mêmes jobs et le packaging WAR, donc il n’y a pas d’impact majeur côté pipeline ?”

#### c) S’ils parlent des tests :

> “Je comprends pour la prudence, mais là on n’a pas de changement fonctionnel, donc une non-régression technique ciblée devrait suffire, non ?”

🎯 À chaque réponse, reformule de manière à **suggérer la réduction de charge**, sans jamais contredire frontalement.

---

### 🧩 **5. Proposer ton plan concret – 3 minutes**

> “Je comprends mieux le contexte et les points de vigilance.
>
> Plutôt que de partir directement sur 152 jours, je me dis qu’on pourrait fonctionner en deux étapes :
>
> 1. **Spike technique sur 2–3 jours** → on teste la compilation avec Java 17 + la version récente de Havana.
> 2. On identifie précisément les points bloquants.
> 3. Puis on chiffre le correctif au réel, selon ce qu’on constate.
>
> Si on voit que ça coince comme sur le projet précédent, on ajuste.
> Si au contraire tout se passe bien, on aura économisé plusieurs semaines d’estimation inutile.”

🎯 Ici, tu **transformes la prudence en méthode mesurable**.
C’est difficile pour eux de s’y opposer, car tu leur donnes un cadre logique et sans risque.

---

### ✅ **6. Clôture – 1 minute**

> “Top, merci pour les échanges, c’est beaucoup plus clair.
>
> Je vous enverrai un petit CR avec cette proposition de spike et les points qu’on a identifiés.
>
> L’idée, c’est qu’on reste alignés et qu’on avance de manière pragmatique, sans refaire les erreurs du projet précédent.”

---

## 🧠 Tips comportementaux

| Situation                                      | Réponse adaptée                                                                                                      |
| ---------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| Ils insistent sur les risques                  | “C’est justement pour ça qu’un spike rapide est utile, pour objectiver les risques.”                                 |
| Ils disent “ça avait été long sur le projet X” | “Oui, mais ce projet a permis d’identifier ce qui coince, donc on peut capitaliser là-dessus.”                       |
| Ils semblent défensifs                         | “Je comprends, je ne cherche pas à remettre le chiffrage en cause, juste à l’ajuster avec ce qu’on sait maintenant.” |
| Ils admettent que c’est proche                 | “Parfait, ça confirme qu’on peut rationaliser un peu la charge.”                                                     |
