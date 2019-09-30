export class BaseComponent {
  compName: string = "## Component Name Not Defined ##";

  public setComponentName(value: string) {
    this.compName = value;
  }

  public getComponentName(): string {
    return this.compName;
  }

  public getErrorMessageString(key: String, data?: string[]): string {
    let value: string = "none-none-none";
    console.log("|-|" + key);
    if (key === "login1") {
      this.compName = "Unknown Error in Login-Login Component";
    } else {
      // some value
    }
    value = this.compName;
    console.log("|-|" + value);
    if (data != "undefined") {
      value = value + "-" + data;
    }
    console.log("|-|-" + value);

    return value;
  }
}
