package dhrubajit.com.dhrubajit.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Ldhrubajit/com/dhrubajit/adapters/ChatMessageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ldhrubajit/com/dhrubajit/adapters/ChatMessageAdapter$TaskViewHolder;", "msgs", "", "Ldhrubajit/com/dhrubajit/dataclasses/ChatMessage;", "(Ljava/util/List;)V", "addMessage", "", "msg", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "TaskViewHolder", "app_debug"})
public final class ChatMessageAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<dhrubajit.com.dhrubajit.adapters.ChatMessageAdapter.TaskViewHolder> {
    private final java.util.List<dhrubajit.com.dhrubajit.dataclasses.ChatMessage> msgs = null;
    
    public ChatMessageAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<dhrubajit.com.dhrubajit.dataclasses.ChatMessage> msgs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dhrubajit.com.dhrubajit.adapters.ChatMessageAdapter.TaskViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void addMessage(@org.jetbrains.annotations.NotNull()
    dhrubajit.com.dhrubajit.dataclasses.ChatMessage msg) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    dhrubajit.com.dhrubajit.adapters.ChatMessageAdapter.TaskViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Ldhrubajit/com/dhrubajit/adapters/ChatMessageAdapter$TaskViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Ldhrubajit/com/dhrubajit/databinding/MessageCardBinding;", "(Ldhrubajit/com/dhrubajit/databinding/MessageCardBinding;)V", "getBinding", "()Ldhrubajit/com/dhrubajit/databinding/MessageCardBinding;", "app_debug"})
    public static final class TaskViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final dhrubajit.com.dhrubajit.databinding.MessageCardBinding binding = null;
        
        public TaskViewHolder(@org.jetbrains.annotations.NotNull()
        dhrubajit.com.dhrubajit.databinding.MessageCardBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final dhrubajit.com.dhrubajit.databinding.MessageCardBinding getBinding() {
            return null;
        }
    }
}