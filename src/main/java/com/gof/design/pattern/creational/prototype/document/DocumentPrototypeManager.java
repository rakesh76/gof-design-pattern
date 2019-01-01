package com.gof.design.pattern.creational.prototype.document;

public class DocumentPrototypeManager {

    private static java.util.Map<String, PrototypeCapableDocument> prototypes = new java.util.HashMap<String, PrototypeCapableDocument>();

    static {
        TermsAndCondition tAndC = new TermsAndCondition();
        tAndC.setVendorName("Vendor Name Placeholder");
        /*Retrieve Terms and Conditions from database/network call/disk I/O here*/
        tAndC.setContent("Please read and accept the terms and conditions...");
        prototypes.put("tandc", tAndC);
        AuthorizedSignatory authorizedSignatory = new AuthorizedSignatory();
        authorizedSignatory.setName("James Clark");
        authorizedSignatory.setDesignation("HR Head");
        NDAAgreement nda = new NDAAgreement();
        nda.setVendorName("Vendor Name Placeholder");
        /*Retrieve Non Disclosure Agreement from database/network call/disk I/O here*/
        nda.setContent("Please read and accept the NDA...");
        nda.setAuthorizedSignatory(authorizedSignatory);
        prototypes.put("nda", nda);
    }

    public static PrototypeCapableDocument getClonedDocument(final String type) {
        PrototypeCapableDocument clonedDoc = null;
        try {
            PrototypeCapableDocument doc = prototypes.get(type);
            clonedDoc = doc.cloneDocument();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clonedDoc;
    }
}
