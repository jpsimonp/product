package com.example.rest.data;

/**
 * 
 * @author jpsimon
 * 
 * Greeting data class is shared in project and product but one less field remarks on product
 *
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
