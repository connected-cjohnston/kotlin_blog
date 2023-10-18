package com.fuzzylizard.blog.repositories

import com.fuzzylizard.blog.models.Article
import org.springframework.data.jpa.repository.JpaRepository

interface ArticlesRepository : JpaRepository<Article, Long>
