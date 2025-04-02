import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { HelloComponent } from './components/hello/hello.component';  // Importer le composant HelloComponent

@NgModule({
  imports: [
    BrowserModule,
    HelloComponent  // Ajoute le composant standalone ici dans imports
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
