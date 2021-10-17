package domain;

import java.net.URL;

public class Post {
    private String id; // идентификатор поста
    private NamePostAuthor namePostAuthor;// имя автора поста
    private PostText postText;// текст поста
    private String imageurl; // картинка
    private URL date; // ссылка с датой поста
    private int countLike;// счетчик лайков
    private int countFaceTearsJoySmail; // счетчик смеющихся смайликов
    private int countAstonishedFaceSmail;//счетчик удивляющихся смайликов
    private int countSmilingFaceHeartEyesSmail;//счетчик влюбленных смайликов
    private int countCryingFaceSmail;// счетчик плачущих смайликов
    private int countAngryFaceSmail;// счетчик злых смайликов
    private String comments;// комментарии
    private URL shareLinkUrl;
    private int viewCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NamePostAuthor getNamePostAuthor() {
        return namePostAuthor;
    }

    public void setNamePostAuthor(NamePostAuthor namePostAuthor) {
        this.namePostAuthor = namePostAuthor;
    }

    public PostText getPostText() {
        return postText;
    }

    public void setPostText(PostText postText) {
        this.postText = postText;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public URL getDate() {
        return date;
    }

    public void setDate(URL date) {
        this.date = date;
    }

    public int getCountLike() {
        return countLike;
    }

    public void setCountLike(int countLike) {
        this.countLike = countLike;
    }

    public int getCountFaceTearsJoySmail() {
        return countFaceTearsJoySmail;
    }

    public void setCountFaceTearsJoySmail(int countFaceTearsJoySmail) {
        this.countFaceTearsJoySmail = countFaceTearsJoySmail;
    }

    public int getCountAstonishedFaceSmail() {
        return countAstonishedFaceSmail;
    }

    public void setCountAstonishedFaceSmail(int countAstonishedFaceSmail) {
        this.countAstonishedFaceSmail = countAstonishedFaceSmail;
    }

    public int getCountSmilingFaceHeartEyesSmail() {
        return countSmilingFaceHeartEyesSmail;
    }

    public void setCountSmilingFaceHeartEyesSmail(int countSmilingFaceHeartEyesSmail) {
        this.countSmilingFaceHeartEyesSmail = countSmilingFaceHeartEyesSmail;
    }

    public int getCountCryingFaceSmail() {
        return countCryingFaceSmail;
    }

    public void setCountCryingFaceSmail(int countCryingFaceSmail) {
        this.countCryingFaceSmail = countCryingFaceSmail;
    }

    public int getCountAngryFaceSmail() {
        return countAngryFaceSmail;
    }

    public void setCountAngryFaceSmail(int countAngryFaceSmail) {
        this.countAngryFaceSmail = countAngryFaceSmail;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public URL getShareLinkUrl() {
        return shareLinkUrl;
    }

    public void setShareLinkUrl(URL shareLinkUrl) {
        this.shareLinkUrl = shareLinkUrl;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
}
