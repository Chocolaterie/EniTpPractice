# EniTpPractice

## Partie 1

Une activité qui affiche :

- Une liste d’article (avec ListView et non RecyclerView)

Les articles sont instanciés par défaut

Au clique sur un article, afficher une page avec les détails de l’article (titre, contenu) sur une autre activité. Vous devez envoyer l’objet Article sur la nouvelle page.


### Example OnClick sur un item de la listview

```kotlin
// Adapter
val arrayAdatper = ArrayAdapter(this, android.R.layout.simple_list_item_1, l

// quand je clique sur un element
findViewById<ListView>(R.id.listview).setOnItemClickListener { parent, view, position, id ->
    
    // récupère l'objet dans le clique
    val element = arrayAdatper.getItem(position) as Todo
}

```

## Partie 2
Rajouter un formulaire avec les champs suivants :
- Titre
- Contenu
- Un bouton « Ajouter l’article », la chaîne de caractère doit être située en tant que constante dans un fichier strings xml

Lors du clique du bouton, ajouter l’article à la liste view
Rajouter un contrôle de surface pour empêcher l’ajout si nous avons plus de 6 articles existants.

PS : Vous pouvez disposer le formulaire soit avant la liste ou après la liste, comme bon vous semble.
