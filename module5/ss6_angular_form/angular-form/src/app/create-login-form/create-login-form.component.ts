import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-create-login-form',
  templateUrl: './create-login-form.component.html',
  styleUrls: ['./create-login-form.component.css']
})
export class CreateLoginFormComponent implements OnInit {
loginFormReactive: FormGroup;
@Output() submitLogin = new EventEmitter();
  constructor() {
    this.loginFormReactive = new FormGroup({
      email: new FormControl('',[Validators.required,Validators.pattern("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")]),
      password: new FormControl('',[Validators.required,Validators.minLength(6)])
    })
  }

  ngOnInit(): void {
  }

  loginWithReactive(){
    if(this.loginFormReactive.valid){
      this.submitLogin.emit(this.loginFormReactive.value)
    }
  }

}
