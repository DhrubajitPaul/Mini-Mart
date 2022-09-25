package dhrubajit.com.dhrubajit.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Ldhrubajit/com/dhrubajit/adapters/HomeItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ldhrubajit/com/dhrubajit/adapters/HomeItemAdapter$TaskViewHolder;", "items", "", "Ldhrubajit/com/dhrubajit/dataclasses/products/Product;", "homeBinding", "Ldhrubajit/com/dhrubajit/databinding/FragmentHomeBinding;", "(Ljava/util/List;Ldhrubajit/com/dhrubajit/databinding/FragmentHomeBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "TaskViewHolder", "app_debug"})
public final class HomeItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<dhrubajit.com.dhrubajit.adapters.HomeItemAdapter.TaskViewHolder> {
    private final java.util.List<dhrubajit.com.dhrubajit.dataclasses.products.Product> items = null;
    private final dhrubajit.com.dhrubajit.databinding.FragmentHomeBinding homeBinding = null;
    public android.content.Context context;
    
    public HomeItemAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<dhrubajit.com.dhrubajit.dataclasses.products.Product> items, @org.jetbrains.annotations.NotNull()
    dhrubajit.com.dhrubajit.databinding.FragmentHomeBinding homeBinding) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dhrubajit.com.dhrubajit.adapters.HomeItemAdapter.TaskViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    dhrubajit.com.dhrubajit.adapters.HomeItemAdapter.TaskViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Ldhrubajit/com/dhrubajit/adapters/HomeItemAdapter$TaskViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Ldhrubajit/com/dhrubajit/databinding/ItemCardBinding;", "(Ldhrubajit/com/dhrubajit/databinding/ItemCardBinding;)V", "getBinding", "()Ldhrubajit/com/dhrubajit/databinding/ItemCardBinding;", "app_debug"})
    public static final class TaskViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final dhrubajit.com.dhrubajit.databinding.ItemCardBinding binding = null;
        
        public TaskViewHolder(@org.jetbrains.annotations.NotNull()
        dhrubajit.com.dhrubajit.databinding.ItemCardBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final dhrubajit.com.dhrubajit.databinding.ItemCardBinding getBinding() {
            return null;
        }
    }
}