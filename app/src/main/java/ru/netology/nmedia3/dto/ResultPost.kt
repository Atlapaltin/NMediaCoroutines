package ru.netology.nmedia3.dto

data class ResultPost(
    val post: Post,
    val comments: List<CommentWithAuthor>,
    val author: Author
)