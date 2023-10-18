package com.fuzzylizard.blog.models

import com.fuzzylizard.blog.repositories.ArticlesRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ArticleTest(
    @Autowired val articlesRepository: ArticlesRepository
) {

    @Test
    fun `should retrieve article from DB`() {
        val articles = articlesRepository.findAll()

        assertThat(articles).isNotEmpty
    }
}
