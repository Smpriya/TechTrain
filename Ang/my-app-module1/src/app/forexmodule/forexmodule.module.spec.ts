import { ForexmoduleModule } from './forexmodule.module';

describe('ForexmoduleModule', () => {
  let forexmoduleModule: ForexmoduleModule;

  beforeEach(() => {
    forexmoduleModule = new ForexmoduleModule();
  });

  it('should create an instance', () => {
    expect(forexmoduleModule).toBeTruthy();
  });
});
