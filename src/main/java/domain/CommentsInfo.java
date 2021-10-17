package domain;


public class CommentsInfo {
    private int count;
    private int canPost;
    private int groupCanPost;
    private boolean canClose;
    private boolean canOpen;

    public int getCountCommentsInfo() {
        return count;
    }

    public void setCountCommentsInfo(int count) {
        this.count = count;
    }

    public int getGroupCanPost() {
        return groupCanPost;
    }

    public void setGroupCanPost(int groupCanPost) {
        this.groupCanPost = groupCanPost;
    }

    public int getCanPost() {
        return canPost;
    }

    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}

