package co.ars.gw.service.mapper;

import co.ars.gw.domain.Author;
import co.ars.gw.domain.Book;
import co.ars.gw.service.dto.AuthorDTO;
import co.ars.gw.service.dto.BookDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Book} and its DTO {@link BookDTO}.
 */
@Mapper(componentModel = "spring")
public interface BookMapper extends EntityMapper<BookDTO, Book> {
    @Mapping(target = "authorBook", source = "authorBook", qualifiedByName = "authorName")
    BookDTO toDto(Book s);

    @Named("authorName")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    AuthorDTO toDtoAuthorName(Author author);
}
