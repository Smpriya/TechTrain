import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { SelectivePreloadingStrategy } from './selective-preloading-strategy';

import { FundtransferformComponent }   from './paymentmodule/fundtransferform.component';
import { ForexManagementformComponent }   from './forexmodule/forexmgmtform.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  { path: 'fundtransfer',  component: FundtransferformComponent},
  { path: 'fxmgmt',component: ForexManagementformComponent},
  { path: 'login',component: LoginComponent},
  { path: '', redirectTo: '/login', pathMatch: 'full' }
];

@NgModule({
  imports: [ RouterModule.forRoot(
                      routes,
                      {
                        enableTracing: false, // <-- debugging purposes only
                        preloadingStrategy: SelectivePreloadingStrategy,

                      }
    ) ],
  exports: [ RouterModule ],
  providers: [
    SelectivePreloadingStrategy
  ]
})
export class AppRoutingModule {}
