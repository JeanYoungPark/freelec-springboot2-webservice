package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime createdDate;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
        this.createdDate = entity.getCreatedDate();
    }
}
