package com.lambdaschool.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableJpaAuditing
@SpringBootApplication
public class AuthenticatedusersApplication
{

    public static void main(String[] args)
    {
        ApplicationContext ctx = SpringApplication.run(AuthenticatedusersApplication.class, args);

        DispatcherServlet dispatcherServlet = (DispatcherServlet)ctx.getBean("dispatcherServlet");
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);


// TODO           You bookstore endpoints should have customized Swagger documentation.
//
// TODO           Appropriate Exception handling should be in place for each bookstore endpoint
//
// TODO       The bookstore endpoints should be pageable and sortable.
//
// TODO       List the data
//
// TODO       GET /books - returns a JSON object list of all the books and their authors.
//
// TODO           GET /authors - returns a JSON object list of all the authors and their books.
//
//            Manage the data
//
//        PUT /data/books/{id} - updates a books info (Title, Copyright, ISBN) but does NOT have to assign authors to the books.
//
//        POST /data/books/authors{id} - assigns a book already in the system to an author already in the system (see how roles are handled for users)
//
//        DELETE /data/books/{id} - deletes a book and the book author combinations - but does not delete the author records.
//
//        Your system will have authentication in place. The following are the roles you need to handle:
//
//    User - people who can look up books, authors
//
//        Data - people who can update data on books, authors, sections. The can also read books, authors, sections.
//
//            ADMIN - people who can update data on users and otherwise have full access to the system.
//
//        Make sure that actuator endpoints are exposed
//
//        Deploy the system to Heroku!
//            Note that several obvious end points are not included in the required list. Finishing out the list of useful end points is the stretch goal. You are to decide what those end points are!
    }
}
