package me.woo.blog.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {

    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 자동 1씩 증가
    @Id
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false) // not null
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @CreatedDate
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime udpatedAt;

    @Builder
    public Article(String title, String content){
        this.title = title;
        this.content =content;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }


}
