package co.ars.gw.service.criteria;

import java.io.Serializable;
import java.util.Objects;
import org.springdoc.api.annotations.ParameterObject;
import tech.jhipster.service.Criteria;
import tech.jhipster.service.filter.BigDecimalFilter;
import tech.jhipster.service.filter.BooleanFilter;
import tech.jhipster.service.filter.DoubleFilter;
import tech.jhipster.service.filter.Filter;
import tech.jhipster.service.filter.FloatFilter;
import tech.jhipster.service.filter.IntegerFilter;
import tech.jhipster.service.filter.LocalDateFilter;
import tech.jhipster.service.filter.LongFilter;
import tech.jhipster.service.filter.StringFilter;

/**
 * Criteria class for the {@link co.ars.gw.domain.Book} entity. This class is used
 * in {@link co.ars.gw.web.rest.BookResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /books?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
@ParameterObject
public class BookCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter title;

    private StringFilter description;

    private LocalDateFilter publicationDate;

    private BigDecimalFilter price;

    private LongFilter authorBookId;

    private Boolean distinct;

    public BookCriteria() {}

    public BookCriteria(BookCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.title = other.title == null ? null : other.title.copy();
        this.description = other.description == null ? null : other.description.copy();
        this.publicationDate = other.publicationDate == null ? null : other.publicationDate.copy();
        this.price = other.price == null ? null : other.price.copy();
        this.authorBookId = other.authorBookId == null ? null : other.authorBookId.copy();
        this.distinct = other.distinct;
    }

    @Override
    public BookCriteria copy() {
        return new BookCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public LongFilter id() {
        if (id == null) {
            id = new LongFilter();
        }
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getTitle() {
        return title;
    }

    public StringFilter title() {
        if (title == null) {
            title = new StringFilter();
        }
        return title;
    }

    public void setTitle(StringFilter title) {
        this.title = title;
    }

    public StringFilter getDescription() {
        return description;
    }

    public StringFilter description() {
        if (description == null) {
            description = new StringFilter();
        }
        return description;
    }

    public void setDescription(StringFilter description) {
        this.description = description;
    }

    public LocalDateFilter getPublicationDate() {
        return publicationDate;
    }

    public LocalDateFilter publicationDate() {
        if (publicationDate == null) {
            publicationDate = new LocalDateFilter();
        }
        return publicationDate;
    }

    public void setPublicationDate(LocalDateFilter publicationDate) {
        this.publicationDate = publicationDate;
    }

    public BigDecimalFilter getPrice() {
        return price;
    }

    public BigDecimalFilter price() {
        if (price == null) {
            price = new BigDecimalFilter();
        }
        return price;
    }

    public void setPrice(BigDecimalFilter price) {
        this.price = price;
    }

    public LongFilter getAuthorBookId() {
        return authorBookId;
    }

    public LongFilter authorBookId() {
        if (authorBookId == null) {
            authorBookId = new LongFilter();
        }
        return authorBookId;
    }

    public void setAuthorBookId(LongFilter authorBookId) {
        this.authorBookId = authorBookId;
    }

    public Boolean getDistinct() {
        return distinct;
    }

    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final BookCriteria that = (BookCriteria) o;
        return (
            Objects.equals(id, that.id) &&
            Objects.equals(title, that.title) &&
            Objects.equals(description, that.description) &&
            Objects.equals(publicationDate, that.publicationDate) &&
            Objects.equals(price, that.price) &&
            Objects.equals(authorBookId, that.authorBookId) &&
            Objects.equals(distinct, that.distinct)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, publicationDate, price, authorBookId, distinct);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "BookCriteria{" +
            (id != null ? "id=" + id + ", " : "") +
            (title != null ? "title=" + title + ", " : "") +
            (description != null ? "description=" + description + ", " : "") +
            (publicationDate != null ? "publicationDate=" + publicationDate + ", " : "") +
            (price != null ? "price=" + price + ", " : "") +
            (authorBookId != null ? "authorBookId=" + authorBookId + ", " : "") +
            (distinct != null ? "distinct=" + distinct + ", " : "") +
            "}";
    }
}
