import { Injectable } from '@angular/core';
import {Dictionary} from '../model/dictionary';

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  dictionaries: Dictionary[] = [];
  constructor() {
    this.dictionaries.push({word: 'car', mean: 'xe hơi'});
    this.dictionaries.push({word: 'hello', mean: 'xin Chào'});
    this.dictionaries.push({word: 'rose', mean: 'Hoa Hồng'});
    this.dictionaries.push({word: 'money', mean: 'Tiền'});
    this.dictionaries.push({word: 'monkey', mean: 'Con khỉ'});
    this.dictionaries.push({word: 'dog', mean: 'Con chó'});
  }

  findAll() {
    return this.dictionaries;
  }

  findWord(word: string) {
    return this.dictionaries.filter(data => data.word === word);
  }
}
