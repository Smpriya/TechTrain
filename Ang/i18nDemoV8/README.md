ng xi18n --i18n-locale ta --out-file locale/messages.ta.xlf
ng xi18n --i18n-locale en --out-file locale/messages.en.xlf


ng serve --configuration=ta
ng serve --configuration=en


ng build --configuration=ta
ng build --configuration=en

ng build --prod --i18n-file locale/messages.ta.xlf --i18n-format xlf --i18n-locale ta
ng build --prod --i18n-file locale/messages.en.xlf --i18n-format xlf --i18n-locale en
