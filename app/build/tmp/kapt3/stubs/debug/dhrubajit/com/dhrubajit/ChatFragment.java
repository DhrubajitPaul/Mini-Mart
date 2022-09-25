package dhrubajit.com.dhrubajit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Ldhrubajit/com/dhrubajit/ChatFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Ldhrubajit/com/dhrubajit/databinding/FragmentChatBinding;", "getBinding", "()Ldhrubajit/com/dhrubajit/databinding/FragmentChatBinding;", "setBinding", "(Ldhrubajit/com/dhrubajit/databinding/FragmentChatBinding;)V", "messages", "", "Ldhrubajit/com/dhrubajit/dataclasses/ChatMessage;", "msgAdapter", "Ldhrubajit/com/dhrubajit/adapters/ChatMessageAdapter;", "initializeChat", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "sendMessage", "text", "Landroid/text/Editable;", "app_debug"})
public final class ChatFragment extends androidx.fragment.app.Fragment {
    public dhrubajit.com.dhrubajit.databinding.FragmentChatBinding binding;
    private dhrubajit.com.dhrubajit.adapters.ChatMessageAdapter msgAdapter;
    private final java.util.List<dhrubajit.com.dhrubajit.dataclasses.ChatMessage> messages = null;
    
    public ChatFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dhrubajit.com.dhrubajit.databinding.FragmentChatBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    dhrubajit.com.dhrubajit.databinding.FragmentChatBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initializeChat() {
    }
    
    private final void sendMessage(android.text.Editable text) {
    }
}