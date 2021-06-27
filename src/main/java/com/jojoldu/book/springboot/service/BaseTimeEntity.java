package com.jojoldu.book.springboot.service;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
//BaseTimeEntity클래스에 Auditing 기능을 포함시킵니다.
public abstract class BaseTimeEntity {

    @CreatedDate
    private LocalDateTime createdDate;
    //Entity가 생성되어 저장될 때 시간이 자동 저장됩니다.

    @LastModifiedDate
    private LocalDateTime modifiedDate;
    //조회한 Entity의 값을 변경할 때 시간이 자동 저장됩니다.
}
