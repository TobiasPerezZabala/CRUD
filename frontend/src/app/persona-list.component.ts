import { Component, OnInit } from '@angular/core';
import { PersonaService } from './persona.service';

@Component({
  selector: 'app-persona-list',
  templateUrl: './app.component.html'
})
export class PersonaListComponent implements OnInit {
  personas: any;

  constructor(private personaService: PersonaService) { }

  ngOnInit(): void {
    this.personaService.getPersonas().subscribe(data => {
      this.personas = data;
    });
  }
}
