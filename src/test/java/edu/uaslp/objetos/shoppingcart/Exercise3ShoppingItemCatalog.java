package edu.uaslp.objetos.shoppingcart;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercise3ShoppingItemCatalog {


    @Test
    public void givenAValidCode_whenGetItem_thenShoppingItemIsReturned(){
        //Given
        ShoppingItemCatalog shoppingItemCatalog = new ShoppingItemCatalog();
        //WHen
        ShoppingItem item=shoppingItemCatalog.getItem("ABC2000");
        //Then
        assertThat(item).isNotNull();
    }

    @Test
    public void givenANotValidCode_whenGetItem_thenNullIsReturned(){
        //Given
        ShoppingItemCatalog shoppingItemCatalog = new ShoppingItemCatalog();
        //WHen
        ShoppingItem item=shoppingItemCatalog.getItem("ABCDEFGZZ");
        //Then
        assertThat(item).isNull();
    }
}
