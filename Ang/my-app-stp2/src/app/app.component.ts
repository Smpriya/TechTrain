import { Component } from '@angular/core';

export class Hero {
  id: number;
  name: string;
}

const HEROES: Hero[] = [
  { id: 11, name: 'Mr. Nice' },
  { id: 12, name: 'Kala' },
  { id: 13, name: 'Bombasto' },
  { id: 14, name: 'Kabali' },
  { id: 15, name: 'Magneta' },
  { id: 16, name: 'RubberMan' },
  { id: 17, name: 'Padaiyappa' },
  { id: 18, name: 'Dr IQ' },
  { id: 19, name: 'Magma' },
  { id: 20, name: 'Tornado' }
];

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'vrtsa';
  heroes = HEROES;
  selectedHero: Hero;


  onSelect(hero: Hero): void {
    console.log("====" + hero.name);
    this.selectedHero = hero;
  }


}
