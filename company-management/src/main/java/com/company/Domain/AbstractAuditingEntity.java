package com.company.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.Instant;
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractAuditingEntity {
    @CreatedBy
    @Column(name = "created_by_user")
    private String createdByUser;

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    private Instant createdAt = Instant.now();

    @LastModifiedBy
    @Column(name = "updated_by_user")
    private String updatedByUser;

    @LastModifiedDate
    @Column(name = "updated_at")
    private Instant updatedAt = Instant.now();
}
