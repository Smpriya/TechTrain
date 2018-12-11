import {Injectable, Inject} from '@angular/core';
import { TRANSLATIONS } from './translations'; // import our opaque token

@Injectable()
export class TranslateService {
	private _currentLang: string;

	public get currentLang() {
	  return this._currentLang;
	}

  // inject our translations
	constructor(@Inject(TRANSLATIONS) private _translations: any) {
	}

	public use(lang: string): void {
		// set current language
		this._currentLang = lang;
	}

	private translate(key: string): string {
		// private perform translation
		let translation = key;
		console.log("==" + JSON.stringify(this._translations));
    console.log(this.currentLang + "=" + JSON.stringify(this._translations[this.currentLang]));
    if (this._translations[this.currentLang] && this._translations[this.currentLang][key]) {
			return this._translations[this.currentLang][key];
		}

		return translation;
	}

	public instant(key: string) {
		// public perform translation
		return this.translate(key);
	}
}
