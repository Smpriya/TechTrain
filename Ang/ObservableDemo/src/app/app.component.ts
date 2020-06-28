import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { DataService } from './data.service';

import { Product } from './product';
import { Family } from './family';
import { Location } from './location';
import { Transaction } from './transaction';

import { Observable, of } from 'rxjs';

import { map, filter, scan, catchError } from 'rxjs/operators';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
export class AppComponent {

    private products: Product[] = [];
    private products2: Product[] = [];

    private families: Family[] = [];
    private locations: Location[] = [];
    private transactions: Transaction[] = [];

    title = 'ObservableDemo';

    private productsObservable: Observable<Product[]>;

    constructor(private dataService: DataService) {

        this.productsObservable = this.dataService.get_products();

        this.dataService.get_products().subscribe((res: Product[]) => {
            this.products = res;
        });


        // this.dataService.get_products().pipe(
        // 	map(data => {
        // 		data.map(d=>d.cost=d.cost+100)
        // 		//console.log("===");
        // 		//console.log(data);
        // 		return data;
        // 	}),
        // 	map(data => data.filter(prod => prod.cost > 110)),
        // 	map(data => data.filter(prod => prod.cost > 120)),
        // ).subscribe((res : Product[])=>{
        //     this.products = res;
        // });


        this.dataService.get_families().subscribe((res: Family[]) => {
            this.families = res;
        });

        this.dataService.get_locations().subscribe((res: Location[]) => {
            this.locations = res;
        });

        this.dataService.get_transactions().subscribe((res: Transaction[]) => {
            this.transactions = res;
        });
    }

    public get_products2() {
        this.dataService.get_products().pipe(
            map(data => {
                data.map(d => d.cost = d.cost + 200);
                return data;
            }),
            map(data => data.filter(prod => prod.cost > 90)),
            map(data => data.filter(prod => prod.cost > 100))
        ).subscribe((res: Product[]) => {
            this.products2 = res;
        },
            err => {
                console.error("Error in Observable==" + JSON.stringify(err));
            },
            () => console.log("Processing Complte.")
        );
    }

    public makepromise() {
        this.dataService.get_promise().then((data: any) => {
            console.log("=======================");
            console.log(JSON.stringify(data));
        }).catch((err) => {
            alert("Error in Promise call=" + err);
            console.error("========Error" + err);
        }).finally(() => {
            console.log("ALl Comppleted");
        });
    }

    public simpleobservable() {
        const myObservable = of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        const myObserver = {
            next: x => console.log("Printing all values in the array.." + x),
            error: err => console.error("Error in Printing values.." + err),
            complete: () => console.log("Processing complete..")
        }

        myObservable.subscribe(myObserver);
    }

    public complexobservable() {
        of("Chennai", "Bangalore", "Pondicheerry", "Hyderabad", "Delhi", "Mumbai").pipe(
            map(e1 => {
                if (e1 === "Mumbai") {
                    throw new Error("Error in processing Record");
                }
                return e1;
            }),
            catchError(err => {
                console.error("Error Handled" + err);
                return of("Trivandrum");
            })).subscribe(e1 => console.log(e1),
                err => console.error(err),
                () => console.log("processing complete")
            );

    }

}
