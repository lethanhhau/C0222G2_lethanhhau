import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {DictionaryService} from '../service/dictionary.service';
import {Dictionary} from '../model/dictionary';

@Component({
  selector: 'app-dictionary-detail',
  templateUrl: './dictionary-detail.component.html',
  styleUrls: ['./dictionary-detail.component.css']
})
export class DictionaryDetailComponent implements OnInit {
  dictionary: Dictionary = {};
  constructor(private activatedRoute: ActivatedRoute, private dictionaryService: DictionaryService) {
    activatedRoute.paramMap
      .subscribe({
        next: (data) => {
          this.dictionary = this.dictionaryService.findWord(data.get('word'))[0];
        }, error: err => {
          console.log(err);
        }, complete: () => {
          console.log('Complete');
        }
      })
      .unsubscribe();
  }

  ngOnInit(): void {
  }

}
