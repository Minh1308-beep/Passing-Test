CREATE TABLE CLASS_ROOM (
                         id long auto_increment primary key,
                         name varchar(255) not null
);

CREATE TABLE STUDENT (
                         id long auto_increment primary key,
                         name varchar(255) not null,
                         major varchar(255) not null,
                         CLASS_ROOM_id Long,
                         FOREIGN KEY (CLASS_ROOM_id) REFERENCES classroom(id)
);

-- Insert data for classrooms
INSERT INTO CLASS_ROOM (name) VALUES ('K15DCPM06');
INSERT INTO CLASS_ROOM (name) VALUES ('K15DCPM07');

-- Insert data for students
INSERT INTO STUDENT (name, major, CLASS_ROOM_id) VALUES ('Minh', 'Engineering', 1);
INSERT INTO STUDENT (name, major, CLASS_ROOM_id) VALUES ('Nam', 'Education', 1);
INSERT INTO STUDENT (name, major, CLASS_ROOM_id) VALUES ('Quang', 'Social Sciences', 2);
INSERT INTO STUDENT (name, major, CLASS_ROOM_id) VALUES ('Nhi', 'Pulishing', 2);
