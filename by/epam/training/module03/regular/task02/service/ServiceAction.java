package by.epam.training.module03.regular.task02.service;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServiceAction {

    public String getTypeTag(String tag) {
        if (tag.charAt(1) == '/') {
            return "close";
        } else if (tag.charAt(tag.length() - 2) == '/') {
            return "no body tag";
        } else {
            return "open";
        }
    }

    public String getTypeTagByRegex(String tag) {

        if (tag.matches("</[a-zA-Z0-9]+( [a-zA-Z0-9]+=\"[a-zA-Z0-9]+\")*>")) {
            return "close";
        } else if ((tag.matches("<[a-zA-Z0-9]+( [a-zA-Z0-9]+=\"[a-zA-Z0-9]+\")*/>"))) {
            return "no body tag";
        } else if ((tag.matches("<[a-zA-Z0-9]+( [a-zA-Z0-9]+=\"[a-zA-Z0-9]+\")*>"))) {

            return "open";
        } else {
            return "wrong tag";
        }
    }

    public Map<String, String> getAttributesFromTag(String tag) {
        Map<String, String> attrMap = new HashMap<>();
        Pattern attributePattern = Pattern.compile(" ([a-zA-Z0-9]+)=\"([a-zA-Z0-9]+)\"");
        Matcher attributeMatcher = attributePattern.matcher(tag);
        while (attributeMatcher.find()) {
            String attrName = attributeMatcher.group(1);
            String attrValue = attributeMatcher.group(2);
            attrMap.put(attrName, attrValue);
        }
        return attrMap;
    }
}
