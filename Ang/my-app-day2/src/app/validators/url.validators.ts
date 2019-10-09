import { AbstractControl } from "@angular/forms";

export function ValidateUrl(control: AbstractControl) {
  console.log("### Custom Vali==" + control.value);
  if (!control.value.startsWith("https") || !control.value.includes(".io")) {
    console.log("====> Custom Vali==" + control.value);
    return { validUrl: true };
  }
  return null;
}
