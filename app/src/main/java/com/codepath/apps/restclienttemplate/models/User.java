package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

/**
 * Created: xuemaomao
 * Date: 2019-11-02
 * Package: com.codepath.apps.restclienttemplate.models
 * File: User
 * Description: TODO
 */
@Parcel
public class User {

    public String name;
    public String screenName;
    public String profileImageUrl;

    public User(){}

    public static User fromJson(JSONObject jsonObject) throws JSONException {
        User user = new User();
        user.name = jsonObject.getString("name");
        user.screenName = jsonObject.getString("screen_name");
        user.profileImageUrl = jsonObject.getString("profile_image_url_https");
        return user;

    }

}
