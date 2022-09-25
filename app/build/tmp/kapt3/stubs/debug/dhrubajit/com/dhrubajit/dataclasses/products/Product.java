package dhrubajit.com.dhrubajit.dataclasses.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u00020\u0004X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\u0004X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0018\u0010\f\u001a\u00020\u0004X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u0018\u0010\u000f\u001a\u00020\u0010X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u00020\u0004X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b\u00a8\u0006\u0018"}, d2 = {"Ldhrubajit/com/dhrubajit/dataclasses/products/Product;", "", "()V", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "image", "getImage", "setImage", "name", "getName", "setName", "price", "", "getPrice", "()F", "setPrice", "(F)V", "sku", "getSku", "setSku", "app_debug"})
public abstract class Product {
    
    public Product() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName();
    
    public abstract void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getDescription();
    
    public abstract void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getSku();
    
    public abstract void setSku(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    public abstract float getPrice();
    
    public abstract void setPrice(float p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getImage();
    
    public abstract void setImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
}