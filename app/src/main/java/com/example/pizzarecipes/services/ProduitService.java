package com.example.pizzarecipes.services;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.dao.IDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProduitService implements IDao<Produit>{

    private static ProduitService INST;
    private final List<Produit> data = new ArrayList<>();

    private ProduitService(){
        seed();
    }

    public static ProduitService getInstance() {
        if (INST == null) INST = new ProduitService();
        return INST;
    }

    private void seed(){
        data.add(new Produit("BARBECUED CHICKEN PIZZA", 3.0,
                com.example.pizzarecipes.R.mipmap.pizza1, "35 min",
                "- 2 boneless skinless chicken breast halves\n- 1 cup barbecue sauce...",
                "Pizza au poulet barbecue simple et rapide.",
                "STEP 1: Griller le poulet.\nSTEP 2: Garnir et cuire."));
        data.add(new Produit("SPINACH PIZZA", 2.0,
                com.example.pizzarecipes.R.mipmap.pizza2, "25 min",
                "- Sauce Alfredo, épinards, tomates, fromage.",
                "Pizza crémeuse et légère aux légumes.",
                "STEP 1: Étaler la pâte.\nSTEP 2: Ajouter la garniture."));

        data.add(new Produit("PEPPERONI PIZZA", 2.5,
                com.example.pizzarecipes.R.mipmap.pizza3, "30 min",
                "- Pâte à pizza\n- Sauce tomate\n- Mozzarella\n- Pepperoni",
                "La classique américaine, simple et savoureuse.",
                "STEP 1: Étaler la pâte.\nSTEP 2: Ajouter la sauce et le fromage.\nSTEP 3: Disposer le pepperoni.\nSTEP 4: Cuire au four 15 minutes."
        ));

        data.add(new Produit("VEGETARIAN PIZZA", 2.8,
                com.example.pizzarecipes.R.mipmap.pizza4, "28 min",
                "- Sauce tomate\n- Champignons\n- Poivrons\n- Oignons\n- Olives\n- Fromage",
                "Une pizza colorée et riche en légumes frais.",
                "STEP 1: Préparer les légumes.\nSTEP 2: Garnir la pâte.\nSTEP 3: Ajouter le fromage.\nSTEP 4: Cuire jusqu'à dorure."
        ));

        data.add(new Produit("MARGHERITA PIZZA", 2.0,
                com.example.pizzarecipes.R.mipmap.pizza5, "20 min",
                "- Sauce tomate\n- Mozzarella fraîche\n- Basilic frais\n- Huile d'olive",
                "Recette italienne traditionnelle aux saveurs authentiques.",
                "STEP 1: Étaler la sauce.\nSTEP 2: Ajouter la mozzarella.\nSTEP 3: Cuire 12-15 minutes.\nSTEP 4: Ajouter le basilic après cuisson."
        ));

        data.add(new Produit("SEAFOOD PIZZA", 3.5,
                com.example.pizzarecipes.R.mipmap.pizza6, "40 min",
                "- Sauce blanche\n- Crevettes\n- Calamars\n- Fromage\n- Persil",
                "Une pizza gourmande aux fruits de mer.",
                "STEP 1: Préparer les fruits de mer.\nSTEP 2: Garnir la pâte.\nSTEP 3: Ajouter le fromage.\nSTEP 4: Cuire jusqu'à ce que le fromage fonde."
        ));

    }

    @Override
    public Produit create(Produit p) {
        data.add(p);
        return p;
    }

    @Override
    public Produit update(Produit p) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == p.getId()) {
                data.set(i, p);
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        return data.removeIf(x -> x.getId() == id);
    }

    @Override
    public Produit findById(long id) {
        for (Produit p : data) if (p.getId() == id) return p;
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return Collections.unmodifiableList(data);
    }
}
