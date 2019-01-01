package com.gof.design.pattern.creational.prototype.document;

public class TermsAndCondition extends PrototypeCapableDocument {

    @Override
    public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
        /*Clone with shallow copy*/
        TermsAndCondition tAndC = null;
        try {
            tAndC = (TermsAndCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return tAndC;
    }

    @Override
    public String toString() {
        return "[TAndC: Vendor Name - " + getVendorName() + ", Content - " + getContent() + "]";
    }
}
