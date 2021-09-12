package maxeem.america.majesticreader.framework;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\t\u0010&\u001a\u00020\tH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000bH\u00c6\u0003J\t\u0010(\u001a\u00020\rH\u00c6\u0003J\t\u0010)\u001a\u00020\u000fH\u00c6\u0003J\t\u0010*\u001a\u00020\u0011H\u00c6\u0003JY\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\t\u00101\u001a\u000202H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u00063"}, d2 = {"Lmaxeem/america/majesticreader/framework/Interactors;", "", "addBookmark", "Lmaxeem/america/majesticreader/interactors/AddBookmark;", "getBookmarks", "Lmaxeem/america/majesticreader/interactors/GetBookmarks;", "deleteBookmark", "Lmaxeem/america/majesticreader/interactors/RemoveBookmark;", "addDocument", "Lmaxeem/america/majesticreader/interactors/AddDocument;", "getDocuments", "Lmaxeem/america/majesticreader/interactors/GetDocuments;", "removeDocument", "Lmaxeem/america/majesticreader/interactors/RemoveDocument;", "getOpenDocument", "Lmaxeem/america/majesticreader/interactors/GetOpenDocument;", "setOpenDocument", "Lmaxeem/america/majesticreader/interactors/SetOpenDocument;", "(Lmaxeem/america/majesticreader/interactors/AddBookmark;Lmaxeem/america/majesticreader/interactors/GetBookmarks;Lmaxeem/america/majesticreader/interactors/RemoveBookmark;Lmaxeem/america/majesticreader/interactors/AddDocument;Lmaxeem/america/majesticreader/interactors/GetDocuments;Lmaxeem/america/majesticreader/interactors/RemoveDocument;Lmaxeem/america/majesticreader/interactors/GetOpenDocument;Lmaxeem/america/majesticreader/interactors/SetOpenDocument;)V", "getAddBookmark", "()Lmaxeem/america/majesticreader/interactors/AddBookmark;", "getAddDocument", "()Lmaxeem/america/majesticreader/interactors/AddDocument;", "getDeleteBookmark", "()Lmaxeem/america/majesticreader/interactors/RemoveBookmark;", "getGetBookmarks", "()Lmaxeem/america/majesticreader/interactors/GetBookmarks;", "getGetDocuments", "()Lmaxeem/america/majesticreader/interactors/GetDocuments;", "getGetOpenDocument", "()Lmaxeem/america/majesticreader/interactors/GetOpenDocument;", "getRemoveDocument", "()Lmaxeem/america/majesticreader/interactors/RemoveDocument;", "getSetOpenDocument", "()Lmaxeem/america/majesticreader/interactors/SetOpenDocument;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class Interactors {
    @org.jetbrains.annotations.NotNull()
    private final maxeem.america.majesticreader.interactors.AddBookmark addBookmark = null;
    @org.jetbrains.annotations.NotNull()
    private final maxeem.america.majesticreader.interactors.GetBookmarks getBookmarks = null;
    @org.jetbrains.annotations.NotNull()
    private final maxeem.america.majesticreader.interactors.RemoveBookmark deleteBookmark = null;
    @org.jetbrains.annotations.NotNull()
    private final maxeem.america.majesticreader.interactors.AddDocument addDocument = null;
    @org.jetbrains.annotations.NotNull()
    private final maxeem.america.majesticreader.interactors.GetDocuments getDocuments = null;
    @org.jetbrains.annotations.NotNull()
    private final maxeem.america.majesticreader.interactors.RemoveDocument removeDocument = null;
    @org.jetbrains.annotations.NotNull()
    private final maxeem.america.majesticreader.interactors.GetOpenDocument getOpenDocument = null;
    @org.jetbrains.annotations.NotNull()
    private final maxeem.america.majesticreader.interactors.SetOpenDocument setOpenDocument = null;
    
    @org.jetbrains.annotations.NotNull()
    public final maxeem.america.majesticreader.interactors.AddBookmark getAddBookmark() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final maxeem.america.majesticreader.interactors.GetBookmarks getGetBookmarks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final maxeem.america.majesticreader.interactors.RemoveBookmark getDeleteBookmark() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final maxeem.america.majesticreader.interactors.AddDocument getAddDocument() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final maxeem.america.majesticreader.interactors.GetDocuments getGetDocuments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final maxeem.america.majesticreader.interactors.RemoveDocument getRemoveDocument() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final maxeem.america.majesticreader.interactors.GetOpenDocument getGetOpenDocument() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final maxeem.america.majesticreader.interactors.SetOpenDocument getSetOpenDocument() {
        return null;
    }
    
    public Interactors(@org.jetbrains.annotations.NotNull()
    maxeem.america.majesticreader.interactors.AddBookmark addBookmark, @org.jetbrains.annotations.NotNull()
    maxeem.america.majesticreader.interactors.GetBookmarks getBookmarks, @org.jetbrains.annotations.NotNull()
    maxeem.america.majesticreader.interactors.RemoveBookmark deleteBookmark, @org.jetbrains.annotations.NotNull()
    maxeem.america.majesticreader.interactors.AddDocument addDocument, @org.jetbrains.annotations.NotNull()
    maxeem.america.majesticreader.interactors.GetDocuments getDocuments, @org.jetbrains.annotations.NotNull()
    maxeem.america.majesticreader.interactors.RemoveDocument removeDocument, @org.jetbrains.annotations.NotNull()
    maxeem.america.majesticreader.interactors.GetOpenDocument getOpenDocument, @org.jetbrains.annotations.NotNull()
    maxeem.america.majesticreader.interactors.SetOpenDocument setOpenDocument) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final maxeem.america.majesticreader.interactors.AddBookmark component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final maxeem.america.majesticreader.interactors.GetBookmarks component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final maxeem.america.majesticreader.interactors.RemoveBookmark component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final maxeem.america.majesticreader.interactors.AddDocument component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final maxeem.america.majesticreader.interactors.GetDocuments component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final maxeem.america.majesticreader.interactors.RemoveDocument component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final maxeem.america.majesticreader.interactors.GetOpenDocument component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final maxeem.america.majesticreader.interactors.SetOpenDocument component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final maxeem.america.majesticreader.framework.Interactors copy(@org.jetbrains.annotations.NotNull()
    maxeem.america.majesticreader.interactors.AddBookmark addBookmark, @org.jetbrains.annotations.NotNull()
    maxeem.america.majesticreader.interactors.GetBookmarks getBookmarks, @org.jetbrains.annotations.NotNull()
    maxeem.america.majesticreader.interactors.RemoveBookmark deleteBookmark, @org.jetbrains.annotations.NotNull()
    maxeem.america.majesticreader.interactors.AddDocument addDocument, @org.jetbrains.annotations.NotNull()
    maxeem.america.majesticreader.interactors.GetDocuments getDocuments, @org.jetbrains.annotations.NotNull()
    maxeem.america.majesticreader.interactors.RemoveDocument removeDocument, @org.jetbrains.annotations.NotNull()
    maxeem.america.majesticreader.interactors.GetOpenDocument getOpenDocument, @org.jetbrains.annotations.NotNull()
    maxeem.america.majesticreader.interactors.SetOpenDocument setOpenDocument) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}