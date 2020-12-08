package by.epam.training.module03.regular.task02.enity;

import java.util.Map;

public class Tag {

    private String nameTag = "";
    private String typeTag = "";
    private Map<String, String> attributes;
    private String contentTag = "";

    public Tag() {
        this.nameTag = "";
        this.typeTag = "";
        this.attributes = null;
        this.contentTag = "";
    }

    public void setContentTag(String contentTag) {
        this.contentTag = contentTag;
    }

    public String getNameTag() {
        return nameTag;
    }

    public void setNameTag(String nameTag) {
        this.nameTag = nameTag;
    }

    public String getTypeTag() {
        return typeTag;
    }

    public void setTypeTag(String typeTag) {
        this.typeTag = typeTag;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "{" + "name='" + nameTag + '\'' + ", type='" + typeTag + '\'' + ", attributes=" + attributes
                + ", content='" + contentTag + '\'' + '}';
    }
}
