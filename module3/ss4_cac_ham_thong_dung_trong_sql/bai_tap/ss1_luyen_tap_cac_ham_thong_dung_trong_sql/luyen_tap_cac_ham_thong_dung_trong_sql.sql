drop database quan_ly_sinh_vien;
create database quan_ly_sinh_vien;
use quan_ly_sinh_vien;

create table `class`(
Class_ID   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Class_Name VARCHAR(60) NOT NULL,
    Start_Date DATETIME    NOT NULL,
    `Status`    BIT
);

CREATE TABLE Student
(
    Student_Id   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Student_Name VARCHAR(30) NOT NULL,
    Address     VARCHAR(50),
    Phone       VARCHAR(20),
    `Status`      BIT,
    Class_Id     INT         NOT NULL,
    FOREIGN KEY (Class_Id) REFERENCES Class (Class_ID)
);

CREATE TABLE Subject
(
    Sub_Id   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Sub_Name VARCHAR(30) NOT NULL,
    Credit  TINYINT     NOT NULL DEFAULT 1 CHECK ( Credit >= 1 ),
    `Status`  BIT                  DEFAULT 1
);

CREATE TABLE Mark
(
    Mark_Id    INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Sub_Id     INT NOT NULL,
    Student_Id INT NOT NULL,
    Mark      FLOAT   DEFAULT 0 CHECK ( Mark BETWEEN 0 AND 100),
    Exam_Times TINYINT DEFAULT 1,
    UNIQUE (Sub_Id, Student_Id),
    FOREIGN KEY (Sub_Id) REFERENCES Subject (Sub_Id),
    FOREIGN KEY (Student_Id) REFERENCES Student (Student_Id)
);

insert into class
value(1, 'A1', '2008-12-20', 1),(2, 'A2', '2008-12-22', 1),(3, 'B3', current_date, 0);

insert into Student (Student_Name, Address, Phone, Status, Class_Id)
value('Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO Student (Student_Name, Address, Status, Class_Id)
VALUES ('Hoa', 'Hai phong', 1, 1);
INSERT INTO Student (Student_Name, Address, Phone, Status, Class_Id)
VALUES ('Manh', 'HCM', '0123123123', 0, 2);

INSERT INTO Subject
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
INSERT INTO Mark (Sub_Id, Student_Id, Mark, Exam_Times)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);       
       
select `subject`.* from `subject`
where Credit = (select  max(Credit) from `subject` );

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select `subject`.*, max(Credit)
from `subject`;
-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select `subject`.*,mark.Mark from `subject`
join mark on `subject`.Sub_Id = mark.Sub_Id
where mark.Mark = (select max(mark.Mark) from `subject`
join mark on `subject`.Sub_Id = mark.Sub_Id);

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select student.*,avg(mark.mark) as diem_trung_binh
from student
join mark on student.student_id = mark.Student_Id
group by Student_Id
order by student_id;
