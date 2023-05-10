package edu.uaslp.objetos.shoppingcart;

import java.util.Objects;

public final class ShoppingItem {

    private final String name;
    private final String description;
    private final String code;
    private final int unitCostInCents;

    ShoppingItem(String name, String description, String code, int unitCostInCents) {
        this.name = name;
        this.description = description;
        this.code = code;
        this.unitCostInCents = unitCostInCents;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }

    public int getUnitCostInCents() {
        return unitCostInCents;
    }

    public double getUnitCostInPesos() {
        return unitCostInCents / 100.0;
    }

    /*//Implementado a mano, no se sugiere
    public boolean equals(Object o){//forma correcta de comparar objectos en base a posicion de memoria
        ShoppingItem other=(ShoppingItem)o ;
        if(!other.code.equals(this.code)){
            return false;
        }
        if(!other.name.equals(this.name)){
            return false;
        }
        if(other.unitCostInCents!=(this.unitCostInCents)){
            return false;
        }
        return true;
    }*/
    //alt + insert y con hash()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingItem that = (ShoppingItem) o;
        return unitCostInCents == that.unitCostInCents && name.equals(that.name) && description.equals(that.description) && code.equals(that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, code, unitCostInCents);
    }
}
