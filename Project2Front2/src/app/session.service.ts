import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';
import { BehaviorSubject } from 'rxjs';
import { Router } from '../../node_modules/@angular/router';
import { User } from './model/user';

@Injectable({
  providedIn: 'root'
})
export class SessionService {
  userId:string;
  private loggedIn = new BehaviorSubject<boolean>(false);
  
  constructor(private httpClient: HttpClient,
    private router: Router) { }

    isValidSession(bool:boolean){
      this.loggedIn.next(bool);
      console.log("you have a session");
    }

    login(username, password){

    
      const headers = {
        headers: new HttpHeaders({
          'Content-Type':  'application/x-www-form-urlencoded',
        }), withCredentials:false
      };   
  
      let body = `username=${username}&password=${password}`;
      
      

      this.httpClient.post("http://localhost:8080/login",body,  headers )
      .subscribe( (data:any) => {
        if(data){
          this.router.navigateByUrl('/userhome');
          let users:User = data;
          console.log(users);
          document.getElementById('nameholder').innerHTML = users.fullname;
          this.isValidSession(true);
        }
      });
  
    }

    logout(){
      this.httpClient.get("http://localhost:8080/logout",{withCredentials:true}).subscribe();
      this.isValidSession(false);
    }
  
  }
