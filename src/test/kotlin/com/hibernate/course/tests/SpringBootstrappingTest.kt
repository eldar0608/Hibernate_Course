package com.hibernate.course.tests

import com.hibernate.course.domain.entity.Author
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Commit
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.transaction.annotation.Transactional
import java.util.logging.Logger
import javax.persistence.EntityManager

@RunWith(Parameterized::class)
@SpringBootTest
class  SpringBootstrappingTest(
        private val em: EntityManager
){
    var log = Logger.getLogger(this.javaClass.name)

    @Test
    @Transactional
    @Commit
    fun accessHibernateSession(){
        log.info("... accessHibernateSession ...")

        var author = Author("Thorben", "Jansen")
        em.persist(author)
    }
}
