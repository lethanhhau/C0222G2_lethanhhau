import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {AbstractControl, FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-create-registration-form',
  templateUrl: './create-registration-form.component.html',
  styleUrls: ['./create-registration-form.component.css']
})
export class CreateRegistrationFormComponent implements OnInit {
  registrationFormReactive: FormGroup;
  @Output() submit = new EventEmitter();

  constructor() {
    this.registrationFormReactive = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.pattern('^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$')]),
      pass: new FormGroup({
        password: new FormControl('', [Validators.required, Validators.minLength(6)]),
        confirmPassword: new FormControl('', [Validators.required, Validators.minLength(6)]),
      }, this.checkConfirmPassword),
      country: new FormControl(),
      age: new FormControl('', [Validators.required, Validators.min(18), Validators.max(100)]),
      gender: new FormControl(),
      phone: new FormControl('', [Validators.required, Validators.pattern('^((09)|(\\(84\\)\\+9))[0-1][0-9]{7}$')])
    });
  }

  ngOnInit(): void {
  }

  registrationWithReactive() {
    // console.log(this.registrationFormReactive);
    if (this.registrationFormReactive.valid) {
      this.submit.emit(this.registrationFormReactive.value);
    }
  }

  checkConfirmPassword(pass: AbstractControl) {
    let value = pass.value;
    if (value.password != value.confirmPassword) {
      return {'confirmPassword': true};
    }
    return null;
  }
}
