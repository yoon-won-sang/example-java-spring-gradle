package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Post {
    private int id;
    private int userId;
    private String title;
    // 10개 컬럼을 위해 추가 필드 (API 응답에는 없지만 화면 표출용으로 임의 추가)
    private String category = "일반";
    private String status = "완료";
    private String author = "작성자";
    private String date = "2026-10-09";
    private int views = 100;
    private int likes = 10;
    private String tags = "Java";

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getCategory() { return category; }
    public String getStatus() { return status; }
    public String getAuthor() { return author; }
    public String getDate() { return date; }
    public int getViews() { return views; }
    public int getLikes() { return likes; }
    public String getTags() { return tags; }
}
