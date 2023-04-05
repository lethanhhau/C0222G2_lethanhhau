import {Component, ElementRef, ViewChild} from '@angular/core';
import jsPDF from 'jspdf';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'pdf';

  Data = [
    { Id: 101, Name: 'Nitin', Salary: 1234 },
    { Id: 102, Name: 'Sonu', Salary: 1234 },
    { Id: 103, Name: 'Mohit', Salary: 1234 },
    { Id: 104, Name: 'Rahul', Salary: 1234 },
    { Id: 105, Name: 'Kunal', Salary: 1234 }
  ];

  @ViewChild('content') content: ElementRef;
  public SavePDF(): void {
    const content = this.content.nativeElement;
    const doc = new jsPDF();
    // tslint:disable-next-line:variable-name
    const _elementHandlers =
      {
        '#editor':function(element,renderer){
          return true;
        }
      };
    doc.fromHTML(content.innerHTML,15,15,{

      'width':190,
      'elementHandlers':_elementHandlers
    });

    doc.save('test.pdf');
  }
}

