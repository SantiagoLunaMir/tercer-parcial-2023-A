package edu.uaslp.objetos.shoppingcart;

import java.util.Collection;
import java.util.List;

public class ShoppingCart {
    private ShoppingItemCatalog shoppingItemCatalog;
    private List<ShoppingItem> shoppingItemList;
    public ShoppingCart(ShoppingItemCatalog shoppingItemCatalog) {
        this.shoppingItemCatalog=shoppingItemCatalog;
    }
    public void add(String itemCode){

    }
    public int getTotalCostInCents(){
        return 0;
    }
    public int getDistinctItemsCount(){
        return 0;
    }
    public int getTotalItemsCount(){
        return 0;
    }
    public List<ShoppingItem> getItems(){
        return null;
    }
    public Collection<ShoppingItem> getDistinctItems(){
        return null;
    }
}
