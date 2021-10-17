package domain;

public class LikesInfo {
    private int count;
    private int userLikes;
    private int canLike;
    private int canPublish;

    public int getCountLikesInfo() {
        return count;
    }

    public void setCountLikesInfo(int count) {
        this.count = count;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }
}
