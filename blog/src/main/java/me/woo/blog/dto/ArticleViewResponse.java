package me.woo.blog.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.woo.blog.domain.Article;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class ArticleViewResponse {

    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;

    public ArticleViewResponse(Article article){
        this.id = article.getId();;
        this.title = article.getTitle();
        this.content = article.getContent();
        this.createdAt = article.getCreatedAt();
    }

}
