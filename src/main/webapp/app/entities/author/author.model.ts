import dayjs from 'dayjs/esm';

export interface IAuthor {
  id?: number;
  name?: string | null;
  birthDate?: dayjs.Dayjs | null;
}

export class Author implements IAuthor {
  constructor(public id?: number, public name?: string | null, public birthDate?: dayjs.Dayjs | null) {}
}

export function getAuthorIdentifier(author: IAuthor): number | undefined {
  return author.id;
}
