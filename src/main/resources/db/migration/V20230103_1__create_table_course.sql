CREATE TABLE if not exists course (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
   cid VARCHAR(20),
   institution VARCHAR(80),
   "name" VARCHAR(80),
   "type" VARCHAR(80),
   CONSTRAINT pk_course PRIMARY KEY (id)
);