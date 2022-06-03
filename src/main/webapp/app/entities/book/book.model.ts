import dayjs from 'dayjs/esm';
import { IAuthor } from 'app/entities/author/author.model';

export interface IBook {
  id?: number;
  title?: string | null;
  description?: string | null;
  publicationDate?: dayjs.Dayjs | null;
  price?: number | null;
  authorBook?: IAuthor | null;
}

export class Book implements IBook {
  constructor(
    public id?: number,
    public title?: string | null,
    public description?: string | null,
    public publicationDate?: dayjs.Dayjs | null,
    public price?: number | null,
    public authorBook?: IAuthor | null
  ) {}
}

export function getBookIdentifier(book: IBook): number | undefined {
  return book.id;
}
