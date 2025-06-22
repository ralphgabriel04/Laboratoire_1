

# Laboratoire 1

## Description

**Laboratoire 1** est un ensemble d’outils Java développés pour résoudre divers problèmes mathématiques et algorithmiques. Ce projet comprend trois modules principaux :

1. **ArrayToolbox** – Opérations sur des nombres représentés sous forme de tableaux.
2. **MatrixToolbox** – Multiplication de matrices et affichage formaté.
3. **Statistics** – Calculs statistiques de base sur des tableaux numériques.

Chaque module fonctionne indépendamment et peut être utilisé séparément selon les besoins.

---

## 📌 Modules Disponibles

### 1️⃣ ArrayToolbox

📂 **Fichier** : `ArrayToolbox.java`  
📜 **Description** : Additionne deux nombres représentés sous forme de tableaux d'entiers.  
🎯 **Fonctionnalités** :
- Addition de nombres sous forme de tableaux
- Gestion des retenues
- Résultat retourné sous forme d'entier

📌 **Exemple d’utilisation :**
```java
int[] tab1 = {3, 2, 8};
int[] tab2 = {4, 7, 1};
System.out.println(sum(tab1, tab2)); // 799
```

🔗 **Plus d’informations** : [ArrayToolbox README](ArrayToolbox.md)

---

### 2️⃣ MatrixToolbox

📂 **Fichier** : `MatrixToolbox.java`  
📜 **Description** : Permet la **multiplication de matrices** sous forme de tableaux bidimensionnels.  
🎯 **Fonctionnalités** :
- Vérification automatique de la compatibilité des matrices
- Multiplication efficace
- Gestion des erreurs avec `Double.NaN` si les matrices ne peuvent pas être multipliées
- Affichage formaté des résultats

📌 **Exemple d’utilisation :**
```java
Double[][] matA = {{2.0, 3.0}, {4.0, 5.0}};
Double[][] matB = {{6.0, 7.0}, {8.0, 9.0}};
printMat(multiply(matA, matB));
```

🔗 **Plus d’informations** : [MatrixToolbox README](MatrixToolbox.md)

---

### 3️⃣ Statistics

📂 **Fichier** : `Statistics.java`  
📜 **Description** : Permet de calculer des statistiques de base sur un tableau numérique.  
🎯 **Fonctionnalités** :
- **Nombre d’éléments** dans un tableau
- **Moyenne arithmétique**
- **Valeurs maximale et minimale**
- **Exécution en ligne de commande**

📌 **Exemple d’exécution en CLI :**
```sh
java Statistics 2 1.5 2.5 3.5
# Sortie : 2.5 (Moyenne)
```

🔗 **Plus d’informations** : [Statistics README](Statistics.md)

---

## 🚀 Installation et Exécution

### 1️⃣ Cloner le projet
```sh
git clone https://github.com/ton-profil-github/Laboratoire-1.git
cd Laboratoire-1
```

### 2️⃣ Compilation des fichiers
```sh
javac ArrayToolbox.java
javac MatrixToolbox.java
javac Statistics.java
```

### 3️⃣ Exécution des programmes

▶ **ArrayToolbox**
```sh
java ArrayToolbox
```

▶ **MatrixToolbox**
```sh
java MatrixToolbox
```

▶ **Statistics**
```sh
java Statistics 1 3.5 7.2 1.8 9.0
```

---

## 📈 Améliorations possibles

- Ajouter d'autres **opérations matricielles** (ex. transposition, déterminant).
- Intégrer un **système de tests unitaires** avec **JUnit**.
- Offrir une **interface graphique** simple pour l'interaction utilisateur.

---

## 📝 Auteur

📝 **Gabriel Ralph Christian**  
Développeur passionné par la programmation et les algorithmes.

---

## 📜 Licence

📜 Ce projet est sous licence **MIT** – vous êtes libre de l'utiliser, de le modifier et de le partager.
