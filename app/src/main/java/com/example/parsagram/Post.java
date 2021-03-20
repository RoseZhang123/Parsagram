package com.example.parsagram;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Post")
public class Post extends ParseObject {

    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IAMGE = "image";
    public static final String KEY_USER = "user";

    public String getDescription(){
        return getString(KEY_DESCRIPTION);
    }

    public void setDescription(String des){
        put(KEY_DESCRIPTION, des);
    }

    public ParseFile getImage(){
        return getParseFile(KEY_IAMGE);
    }

    public void setImage(ParseFile parseFile){
        put(KEY_IAMGE, parseFile);
    }

    public String getUser(){
        return getString(KEY_USER);
    }

    public void setUser(ParseUser user){
        put(KEY_USER, user);
    }
}
