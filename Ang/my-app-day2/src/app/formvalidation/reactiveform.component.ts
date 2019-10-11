import { FormBuilder, FormGroup, Validators } from "@angular/forms";
import { Component, OnInit } from "@angular/core";

import { User } from "../uimodel/data-model";
import { ValidateUrl } from "../validators/url.validators";
import { ageRangeValidator } from "../validators/age.validators";

@Component({
  selector: "reactiveform",
  templateUrl: "./reactiveform.component.html",
  styleUrls: ["./reactiveform.component.css"]
})
export class ReactiveformComponent implements OnInit {
  //Inject the formbuilder into the constructor
  constructor(private fb: FormBuilder) {}

  //Property for the user
  private user: User;

  myage: number;
  //Gender list for the select control element
  genderList: string[];
  signupForm: FormGroup;
  min = 30;
  max = 90;

  ngOnInit() {
    this.genderList = ["Male", "Female", "Others"];
    // /,    twitterurl: [null];
    // Use the formbuilder to build the Form model
    this.signupForm = this.fb.group({
      email: [
        "",
        [
          Validators.required,
          Validators.pattern("[a-z0-9._%+-]+@[a-z0-9.-]+.[a-z]{2,3}$")
        ]
      ],
      password: this.fb.group({
        pwd: ["", [Validators.required, Validators.minLength(8)]],
        confirmPwd: ["", [Validators.required, Validators.minLength(8)]]
      }),
      gender: ["", Validators.required],
      terms: ["", Validators.requiredTrue],
      twitterurl: ["", [Validators.required, ValidateUrl]],
      age: ["", [Validators.required, ageRangeValidator(this.min, this.max)]],
      optionA: [],
      optionB: [],
      passportnumber: [
        { value: "", disabled: true },
        [Validators.required, Validators.minLength(3), Validators.maxLength(10)]
      ]
    });

    this.optionA.valueChanges.subscribe(checked => {
      checked ? this.passportnumber.enable() : this.passportnumber.disable();
    });
  }

  get email() {
    return this.signupForm.get("email");
  }

  get password() {
    return this.signupForm.get("password");
  }

  get gender() {
    return this.signupForm.get("gender");
  }

  get terms() {
    return this.signupForm.get("terms");
  }

  get twitterurl() {
    return this.signupForm.get("twitterurl");
  }

  get age() {
    return this.signupForm.get("age");
  }

  get optionA() {
    return this.signupForm.get("optionA");
  }

  get optionB() {
    return this.signupForm.get("optionB");
  }

  get passportnumber() {
    return this.signupForm.get("passportnumber");
  }

  public onFormSubmit() {
    this.myage = 0;
    if (this.myage == 0) {
      alert("hi" + this.myage);
      //throw new Error("Im errorn");
    }

    if (this.signupForm.valid) {
      this.user = this.signupForm.value;
      console.log(this.user);
      /* Any API call logic via services goes here */
    }
  }
}
