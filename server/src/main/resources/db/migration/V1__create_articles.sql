CREATE TABLE articles (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
   title VARCHAR(255) NOT NULL,
   article_text VARCHAR(255),
   created_on TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   modified_on TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   CONSTRAINT pk_articles PRIMARY KEY (id)
);
