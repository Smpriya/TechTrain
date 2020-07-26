import { Component, OnInit } from '@angular/core';
import { select, Store } from '@ngrx/store';
import { Observable, Subscription } from 'rxjs';
import { map } from 'rxjs/operators';
import * as ToDoActions from './todo.action';
import { ToDo } from './todo.model';
import ToDoState from './todo.state';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  implements OnInit{

  todo$: Observable<ToDoState>;
  ToDoSubscription: Subscription;
  ToDoList: ToDo[] = [];
  todoError: Error;

  Title: string = '';
  IsCompleted: boolean = false;


  constructor(private store: Store<{ todos: ToDoState }>) {
    this.todo$ = store.pipe(select('todos'));
  }

  
  ngOnInit(): void {
    this.ToDoSubscription = this.todo$
    .pipe(
      map(x => {
        this.ToDoList = x.ToDos;
        this.todoError = x.ToDoError;
        console.log("=====1>>" + JSON.stringify(this.ToDoList));
        console.log("=====2>>" + JSON.stringify(this.todoError));
      })
    ).subscribe();

    this.store.dispatch(ToDoActions.BeginGetToDoAction());
  }

  createToDo() {
    //this.Title = 'Thirukural';
    //this.IsCompleted = true;
    const todo: ToDo = { Title: this.Title, IsCompleted: this.IsCompleted };
    this.store.dispatch(ToDoActions.BeginCreateToDoAction({ payload: todo }));
    this.Title = '';
    this.IsCompleted = false;
  }

  ngOnDestroy() {
    if (this.ToDoSubscription) {
      this.ToDoSubscription.unsubscribe();
    }
  }
  
  // constructor(private store: Store<{ todos: ToDoState }>) {
  //   this.todo$ = store.pipe(select('todos'));
  // }

  // ngOnInit() {
  //   this.ToDoSubscription = this.todo$
  //     .pipe(
  //       map(x => {
  //         this.ToDoList = x.ToDos;
  //         this.todoError = x.ToDoError;
  //       })
  //     )
  //     .subscribe();

  //   this.store.dispatch(ToDoActions.BeginGetToDoAction());
  // }

  // todo$: Observable<ToDoState>;
  // ToDoSubscription: Subscription;
  // ToDoList: ToDo[] = [];

  // Title: string = '';
  // IsCompleted: boolean = false;

  // todoError: Error = null;

  // createToDo() {
  //   const todo: ToDo = { Title: this.Title, IsCompleted: this.IsCompleted };
  //   this.store.dispatch(ToDoActions.BeginCreateToDoAction({ payload: todo }));
  //   this.Title = '';
  //   this.IsCompleted = false;
  // }

  // ngOnDestroy() {
  //   if (this.ToDoSubscription) {
  //     this.ToDoSubscription.unsubscribe();
  //   }
  // }
}
