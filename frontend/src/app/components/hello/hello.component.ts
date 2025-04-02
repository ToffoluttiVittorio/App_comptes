import { Component } from '@angular/core';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  standalone: true,
  styleUrls: ['./hello.component.css']
})
export class HelloComponent {
  message: string = "Hello, cette page sera la future application web";
}
