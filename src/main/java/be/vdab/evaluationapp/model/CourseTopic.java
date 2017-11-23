package be.vdab.evaluationapp.model;

public enum CourseTopic {
    NONE("none"),ADOBE("Adobe"), BUSINESS_INTELLIGENCE("Business Intelligence"), GENERAL_PROGRAMMING("General Programming"), ITIL_AND_PROJECT_MANAGEMENT("ITIL and Project Management"), JAVA("Java"), SAP("SAP"), METHODOLOGY("Methodology"), MICROSOFT_CRM("Microsoft CRM"), MICROSOFT("Microsoft"), ORACLE("Oracle"), TESTING("Testing"), UNIX_LINUX("Unix/Linux"), WEB_DESIGN("Web Design"), XML("XML"), MOBILE_APPS("Mobile Apps");

    private String string;

    CourseTopic(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
