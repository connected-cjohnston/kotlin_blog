package com.fuzzylizard.blog.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
open class Article(
    @Id
    @GeneratedValue
    open var id: Long,
    open var title: String,
    open var articleText: String
) {
}
