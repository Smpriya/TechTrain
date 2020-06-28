import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';

import { Product } from './product';

import { map, filter, scan } from 'rxjs/operators';

@Injectable({
providedIn: 'root'
})
export class DataService {
	baseUrl:string = "http://localhost:3000";

	constructor(private httpClient : HttpClient) {}

	get_products(): Observable<Product[]>{
		return this.httpClient.get<Product[]>(this.baseUrl + '/products');
	}

	get_promise(): Promise<Product[]>{
		return this.httpClient.get<Product[]>(this.baseUrl + '/products').toPromise();
	}
	
	//get_products2(): Observable<Product[]>{
		//return this.httpClient.get<Product[]>(this.baseUrl + '/products').pipe(filter(product[] => {
		//	console.log(product);
		//}));
		//return this.httpClient.get<Product[]>(this.baseUrl + '/products');
	//}
	
	
	
	get_families(){
		return this.httpClient.get(this.baseUrl + '/families');
	}
	get_locations(){
		return this.httpClient.get(this.baseUrl + '/locations');
	}
	get_transactions(){
		return this.httpClient.get(this.baseUrl + '/families');
	}

}