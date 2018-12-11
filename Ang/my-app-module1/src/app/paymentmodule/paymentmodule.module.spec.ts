import { PaymentmoduleModule } from './paymentmodule.module';

describe('PaymentmoduleModule', () => {
  let paymentmoduleModule: PaymentmoduleModule;

  beforeEach(() => {
    paymentmoduleModule = new PaymentmoduleModule();
  });

  it('should create an instance', () => {
    expect(paymentmoduleModule).toBeTruthy();
  });
});
