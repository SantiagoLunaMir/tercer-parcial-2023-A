package edu.uaslp.objetos.shoppingcart;

import java.util.Collection;
import java.util.List;


public class ShoppingCart {
    private ShoppingItemCatalog shoppingItemCatalog;
    private List<ShoppingItem> shoppingItemList;
    private int totalCost;
    private int distinctItemsCount;
    private int totalItemsCount;
    public ShoppingCart(){

    }
    public ShoppingCart(ShoppingItemCatalog shoppingItemCatalog, List<ShoppingItem> shoppingItemList, int totalCost, int distinctItemsCount, int totalItemsCount) {
        this.shoppingItemCatalog=shoppingItemCatalog;
        this.shoppingItemList = shoppingItemList;
        this.totalCost = totalCost;
        this.distinctItemsCount = distinctItemsCount;
        this.totalItemsCount = totalItemsCount;
    }

    public void setTotalCost(int totalCost){
        this.totalCost=totalCost;
    }
    public void setDistinctItemsCount(int distinctItemsCount) {
        this.distinctItemsCount = distinctItemsCount;
    }

    public void setTotalItemsCount(int totalItemsCount) {
        this.totalItemsCount = totalItemsCount;
    }
    public void setShoppingItemCatalog(List<ShoppingItem> shoppingItemList){
        this.shoppingItemList=shoppingItemList;

    }
    public void add(String itemCode){
        ShoppingItem item1=shoppingItemCatalog.getItem(itemCode);
        shoppingItemList.add(item1);
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
