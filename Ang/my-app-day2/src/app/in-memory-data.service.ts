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

    return {users,formmenu};
  }
}
