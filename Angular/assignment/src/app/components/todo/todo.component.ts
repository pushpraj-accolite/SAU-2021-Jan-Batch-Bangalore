import { Component, OnInit } from '@angular/core';
import { GetApiService } from '../../get-api.service';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.scss']
})
export class TodoComponent implements OnInit {

  todos:any;

  constructor(private api: GetApiService) {   
  }

  ngOnInit(): void {
    this.api.apiCall().subscribe((data)=>{
      this.todos = data;
      console.log(this.todos);
    });
  }

  selectedTodo : any;
  onSelecttodo(todo: any){
    this.selectedTodo = todo;
  };
}
