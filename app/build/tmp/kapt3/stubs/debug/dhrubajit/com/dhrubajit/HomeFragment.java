package dhrubajit.com.dhrubajit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Ldhrubajit/com/dhrubajit/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "allItems", "", "Ldhrubajit/com/dhrubajit/dataclasses/products/Product;", "binding", "Ldhrubajit/com/dhrubajit/databinding/FragmentHomeBinding;", "getBinding", "()Ldhrubajit/com/dhrubajit/databinding/FragmentHomeBinding;", "setBinding", "(Ldhrubajit/com/dhrubajit/databinding/FragmentHomeBinding;)V", "filteredItems", "itemsAdapter", "Ldhrubajit/com/dhrubajit/adapters/HomeItemAdapter;", "filterItems", "currentFilter", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "readProductsFromJson", "context", "Landroid/content/Context;", "sortItems", "", "id", "", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    public dhrubajit.com.dhrubajit.databinding.FragmentHomeBinding binding;
    private dhrubajit.com.dhrubajit.adapters.HomeItemAdapter itemsAdapter;
    private java.util.List<dhrubajit.com.dhrubajit.dataclasses.products.Product> allItems;
    private java.util.List<dhrubajit.com.dhrubajit.dataclasses.products.Product> filteredItems;
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dhrubajit.com.dhrubajit.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    dhrubajit.com.dhrubajit.databinding.FragmentHomeBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final java.util.List<dhrubajit.com.dhrubajit.dataclasses.products.Product> filterItems(java.lang.String currentFilter) {
        return null;
    }
    
    private final java.util.List<dhrubajit.com.dhrubajit.dataclasses.products.Product> readProductsFromJson(android.content.Context context) {
        return null;
    }
    
    private final void sortItems(int id) {
    }
}