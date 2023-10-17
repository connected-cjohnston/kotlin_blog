package com.fuzzylizard.blog.persistence

import com.fuzzylizard.blog.models.Article
import org.springframework.data.jpa.repository.JpaRepository

interface ArticlesRepository : JpaRepository<Article, Long>
