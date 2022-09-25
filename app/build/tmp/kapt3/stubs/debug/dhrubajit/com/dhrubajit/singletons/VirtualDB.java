package dhrubajit.com.dhrubajit.singletons;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0011J\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\nJ\u0012\u0010#\u001a\u00020\u001e2\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010%\u001a\u00020!J\u0010\u0010&\u001a\u00020\'2\b\u0010$\u001a\u0004\u0018\u00010\u0004J\u0006\u0010(\u001a\u00020\'J\u0010\u0010)\u001a\u00020\'2\b\u0010$\u001a\u0004\u0018\u00010\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\b\u00a8\u0006*"}, d2 = {"Ldhrubajit/com/dhrubajit/singletons/VirtualDB;", "", "()V", "currentFilter", "", "getCurrentFilter", "()Ljava/lang/String;", "setCurrentFilter", "(Ljava/lang/String;)V", "deliveryFee", "", "getDeliveryFee", "()F", "setDeliveryFee", "(F)V", "items", "", "Ldhrubajit/com/dhrubajit/dataclasses/Item;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "prevOrders", "Ldhrubajit/com/dhrubajit/dataclasses/PreviousOrder;", "getPrevOrders", "setPrevOrders", "priceFilter", "getPriceFilter", "setPriceFilter", "addItem", "", "ite", "addPrevOrder", "", "calculateTotal", "checkExestence", "name", "clearCart", "decreaseItemCount", "", "getItemsCount", "increaseItemCount", "app_debug"})
public final class VirtualDB {
    @org.jetbrains.annotations.NotNull()
    public static final dhrubajit.com.dhrubajit.singletons.VirtualDB INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.List<dhrubajit.com.dhrubajit.dataclasses.Item> items;
    @org.jetbrains.annotations.NotNull()
    private static java.util.List<dhrubajit.com.dhrubajit.dataclasses.PreviousOrder> prevOrders;
    private static float deliveryFee = 5.0F;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String currentFilter;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String priceFilter;
    
    private VirtualDB() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<dhrubajit.com.dhrubajit.dataclasses.Item> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<dhrubajit.com.dhrubajit.dataclasses.Item> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<dhrubajit.com.dhrubajit.dataclasses.PreviousOrder> getPrevOrders() {
        return null;
    }
    
    public final void setPrevOrders(@org.jetbrains.annotations.NotNull()
    java.util.List<dhrubajit.com.dhrubajit.dataclasses.PreviousOrder> p0) {
    }
    
    public final float getDeliveryFee() {
        return 0.0F;
    }
    
    public final void setDeliveryFee(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentFilter() {
        return null;
    }
    
    public final void setCurrentFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPriceFilter() {
        return null;
    }
    
    public final void setPriceFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean addItem(@org.jetbrains.annotations.NotNull()
    dhrubajit.com.dhrubajit.dataclasses.Item ite) {
        return false;
    }
    
    private final boolean checkExestence(java.lang.String name) {
        return false;
    }
    
    public final int getItemsCount() {
        return 0;
    }
    
    public final void clearCart() {
    }
    
    public final int increaseItemCount(@org.jetbrains.annotations.Nullable()
    java.lang.String name) {
        return 0;
    }
    
    public final int decreaseItemCount(@org.jetbrains.annotations.Nullable()
    java.lang.String name) {
        return 0;
    }
    
    public final float calculateTotal() {
        return 0.0F;
    }
    
    public final void addPrevOrder() {
    }
}