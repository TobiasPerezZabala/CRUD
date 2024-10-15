import { Component, OnInit } from '@angular/core';
import { RouterOutlet, RouterModule } from '@angular/router';
import { PersonaService } from './persona.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,
    CommonModule
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent implements OnInit{
  personas: any[] = [];

  constructor(private personaService: PersonaService) { }


  ngOnInit(): void {
    this.personaService.getPersonas().subscribe(data => {
      this.personas = data;
    });
  }
}
