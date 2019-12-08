package com.hibernate.course.domain.entity

import javax.persistence.*

@Entity
@Table(name = "author")
class Author(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id", updatable = false, nullable = false)
        val id: Long,

        @Column(name = "name", nullable = false)
        var name: String,

        @Column(name = "last_name", nullable = false)
        var last_name: String
)