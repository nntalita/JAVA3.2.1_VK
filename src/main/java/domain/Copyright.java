package domain;

public class Copyright {
    private int id;
    private String link;
    private String name;
    private String type;

    public int getIdCopyright() {
        return id;
    }

    public void setIdCopyright(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
