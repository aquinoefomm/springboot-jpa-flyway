package everton.springframework.sdjpa_intro.repositories;

import everton.springframework.sdjpa_intro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
