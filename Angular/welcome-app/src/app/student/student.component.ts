import { Component, OnInit } from '@angular/core';
import { IStudent } from './IStudent';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
  Student: IStudent = {};
  studentsList: IStudent[] = [];
  constructor() {

  }

  loadStudent() {
    this.Student = {
      name: "prasad",
      rollno: 101,
      cgpa: 9.46
    }
  }

  loadStudents() {
    this.studentsList = [{
      name: "ash",
      rollno: 102,
      cgpa: 7.45
    }, {
      name: "sim",
      rollno: 103,
      cgpa: 6.45
    }]
  }
  ngOnInit(): void {
  }

}
