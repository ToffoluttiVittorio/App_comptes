import { Component } from '@angular/core';
import { HelloComponent } from './components/hello/hello.component';  // Importer le composant HelloComponent

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  standalone: true,  // Cette ligne indique que AppComponent est standalone
  imports: [HelloComponent]  // Ajouter HelloComponent dans les imports
})
export class AppComponent {
  title = 'Hello, cette page sera la future application web';
}
