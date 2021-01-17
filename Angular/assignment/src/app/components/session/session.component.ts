import { Component, OnInit } from '@angular/core';
import { Sess } from '../../models/Sess';

@Component({
  selector: 'app-session',
  templateUrl: './session.component.html',
  styleUrls: ['./session.component.scss']
})
export class SessionComponent implements OnInit {

    sessions: Sess[] = [];
    constructor() { }

    delete_session(session: Sess): void{
      
    const index = this.sessions.indexOf(session);
    this.sessions.splice(index, 1);
  }

  add_item(f: any): void{
    if(f.session_name != ""){
    this.sessions.push({name:f.session_name,trainer:f.trainer_name,date:f.session_date}); 
    }
  }

  ngOnInit(): void {
      this.sessions = [
        {
        name: "React Js",
        trainer: 'trainer 1',
        date:'07-01-2021'  
      },
      {
        name: "React Native",
        trainer: 'trainer 2',
        date:'08-01-2021'  
      },
      {
        name: "Angular",
        trainer: 'trainer 3',
        date:'09-01-2021'  
      }
    ]
  }

  selectedSession : Sess = new Sess();
  onSelect(session: Sess){
    this.selectedSession = session;
  };
}
