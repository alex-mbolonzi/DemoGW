package co.ars.gw.service.mapper;

import co.ars.gw.domain.Author;
import co.ars.gw.domain.Book;
import co.ars.gw.service.dto.AuthorDTO;
import co.ars.gw.service.dto.BookDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-16T11:58:11+0300",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.100.v20220318-0906, environment: Java 17.0.3 (Eclipse Adoptium)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public Book toEntity(BookDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Book book = new Book();

        book.setId( dto.getId() );
        book.setTitle( dto.getTitle() );
        book.setDescription( dto.getDescription() );
        book.setPublicationDate( dto.getPublicationDate() );
        book.setPrice( dto.getPrice() );
        book.author( authorDTOToAuthor( dto.getAuthor() ) );

        return book;
    }

    @Override
    public List<Book> toEntity(List<BookDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Book> list = new ArrayList<Book>( dtoList.size() );
        for ( BookDTO bookDTO : dtoList ) {
            list.add( toEntity( bookDTO ) );
        }

        return list;
    }

    @Override
    public List<BookDTO> toDto(List<Book> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<BookDTO> list = new ArrayList<BookDTO>( entityList.size() );
        for ( Book book : entityList ) {
            list.add( toDto( book ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Book entity, BookDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getTitle() != null ) {
            entity.setTitle( dto.getTitle() );
        }
        if ( dto.getDescription() != null ) {
            entity.setDescription( dto.getDescription() );
        }
        if ( dto.getPublicationDate() != null ) {
            entity.setPublicationDate( dto.getPublicationDate() );
        }
        if ( dto.getPrice() != null ) {
            entity.setPrice( dto.getPrice() );
        }
        if ( dto.getAuthor() != null ) {
            if ( entity.getAuthor() == null ) {
                entity.author( new Author() );
            }
            authorDTOToAuthor1( dto.getAuthor(), entity.getAuthor() );
        }
    }

    @Override
    public BookDTO toDto(Book s) {
        if ( s == null ) {
            return null;
        }

        BookDTO bookDTO = new BookDTO();

        bookDTO.setAuthor( toDtoAuthorName( s.getAuthor() ) );
        bookDTO.setId( s.getId() );
        bookDTO.setTitle( s.getTitle() );
        bookDTO.setDescription( s.getDescription() );
        bookDTO.setPublicationDate( s.getPublicationDate() );
        bookDTO.setPrice( s.getPrice() );

        return bookDTO;
    }

    @Override
    public AuthorDTO toDtoAuthorName(Author author) {
        if ( author == null ) {
            return null;
        }

        AuthorDTO authorDTO = new AuthorDTO();

        authorDTO.setId( author.getId() );
        authorDTO.setName( author.getName() );

        return authorDTO;
    }

    protected Author authorDTOToAuthor(AuthorDTO authorDTO) {
        if ( authorDTO == null ) {
            return null;
        }

        Author author = new Author();

        author.setId( authorDTO.getId() );
        author.setName( authorDTO.getName() );
        author.setBirthDate( authorDTO.getBirthDate() );

        return author;
    }

    protected void authorDTOToAuthor1(AuthorDTO authorDTO, Author mappingTarget) {
        if ( authorDTO == null ) {
            return;
        }

        if ( authorDTO.getId() != null ) {
            mappingTarget.setId( authorDTO.getId() );
        }
        if ( authorDTO.getName() != null ) {
            mappingTarget.setName( authorDTO.getName() );
        }
        if ( authorDTO.getBirthDate() != null ) {
            mappingTarget.setBirthDate( authorDTO.getBirthDate() );
        }
    }
}
