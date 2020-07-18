import { TestBed, async, ComponentFixture } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';
import { AuthService } from './auth.service';

describe('AppComponent', () => {

  let service:AuthService;
  let spy:any;
  let component:AppComponent;
  let fixture:ComponentFixture<AppComponent>;


  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        RouterTestingModule
      ],
      declarations: [
        AppComponent
      ],
      providers:[AuthService]
    }).compileComponents();
  }));

  beforeEach(()=>{
    console.log("===========Before Each=============");
    service = new AuthService();
    component = new AppComponent(service);
  })

  afterEach(()=>{
    console.log("===========After Each=============");
    service = null;
    component = null;
  })

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'angTest'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.title).toEqual('angTest');
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement;
    expect(compiled.querySelector('div span').textContent).toContain('angTest app is running!');
  });

  it('should render title2', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement;
    expect(compiled.querySelector('div h1').textContent).toContain('angTest-testing app may be running!');
  });

  it('Needs Login', () => {
    
    spy = spyOn(service,"isAuthenticated").and.returnValue(false);
    expect(component.needsLogin()).toBeTruthy();

    expect(component.needsLogin()).toEqual(true);

    expect(service.isAuthenticated).toHaveBeenCalled();

  });

  it('Needs Login v2', () => {
    
    spy = spyOn(service,"isAuthenticated").and.returnValue(true);
    
    expect(component.needsLogin()).toBeFalsy();

    expect(service.isAuthenticated).toHaveBeenCalled();

  });


});
