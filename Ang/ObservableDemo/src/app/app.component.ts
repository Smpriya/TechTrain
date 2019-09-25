import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
	
	title = 'ObservableDemo';
  
	constructor(private httpClient: HttpClient){}
	
	private products  = []
	
	
  
	get_products(){
		this.httpClient.get("http://localhost:3000/products").subscribe((res:any[])=>{
			console.log(res);
			this.products = res;
		});
	}
	
  
}
