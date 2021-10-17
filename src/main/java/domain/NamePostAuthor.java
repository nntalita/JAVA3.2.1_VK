package domain;

import java.net.URL;

public class NamePostAuthor {
    private String id;
    private String name;
    private String imageUrl;
    private URL url;

    public String getIdNamePostAuthor() {
        return id;
    }

    public String getNameNamePostAuthor() {
        return name;
    }

    public String getImageUrlNamePostAuthor() {
        return imageUrl;
    }

    public URL getUrlNamePostAuthor() {
        return url;
    }

    public void setIdNamePostAuthor(String id) {
        this.id = id;
    }

    public void setImageUrlNamePostAuthor(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setNamePostAuthor(String name) {
        this.name = name;

    }

    public void setUrlNamePostAuthor(URL url) {
        this.url = url;
    }
}
