package com.dculverwell.jsonpathwrite;

/**
 * Created by darryl on 2014/07/02.
 */
public class JsonPathReplacement {
    public String path;
    public String replacement;
    public String condition;

    public JsonPathReplacement(String path, String replacement) {
        this.path = path;
        this.replacement = replacement;
        String[] split = path.split("\\.");
        this.condition = split.length > 0 ? split[split.length-1] : "";
    }
}
