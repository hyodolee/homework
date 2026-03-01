-- 강의실
CREATE TABLE Room (
  roomnum int(11) NOT NULL,
  roomcapa int(11) NOT NULL,
  PRIMARY KEY (roomnum)
) ;

INSERT INTO Room VALUES
(901,34),
(902,35),
(903,25),
(904,32),
(905,30),
(906,35);

-- 학생
CREATE TABLE Student (
  studentnum int(11) NOT NULL AUTO_INCREMENT,
  name varchar(12) NOT NULL,
  jumin varchar(14) NOT NULL,
  address varchar(50) DEFAULT NULL,
  email varchar(20) DEFAULT NULL,
  PRIMARY KEY (studentnum)
) ;

INSERT INTO Student VALUES
(1,'김현진','771212-2346111','017-888-8888','부산'),
(2,'김석주','720112-1234812','016-999-9999','경기'),
(3,'고훈기','730102-1555555','017-555-5555','서울'),
(4,'유민경','801111-2222222','017-222-2222','전남'),
(5,'김영수','811231-1777777','017-777-7777','충주'),
(6,'박상원','790915-1333333','017-333-3333','강원');

-- 과목
CREATE TABLE Subject (
  subcode varchar(5) NOT NULL,
  subname varchar(20) NOT NULL,
  PRIMARY KEY (subcode)
);

INSERT INTO Subject VALUES
('j1001','sql'),
('j1002','Win2000'),
('j1003','ASP'),
('j1004','Php'),
('j1005','java'),
('j1006','javascript');

-- 수강
-- 수강테이블에 동일한 학생이 여러과목을 듣는다면 수강생번호가 중복이되서 문제가 있어 보입니다.
CREATE TABLE Sugang (
  studentnum int(11) NOT NULL,
  subcode varchar(5) DEFAULT NULL,
  PRIMARY KEY (studentnum),
  CONSTRAINT Sugang_Student_FK FOREIGN KEY (studentnum) REFERENCES Student (studentnum),
  CONSTRAINT Sugang_Subject_FK FOREIGN KEY (subcode) REFERENCES Subject (subcode)
) ;

INSERT INTO Sugang VALUES
(1,'j1001'),
(2,'j1002'),
(3,'j1003'),
(4,'j1004'),
(5,'j1005'),
(6,'j1006');

-- 강사
CREATE TABLE Teacher (
  teachernum int(11) NOT NULL AUTO_INCREMENT,
  name varchar(12) NOT NULL,
  jumin varchar(14) NOT NULL,
  phone varchar(14) NOT NULL,
  address varchar(50) DEFAULT NULL,
  email varchar(20) DEFAULT NULL,
  subcode varchar(5) DEFAULT NULL,
  PRIMARY KEY (teachernum),
  KEY Teacher_Subject_FK (subcode),
  CONSTRAINT Teacher_Subject_FK FOREIGN KEY (subcode) REFERENCES Subject (subcode)
);

INSERT INTO Teacher VALUES
(1,'홍길동','700918-1622011','031-295-1234','성남시 중원구 신흥동','kkk@jok.or.kr','j1001'),
(2,'유관순','710419-2018916','02-345-2345','서울 강남구 개포동','kkk@jok.or.kr','j1002'),
(3,'이승복','730112-1344911','031-1234-6789','서울시 강남구 논현동','sss@jok.or.kr','j1003'),
(4,'모택동','730301-1167623','031-567-5678','서울시 서초구 서초동','mmm@jok.or.kr','j1004'),
(5,'주롱지','730322-2037921','031-789-3456','서울시 강서구 가양동','xxx@jok.or.kr','j1005'),
(6,'이순신','731122-1646213','031-234-8901','서울시 강북구 미아동','ppp@jok.or.kr','j1006');

-- 수강과목
CREATE TABLE SugangTB (
  subcode varchar(5) NOT NULL,
  roomnum int(11) DEFAULT NULL,
  time int(11) NOT NULL,
  teachernum int(11) DEFAULT NULL,
  PRIMARY KEY (subcode),
  CONSTRAINT SugangTB_Room_FK FOREIGN KEY (roomnum) REFERENCES Room (roomnum),
  CONSTRAINT SugangTB_Subject_FK FOREIGN KEY (subcode) REFERENCES Subject (subcode),
  CONSTRAINT SugangTB_Teacher_FK FOREIGN KEY (teachernum) REFERENCES Teacher (teachernum)
);

INSERT INTO SugangTB VALUES
('j1001',901,2,1),
('j1002',902,2,2),-- 강의실
CREATE TABLE Room (
  roomnum int(11) NOT NULL,
  roomcapa int(11) NOT NULL,
  PRIMARY KEY (roomnum)
) ;

INSERT INTO Room VALUES
(901,34),
(902,35),
(903,25),
(904,32),
(905,30),
(906,35);

-- 학생
CREATE TABLE Student (
  studentnum int(11) NOT NULL AUTO_INCREMENT,
  name varchar(12) NOT NULL,
  jumin varchar(14) NOT NULL,
  address varchar(50) DEFAULT NULL,
  email varchar(20) DEFAULT NULL,
  PRIMARY KEY (studentnum)
) ;

INSERT INTO Student VALUES
(1,'김현진','771212-2346111','017-888-8888','부산'),
(2,'김석주','720112-1234812','016-999-9999','경기'),
(3,'고훈기','730102-1555555','017-555-5555','서울'),
(4,'유민경','801111-2222222','017-222-2222','전남'),
(5,'김영수','811231-1777777','017-777-7777','충주'),
(6,'박상원','790915-1333333','017-333-3333','강원');

-- 과목
CREATE TABLE Subject (
  subcode varchar(5) NOT NULL,
  subname varchar(20) NOT NULL,
  PRIMARY KEY (subcode)
);

INSERT INTO Subject VALUES
('j1001','sql'),
('j1002','Win2000'),
('j1003','ASP'),
('j1004','Php'),
('j1005','java'),
('j1006','javascript');

-- 수강
CREATE TABLE Sugang (
  studentnum int(11) NOT NULL,
  subcode varchar(5) DEFAULT NULL,
  PRIMARY KEY (studentnum),
  CONSTRAINT Sugang_Student_FK FOREIGN KEY (studentnum) REFERENCES Student (studentnum),
  CONSTRAINT Sugang_Subject_FK FOREIGN KEY (subcode) REFERENCES Subject (subcode)
) ;

INSERT INTO Sugang VALUES
(1,'j1001'),
(2,'j1002'),
(3,'j1003'),
(4,'j1004'),
(5,'j1005'),
(6,'j1006');

-- 강사
CREATE TABLE Teacher (
  teachernum int(11) NOT NULL AUTO_INCREMENT,
  name varchar(12) NOT NULL,
  jumin varchar(14) NOT NULL,
  phone varchar(14) NOT NULL,
  address varchar(50) DEFAULT NULL,
  email varchar(20) DEFAULT NULL,
  subcode varchar(5) DEFAULT NULL,
  PRIMARY KEY (teachernum),
  KEY Teacher_Subject_FK (subcode),
  CONSTRAINT Teacher_Subject_FK FOREIGN KEY (subcode) REFERENCES Subject (subcode)
);

INSERT INTO Teacher VALUES
(1,'홍길동','700918-1622011','031-295-1234','성남시 중원구 신흥동','kkk@jok.or.kr','j1001'),
(2,'유관순','710419-2018916','02-345-2345','서울 강남구 개포동','kkk@jok.or.kr','j1002'),
(3,'이승복','730112-1344911','031-1234-6789','서울시 강남구 논현동','sss@jok.or.kr','j1003'),
(4,'모택동','730301-1167623','031-567-5678','서울시 서초구 서초동','mmm@jok.or.kr','j1004'),
(5,'주롱지','730322-2037921','031-789-3456','서울시 강서구 가양동','xxx@jok.or.kr','j1005'),
(6,'이순신','731122-1646213','031-234-8901','서울시 강북구 미아동','ppp@jok.or.kr','j1006');

-- 수강과목
CREATE TABLE SugangTB (
  subcode varchar(5) NOT NULL,
  roomnum int(11) DEFAULT NULL,
  time int(11) NOT NULL,
  teachernum int(11) DEFAULT NULL,
  PRIMARY KEY (subcode),
  CONSTRAINT SugangTB_Room_FK FOREIGN KEY (roomnum) REFERENCES Room (roomnum),
  CONSTRAINT SugangTB_Subject_FK FOREIGN KEY (subcode) REFERENCES Subject (subcode),
  CONSTRAINT SugangTB_Teacher_FK FOREIGN KEY (teachernum) REFERENCES Teacher (teachernum)
);


INSERT INTO SugangTB VALUES
('j1001',901,2,1),
('j1002',902,2,2),
('j1003',903,2,3),
('j1004',904,2,4),
('j1005',905,2,5),
('j1006',906,2,6);


('j1003',903,2,3),
('j1004',904,2,4),
('j1005',905,2,5),
('j1006',906,2,6);

