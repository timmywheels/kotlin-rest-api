package com.wheeler.app

import com.wheeler.app.model.TestUser
import com.wheeler.app.repository.TestUserRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories("com.wheeler.app.*")
@EntityScan("com.wheeler.app.*")
open class Application {

    @Bean
    open fun call(repository: TestUserRepository) = ApplicationRunner {
        repository.save(TestUser(firstName = "Timothy", lastName = "Wheeler", email = "tim@timwheeler.com"))
        repository.save(TestUser(firstName = "Andrea", lastName = "Beland", email = "andrearosebeland@gmail.com"))
    }

}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

fun start() {
    runApplication<Application>()
}