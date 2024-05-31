package org.gfg;

public class Child extends Parent{
    String childField;

    public String getChildField() {
        return childField;
    }

    public void setChildField(String childField) {
        this.childField = childField;
    }

    @Override
    public String toString() {
        return "Child{" +
                "childField='" + childField + '\'' +
                ", parentField=" + parentField +
                ", fruits=" + fruits +
                '}';
    }
}
