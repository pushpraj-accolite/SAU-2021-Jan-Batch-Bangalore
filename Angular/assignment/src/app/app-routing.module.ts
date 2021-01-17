import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SessionComponent } from './components/session/session.component'
import { TodoComponent } from './components/todo/todo.component'

const routes: Routes = [
  {
    path:'session',
    component:SessionComponent
  },
  {
    path: 'todo',
    component:TodoComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
