import { Component, OnInit } from '@angular/core';
import {Pet} from '../pet';

@Component({
  selector: 'app-pet',
  templateUrl: './pet.component.html',
  styleUrls: ['./pet.component.css']
})
export class PetComponent implements OnInit {
  pet: Pet = {
    name: 'plu',
    image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRelwaDs2hVvmHZfw7ygnq96y3cXFy5gu6dg&usqp=CAU'
  };
  constructor() { }

  ngOnInit() {
  }

}
