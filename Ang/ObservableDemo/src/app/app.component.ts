import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { DataService } from './data.service';

import { Product } from './product';
import { Family } from './family';
import { Location } from './location';
import { Transaction } from './transaction';

import { Observable } from 'rxjs';

import { map, filter, scan } from 'rxjs/operators';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
	
	private products : Product[] = []; 
    private products2 : Product[] = [];
	
	private families : Family[] = [];
    private locations : Location[] = [];
    private transactions : Transaction[] = [];
	
	title = 'ObservableDemo';
  
//	constructor(private httpClient: HttpClient){}
	
//	private products  = [];
	private productsObservable : Observable<Product[]>; 
	
	constructor(private dataService: DataService){

        //this.productsObservable = this.dataService.get_products();
		
		this.dataService.get_products().subscribe((res : Product[])=>{
            this.products = res;
        });

		
		this.dataService.get_products().pipe(
			map(data => {
				data.map(d=>d.cost=d.cost+100)
				//console.log("===");
				//console.log(data);
				return data;
			}),
			map(data => data.filter(prod => prod.cost > 110)),
			map(data => data.filter(prod => prod.cost > 120)),
		).subscribe((res : Product[])=>{
            this.products = res;
        });


        this.dataService.get_families().subscribe((res : Family[])=>{
            this.families = res;
        });
        
		this.dataService.get_locations().subscribe((res : Location[])=>{
            this.locations = res;
        });
        
		this.dataService.get_transactions().subscribe((res : Transaction[])=>{
            this.transactions = res;
        });    
    }

	
	
  
}
