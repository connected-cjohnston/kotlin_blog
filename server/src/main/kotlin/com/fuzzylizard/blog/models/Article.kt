package com.fuzzylizard.blog.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.JdbcTypeCode
import org.hibernate.type.SqlTypes
import java.sql.Timestamp

@Table(name = "articles")
@Entity
open class Article {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    open var id: Long? = null

    @Column(name = "title", nullable = false)
    open var title: String? = null

    @Column(name = "articleText", nullable = true)
    open var articleText: String? = null

    @Column(name = "created_on", nullable = false)
    open var createdOn: Timestamp? = null

    @Column(name = "modified_on", nullable = false)
    open var modifiedOn: Timestamp? = null
}
