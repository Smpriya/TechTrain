import { InMemoryDbService } from 'angular-in-memory-web-api';

export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    const users = [
      { id: 'rajk', userid:'rajk', password: 'rajk123' },
      { id: 'susig', userid:'raj', password: 'rajk123' }
    ];

    const formmenu = [
      { id: '1', name:'SimpleForm', url: '/simpleform' }
    ];

    const books = [
        {isbn: "isbn1234567890",title :"Book on Angular",author : "Susi"},
        {isbn: "isbn1234567888",title :"Book on Nodejsr",author : "Harsha"},
        {isbn: "isbn1234567899",title :"Book on JakartaEE",author : "Abirami"},
        {isbn: "isbn1234567897",title :"Chariots of the God",author : "AncientAliens"}
      ];


    return {users,formmenu,books};
  }
}
