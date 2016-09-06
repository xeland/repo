package com.xeland.project;

public class ClassB<T> extends ClassX {


    public enum Type {

        ADDED,
        REMOVED;

    }
    public ClassB(final ClassF source, final Type type, final String attributeName, final T oldValue, final T newValue) {

        super(source);


    }

   public final String getAttributeName() {

        return "";
    }

  
    public final Object getNewValue() {

        return null;
    }

    public final Object getOldValue() {

        return null;
    }

 
    public final Type getType() {
        return null;
    }

  
    public final void setAttributeName(final String attributeName) {
    }

     private void setNewValue(final T newValue) {
    }

    private void setOldValue(final T oldValue) {
    }

 
    public final void setType(final Type type) {
    }

    @Override
    public final String toString() {

        return "";
    }

}
