import {Component, ViewChild, ElementRef, ChangeDetectionStrategy} from '@angular/core';
import {jsPDF} from 'jspdf';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  changeDetection: ChangeDetectionStrategy.OnPush,
})

export class AppComponent {

  @ViewChild('htmlData') htmlData: ElementRef;

  USERS = [
    {
      'id': 1,
      'name': 'Leanne Graham',
      'email': 'sincere@april.biz',
      'phone': '1-770-736-8031 x56442'
    },
    {
      'id': 2,
      'name': 'Ervin Howell',
      'email': 'shanna@melissa.tv',
      'phone': '010-692-6593 x09125'
    },
    {
      'id': 3,
      'name': 'Clementine Bauch',
      'email': 'nathan@yesenia.net',
      'phone': '1-463-123-4447',
    },
    {
      'id': 4,
      'name': 'Patricia Lebsack',
      'email': 'julianne@kory.org',
      'phone': '493-170-9623 x156'
    },
    {
      'id': 5,
      'name': 'Chelsey Dietrich',
      'email': 'lucio@annie.ca',
      'phone': '(254)954-1289'
    },
    {
      'id': 6,
      'name': 'Mrs. Dennis',
      'email': 'karley@jasper.info',
      'phone': '1-477-935-8478 x6430'
    }
  ];

  constructor() {
  }

  public openPDF(): void {
    let DATA = this.htmlData.nativeElement;

    let doc = new jsPDF('p', 'pt', 'a4');
    doc.html(DATA.innerHTML, {
      callback(rst) {
        rst.output('dataurlnewwindow');
      },
      x: 25,
      y: 25
    });
  }


  public downloadPDF(): void {
    let DATA = this.htmlData.nativeElement;
    let doc = new jsPDF('p', 'pt', 'a4');

    let handleElement = {
      '#editor': function(element, renderer) {
        return true;
      }
    };
    doc.html(DATA.innerHTML, {
      callback(rst) {
        rst.save('one.pdf');
      },
      x: 25,
      y: 25
    });

  }
}
